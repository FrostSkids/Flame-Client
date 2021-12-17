// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.client.resources.IResourceManager;
import org.apache.logging.log4j.LogManager;
import net.minecraft.item.EnumDyeColor;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.ResourceLocation;
import java.util.List;

public class LayeredColorMaskTexture extends AbstractTexture
{
    private final /* synthetic */ List<String> field_174949_h;
    private static final /* synthetic */ int[] lIlIIIlIlIllll;
    private final /* synthetic */ ResourceLocation textureLocation;
    private final /* synthetic */ List<EnumDyeColor> field_174950_i;
    
    private static boolean lllIIIlIllIlIlI(final int lllllllllllllIIIlllllIIlllIIIIII) {
        return lllllllllllllIIIlllllIIlllIIIIII != 0;
    }
    
    private static boolean lllIIIlIllIlIll(final int lllllllllllllIIIlllllIIlllIIlIIl, final int lllllllllllllIIIlllllIIlllIIlIII) {
        return lllllllllllllIIIlllllIIlllIIlIIl >= lllllllllllllIIIlllllIIlllIIlIII;
    }
    
    private static boolean lllIIIlIllIllII(final int lllllllllllllIIIlllllIIlllIIIlIl, final int lllllllllllllIIIlllllIIlllIIIlII) {
        return lllllllllllllIIIlllllIIlllIIIlIl < lllllllllllllIIIlllllIIlllIIIlII;
    }
    
    static {
        lllIIIlIllIIllI();
        lllIIIlIllIIIll();
        LOG = LogManager.getLogger();
    }
    
    private static boolean lllIIIlIllIIlll(final int lllllllllllllIIIlllllIIllIlllllI) {
        return lllllllllllllIIIlllllIIllIlllllI == 0;
    }
    
    public LayeredColorMaskTexture(final ResourceLocation lllllllllllllIIIlllllIlIIIIlIlII, final List<String> lllllllllllllIIIlllllIlIIIIlIlll, final List<EnumDyeColor> lllllllllllllIIIlllllIlIIIIlIIlI) {
        this.textureLocation = lllllllllllllIIIlllllIlIIIIlIlII;
        this.field_174949_h = lllllllllllllIIIlllllIlIIIIlIlll;
        this.field_174950_i = lllllllllllllIIIlllllIlIIIIlIIlI;
    }
    
    private static void lllIIIlIllIIIll() {
        (lIlIIIlIlIlIIl = new String[LayeredColorMaskTexture.lIlIIIlIlIllll[7]])[LayeredColorMaskTexture.lIlIIIlIlIllll[1]] = lllIIIlIllIIIlI("aM1YszHr3OaMa/51/6Qayjs5f7BJRKOh8nA3tU45Wkw=", "ZgAzY");
    }
    
    @Override
    public void loadTexture(final IResourceManager lllllllllllllIIIlllllIIlllllllll) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   net/minecraft/client/renderer/texture/LayeredColorMaskTexture.deleteGlTexture:()V
        //     4: aload_1         /* lllllllllllllIIIlllllIIllllIllII */
        //     5: aload_0         /* lllllllllllllIIIlllllIlIIIIIIIII */
        //     6: getfield        net/minecraft/client/renderer/texture/LayeredColorMaskTexture.textureLocation:Lnet/minecraft/util/ResourceLocation;
        //     9: invokeinterface net/minecraft/client/resources/IResourceManager.getResource:(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource;
        //    14: invokeinterface net/minecraft/client/resources/IResource.getInputStream:()Ljava/io/InputStream;
        //    19: invokestatic    net/minecraft/client/renderer/texture/TextureUtil.readBufferedImage:(Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
        //    22: astore_3        /* lllllllllllllIIIlllllIIlllllllII */
        //    23: aload_3         /* lllllllllllllIIIlllllIIlllllllII */
        //    24: invokevirtual   java/awt/image/BufferedImage.getType:()I
        //    27: istore          lllllllllllllIIIlllllIIllllllIll
        //    29: iload           lllllllllllllIIIlllllIIllllllIll
        //    31: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIIlll:(I)Z
        //    34: ifeq            44
        //    37: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //    40: iconst_0       
        //    41: iaload         
        //    42: istore          lllllllllllllIIIlllllIIllllllIll
        //    44: new             Ljava/awt/image/BufferedImage;
        //    47: dup            
        //    48: aload_3         /* lllllllllllllIIIlllllIIlllllllII */
        //    49: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //    52: aload_3         /* lllllllllllllIIIlllllIIlllllllII */
        //    53: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //    56: iload           lllllllllllllIIIlllllIIllllllIll
        //    58: invokespecial   java/awt/image/BufferedImage.<init>:(III)V
        //    61: astore_2        /* lllllllllllllIIIlllllIIllllIlIll */
        //    62: aload_2         /* lllllllllllllIIIlllllIIllllllllI */
        //    63: invokevirtual   java/awt/image/BufferedImage.getGraphics:()Ljava/awt/Graphics;
        //    66: astore          lllllllllllllIIIlllllIIllllllIlI
        //    68: aload           lllllllllllllIIIlllllIIllllllIlI
        //    70: aload_3         /* lllllllllllllIIIlllllIIlllllllII */
        //    71: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //    74: iconst_1       
        //    75: iaload         
        //    76: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //    79: iconst_1       
        //    80: iaload         
        //    81: aconst_null    
        //    82: invokevirtual   java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
        //    85: ldc             ""
        //    87: invokevirtual   java/lang/String.length:()I
        //    90: pop2           
        //    91: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //    94: iconst_1       
        //    95: iaload         
        //    96: istore          lllllllllllllIIIlllllIIllllllIIl
        //    98: ldc             ""
        //   100: invokevirtual   java/lang/String.length:()I
        //   103: pop            
        //   104: ldc             "  "
        //   106: invokevirtual   java/lang/String.length:()I
        //   109: ifne            433
        //   112: return         
        //   113: aload_0         /* lllllllllllllIIIlllllIlIIIIIIIII */
        //   114: getfield        net/minecraft/client/renderer/texture/LayeredColorMaskTexture.field_174949_h:Ljava/util/List;
        //   117: iload           lllllllllllllIIIlllllIIllllllIIl
        //   119: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   124: checkcast       Ljava/lang/String;
        //   127: astore          lllllllllllllIIIlllllIIllllllIII
        //   129: aload_0         /* lllllllllllllIIIlllllIlIIIIIIIII */
        //   130: getfield        net/minecraft/client/renderer/texture/LayeredColorMaskTexture.field_174950_i:Ljava/util/List;
        //   133: iload           lllllllllllllIIIlllllIIllllllIIl
        //   135: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   140: checkcast       Lnet/minecraft/item/EnumDyeColor;
        //   143: invokevirtual   net/minecraft/item/EnumDyeColor.getMapColor:()Lnet/minecraft/block/material/MapColor;
        //   146: astore          lllllllllllllIIIlllllIIlllllIlll
        //   148: aload           lllllllllllllIIIlllllIIllllllIII
        //   150: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIlIII:(Ljava/lang/Object;)Z
        //   153: ifeq            430
        //   156: aload_1         /* lllllllllllllIIIlllllIIllllIllII */
        //   157: new             Lnet/minecraft/util/ResourceLocation;
        //   160: dup            
        //   161: aload           lllllllllllllIIIlllllIIllllllIII
        //   163: invokespecial   net/minecraft/util/ResourceLocation.<init>:(Ljava/lang/String;)V
        //   166: invokeinterface net/minecraft/client/resources/IResourceManager.getResource:(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource;
        //   171: invokeinterface net/minecraft/client/resources/IResource.getInputStream:()Ljava/io/InputStream;
        //   176: astore          lllllllllllllIIIlllllIIlllllIllI
        //   178: aload           lllllllllllllIIIlllllIIlllllIllI
        //   180: invokestatic    net/minecraft/client/renderer/texture/TextureUtil.readBufferedImage:(Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
        //   183: astore          lllllllllllllIIIlllllIIlllllIlIl
        //   185: aload           lllllllllllllIIIlllllIIlllllIlIl
        //   187: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   190: aload_2         /* lllllllllllllIIIlllllIIllllllllI */
        //   191: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   194: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIlIIl:(II)Z
        //   197: ifeq            430
        //   200: aload           lllllllllllllIIIlllllIIlllllIlIl
        //   202: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   205: aload_2         /* lllllllllllllIIIlllllIIllllllllI */
        //   206: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   209: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIlIIl:(II)Z
        //   212: ifeq            430
        //   215: aload           lllllllllllllIIIlllllIIlllllIlIl
        //   217: invokevirtual   java/awt/image/BufferedImage.getType:()I
        //   220: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   223: iconst_0       
        //   224: iaload         
        //   225: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIlIIl:(II)Z
        //   228: ifeq            430
        //   231: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   234: iconst_1       
        //   235: iaload         
        //   236: istore          lllllllllllllIIIlllllIIlllllIlII
        //   238: ldc             ""
        //   240: invokevirtual   java/lang/String.length:()I
        //   243: pop            
        //   244: sipush          206
        //   247: sipush          186
        //   250: ixor           
        //   251: bipush          23
        //   253: bipush          102
        //   255: ixor           
        //   256: ixor           
        //   257: ifgt            391
        //   260: return         
        //   261: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   264: iconst_1       
        //   265: iaload         
        //   266: istore          lllllllllllllIIIlllllIIlllllIIll
        //   268: ldc             ""
        //   270: invokevirtual   java/lang/String.length:()I
        //   273: pop            
        //   274: bipush          65
        //   276: bipush          69
        //   278: ixor           
        //   279: ifgt            375
        //   282: return         
        //   283: aload           lllllllllllllIIIlllllIIlllllIlIl
        //   285: iload           lllllllllllllIIIlllllIIlllllIIll
        //   287: iload           lllllllllllllIIIlllllIIlllllIlII
        //   289: invokevirtual   java/awt/image/BufferedImage.getRGB:(II)I
        //   292: istore          lllllllllllllIIIlllllIIlllllIIlI
        //   294: iload           lllllllllllllIIIlllllIIlllllIIlI
        //   296: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   299: iconst_2       
        //   300: iaload         
        //   301: iand           
        //   302: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIlIlI:(I)Z
        //   305: ifeq            372
        //   308: iload           lllllllllllllIIIlllllIIlllllIIlI
        //   310: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   313: iconst_3       
        //   314: iaload         
        //   315: iand           
        //   316: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   319: iconst_4       
        //   320: iaload         
        //   321: ishl           
        //   322: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   325: iconst_2       
        //   326: iaload         
        //   327: iand           
        //   328: istore          lllllllllllllIIIlllllIIlllllIIIl
        //   330: aload_3         /* lllllllllllllIIIlllllIIlllllllII */
        //   331: iload           lllllllllllllIIIlllllIIlllllIIll
        //   333: iload           lllllllllllllIIIlllllIIlllllIlII
        //   335: invokevirtual   java/awt/image/BufferedImage.getRGB:(II)I
        //   338: istore          lllllllllllllIIIlllllIIlllllIIII
        //   340: iload           lllllllllllllIIIlllllIIlllllIIII
        //   342: aload           lllllllllllllIIIlllllIIlllllIlll
        //   344: getfield        net/minecraft/block/material/MapColor.colorValue:I
        //   347: invokestatic    net/minecraft/util/MathHelper.func_180188_d:(II)I
        //   350: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   353: iconst_5       
        //   354: iaload         
        //   355: iand           
        //   356: istore          lllllllllllllIIIlllllIIllllIllll
        //   358: aload           lllllllllllllIIIlllllIIlllllIlIl
        //   360: iload           lllllllllllllIIIlllllIIlllllIIll
        //   362: iload           lllllllllllllIIIlllllIIlllllIlII
        //   364: iload           lllllllllllllIIIlllllIIlllllIIIl
        //   366: iload           lllllllllllllIIIlllllIIllllIllll
        //   368: ior            
        //   369: invokevirtual   java/awt/image/BufferedImage.setRGB:(III)V
        //   372: iinc            lllllllllllllIIIlllllIIlllllIIll, 1
        //   375: iload           lllllllllllllIIIlllllIIlllllIIll
        //   377: aload           lllllllllllllIIIlllllIIlllllIlIl
        //   379: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   382: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIlIll:(II)Z
        //   385: ifeq            283
        //   388: iinc            lllllllllllllIIIlllllIIlllllIlII, 1
        //   391: iload           lllllllllllllIIIlllllIIlllllIlII
        //   393: aload           lllllllllllllIIIlllllIIlllllIlIl
        //   395: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   398: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIlIll:(II)Z
        //   401: ifeq            261
        //   404: aload_2         /* lllllllllllllIIIlllllIIllllllllI */
        //   405: invokevirtual   java/awt/image/BufferedImage.getGraphics:()Ljava/awt/Graphics;
        //   408: aload           lllllllllllllIIIlllllIIlllllIlIl
        //   410: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   413: iconst_1       
        //   414: iaload         
        //   415: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   418: iconst_1       
        //   419: iaload         
        //   420: aconst_null    
        //   421: invokevirtual   java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
        //   424: ldc             ""
        //   426: invokevirtual   java/lang/String.length:()I
        //   429: pop2           
        //   430: iinc            lllllllllllllIIIlllllIIllllllIIl, 1
        //   433: iload           lllllllllllllIIIlllllIIllllllIIl
        //   435: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   438: bipush          6
        //   440: iaload         
        //   441: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIllII:(II)Z
        //   444: ifeq            531
        //   447: iload           lllllllllllllIIIlllllIIllllllIIl
        //   449: aload_0         /* lllllllllllllIIIlllllIlIIIIIIIII */
        //   450: getfield        net/minecraft/client/renderer/texture/LayeredColorMaskTexture.field_174949_h:Ljava/util/List;
        //   453: invokeinterface java/util/List.size:()I
        //   458: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIllII:(II)Z
        //   461: ifeq            531
        //   464: iload           lllllllllllllIIIlllllIIllllllIIl
        //   466: aload_0         /* lllllllllllllIIIlllllIlIIIIIIIII */
        //   467: getfield        net/minecraft/client/renderer/texture/LayeredColorMaskTexture.field_174950_i:Ljava/util/List;
        //   470: invokeinterface java/util/List.size:()I
        //   475: invokestatic    net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lllIIIlIllIlIll:(II)Z
        //   478: ifeq            113
        //   481: ldc             ""
        //   483: invokevirtual   java/lang/String.length:()I
        //   486: pop            
        //   487: bipush          32
        //   489: bipush          36
        //   491: ixor           
        //   492: sipush          235
        //   495: sipush          137
        //   498: ixor           
        //   499: bipush          76
        //   501: bipush          46
        //   503: ixor           
        //   504: iconst_m1      
        //   505: ixor           
        //   506: iand           
        //   507: if_icmpne       531
        //   510: return         
        //   511: astore_3        /* lllllllllllllIIIlllllIIllllIlllI */
        //   512: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.LOG:Lorg/apache/logging/log4j/Logger;
        //   515: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIlIIl:[Ljava/lang/String;
        //   518: getstatic       net/minecraft/client/renderer/texture/LayeredColorMaskTexture.lIlIIIlIlIllll:[I
        //   521: iconst_1       
        //   522: iaload         
        //   523: aaload         
        //   524: aload_3         /* lllllllllllllIIIlllllIIllllIlllI */
        //   525: invokeinterface org/apache/logging/log4j/Logger.error:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   530: return         
        //   531: aload_0         /* lllllllllllllIIIlllllIlIIIIIIIII */
        //   532: invokevirtual   net/minecraft/client/renderer/texture/LayeredColorMaskTexture.getGlTextureId:()I
        //   535: aload_2         /* lllllllllllllIIIlllllIIlllllllIl */
        //   536: invokestatic    net/minecraft/client/renderer/texture/TextureUtil.uploadTextureImage:(ILjava/awt/image/BufferedImage;)I
        //   539: ldc             ""
        //   541: invokevirtual   java/lang/String.length:()I
        //   544: pop2           
        //   545: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    StackMapTable: 00 0B FE 00 2C 00 07 00 70 01 FF 00 44 00 07 07 00 02 07 00 5E 07 00 70 07 00 70 01 07 00 85 01 00 00 FF 00 93 00 0C 07 00 02 07 00 5E 07 00 70 07 00 70 01 07 00 85 01 07 00 4B 07 00 B0 07 00 FF 07 00 70 01 00 00 FC 00 15 01 FC 00 58 01 FA 00 02 FA 00 0F F8 00 26 F9 00 02 FF 00 4D 00 02 07 00 02 07 00 5E 00 01 07 00 59 FF 00 13 00 07 07 00 02 07 00 5E 07 00 70 07 00 70 01 07 00 85 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      481    511    531    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lllIIIlIllIlIIl(final int lllllllllllllIIIlllllIIlllIIllIl, final int lllllllllllllIIIlllllIIlllIIllII) {
        return lllllllllllllIIIlllllIIlllIIllIl == lllllllllllllIIIlllllIIlllIIllII;
    }
    
    private static boolean lllIIIlIllIlIII(final Object lllllllllllllIIIlllllIIlllIIIIlI) {
        return lllllllllllllIIIlllllIIlllIIIIlI != null;
    }
    
    private static void lllIIIlIllIIllI() {
        (lIlIIIlIlIllll = new int[9])[0] = (51 + 111 - 11 + 16 ^ 153 + 92 - 181 + 97);
        LayeredColorMaskTexture.lIlIIIlIlIllll[1] = ((52 + 152 - 43 + 23 ^ 89 + 6 - 50 + 138) & (0xB5 ^ 0x97 ^ (0x45 ^ 0x68) ^ -" ".length()));
        LayeredColorMaskTexture.lIlIIIlIlIllll[2] = -(-(0xFFFFFF73 & 0x67DE) & (0xFFFFFFD3 & 0x100677D));
        LayeredColorMaskTexture.lIlIIIlIlIllll[3] = (-(0xFFFFF3FE & 0x5FEB) & (0xFFFFFFFD & 0xFF53EB));
        LayeredColorMaskTexture.lIlIIIlIlIllll[4] = (0xC ^ 0x4);
        LayeredColorMaskTexture.lIlIIIlIlIllll[5] = (-" ".length() & (-1 & 0xFFFFFF));
        LayeredColorMaskTexture.lIlIIIlIlIllll[6] = (0x6E ^ 0x7F);
        LayeredColorMaskTexture.lIlIIIlIlIllll[7] = " ".length();
        LayeredColorMaskTexture.lIlIIIlIlIllll[8] = "  ".length();
    }
    
    private static String lllIIIlIllIIIlI(final String lllllllllllllIIIlllllIIlllIlIIll, final String lllllllllllllIIIlllllIIlllIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlllllIIlllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllllIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllllIIlllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllllIIlllIlIlll.init(LayeredColorMaskTexture.lIlIIIlIlIllll[8], lllllllllllllIIIlllllIIlllIllIII);
            return new String(lllllllllllllIIIlllllIIlllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllllIIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllllIIlllIlIllI) {
            lllllllllllllIIIlllllIIlllIlIllI.printStackTrace();
            return null;
        }
    }
}
