// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import net.minecraft.client.resources.IResourceManager;
import java.util.List;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.ArabicShaping;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import java.util.Locale;
import org.lwjgl.opengl.GL11;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import java.util.Arrays;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.texture.TextureManager;
import java.util.Random;
import net.minecraft.client.resources.IResourceManagerReloadListener;

public class FontRenderer implements IResourceManagerReloadListener
{
    private /* synthetic */ float posY;
    private /* synthetic */ boolean bidiFlag;
    private /* synthetic */ float red;
    public /* synthetic */ Random fontRandom;
    private final /* synthetic */ TextureManager renderEngine;
    private final /* synthetic */ ResourceLocation locationFontTexture;
    private static final /* synthetic */ ResourceLocation[] unicodePageLocations;
    private /* synthetic */ float green;
    public /* synthetic */ int FONT_HEIGHT;
    private /* synthetic */ boolean unicodeFlag;
    private static final /* synthetic */ String[] lIllIlIIllllll;
    private static final /* synthetic */ int[] lIllIlIlIIIlll;
    private /* synthetic */ float blue;
    private /* synthetic */ int[] colorCode;
    private /* synthetic */ byte[] glyphWidth;
    private /* synthetic */ boolean underlineStyle;
    private /* synthetic */ boolean boldStyle;
    private /* synthetic */ int[] charWidth;
    private /* synthetic */ int textColor;
    private /* synthetic */ boolean italicStyle;
    private /* synthetic */ boolean randomStyle;
    private /* synthetic */ boolean strikethroughStyle;
    private /* synthetic */ float posX;
    private /* synthetic */ float alpha;
    
    private void readFontTexture() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   net/minecraft/client/Minecraft.getResourceManager:()Lnet/minecraft/client/resources/IResourceManager;
        //     6: aload_0         /* llllllllllllIlllllllIlIllIIIllIl */
        //     7: getfield        net/minecraft/client/gui/FontRenderer.locationFontTexture:Lnet/minecraft/util/ResourceLocation;
        //    10: invokeinterface net/minecraft/client/resources/IResourceManager.getResource:(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource;
        //    15: invokeinterface net/minecraft/client/resources/IResource.getInputStream:()Ljava/io/InputStream;
        //    20: invokestatic    net/minecraft/client/renderer/texture/TextureUtil.readBufferedImage:(Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
        //    23: astore_1        /* llllllllllllIlllllllIlIllIIIllII */
        //    24: ldc             ""
        //    26: invokevirtual   java/lang/String.length:()I
        //    29: pop            
        //    30: ldc             "   "
        //    32: invokevirtual   java/lang/String.length:()I
        //    35: ifne            49
        //    38: return         
        //    39: astore_2        /* llllllllllllIlllllllIlIllIIlllIl */
        //    40: new             Ljava/lang/RuntimeException;
        //    43: dup            
        //    44: aload_2         /* llllllllllllIlllllllIlIllIIlllIl */
        //    45: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //    48: athrow         
        //    49: aload_1         /* llllllllllllIlllllllIlIllIIllllI */
        //    50: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //    53: istore_2        /* llllllllllllIlllllllIlIllIIlllII */
        //    54: aload_1         /* llllllllllllIlllllllIlIllIIllllI */
        //    55: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //    58: istore_3        /* llllllllllllIlllllllIlIllIIllIll */
        //    59: iload_2         /* llllllllllllIlllllllIlIllIIlllII */
        //    60: iload_3         /* llllllllllllIlllllllIlIllIIllIll */
        //    61: imul           
        //    62: newarray        I
        //    64: astore          llllllllllllIlllllllIlIllIIllIlI
        //    66: aload_1         /* llllllllllllIlllllllIlIllIIllllI */
        //    67: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //    70: iconst_4       
        //    71: iaload         
        //    72: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //    75: iconst_4       
        //    76: iaload         
        //    77: iload_2         /* llllllllllllIlllllllIlIllIIlllII */
        //    78: iload_3         /* llllllllllllIlllllllIlIllIIllIll */
        //    79: aload           llllllllllllIlllllllIlIllIIllIlI
        //    81: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //    84: iconst_4       
        //    85: iaload         
        //    86: iload_2         /* llllllllllllIlllllllIlIllIIlllII */
        //    87: invokevirtual   java/awt/image/BufferedImage.getRGB:(IIII[III)[I
        //    90: ldc             ""
        //    92: invokevirtual   java/lang/String.length:()I
        //    95: pop2           
        //    96: iload_3         /* llllllllllllIlllllllIlIllIIllIll */
        //    97: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   100: bipush          16
        //   102: iaload         
        //   103: idiv           
        //   104: istore          llllllllllllIlllllllIlIllIIllIIl
        //   106: iload_2         /* llllllllllllIlllllllIlIllIIlllII */
        //   107: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   110: bipush          16
        //   112: iaload         
        //   113: idiv           
        //   114: istore          llllllllllllIlllllllIlIllIIllIII
        //   116: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   119: bipush          6
        //   121: iaload         
        //   122: istore          llllllllllllIlllllllIlIllIIlIlll
        //   124: ldc             8.0
        //   126: iload           llllllllllllIlllllllIlIllIIllIII
        //   128: i2f            
        //   129: fdiv           
        //   130: fstore          llllllllllllIlllllllIlIllIIlIllI
        //   132: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   135: iconst_4       
        //   136: iaload         
        //   137: istore          llllllllllllIlllllllIlIllIIlIlIl
        //   139: ldc             ""
        //   141: invokevirtual   java/lang/String.length:()I
        //   144: pop            
        //   145: ldc             "  "
        //   147: invokevirtual   java/lang/String.length:()I
        //   150: ineg           
        //   151: ifle            478
        //   154: return         
        //   155: iload           llllllllllllIlllllllIlIllIIlIlIl
        //   157: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   160: bipush          16
        //   162: iaload         
        //   163: irem           
        //   164: istore          llllllllllllIlllllllIlIllIIlIlII
        //   166: iload           llllllllllllIlllllllIlIllIIlIlIl
        //   168: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   171: bipush          16
        //   173: iaload         
        //   174: idiv           
        //   175: istore          llllllllllllIlllllllIlIllIIlIIll
        //   177: iload           llllllllllllIlllllllIlIllIIlIlIl
        //   179: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   182: iconst_3       
        //   183: iaload         
        //   184: invokestatic    net/minecraft/client/gui/FontRenderer.llllllIlIIllIII:(II)Z
        //   187: ifeq            205
        //   190: aload_0         /* llllllllllllIlllllllIlIllIIIllIl */
        //   191: getfield        net/minecraft/client/gui/FontRenderer.charWidth:[I
        //   194: iload           llllllllllllIlllllllIlIllIIlIlIl
        //   196: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   199: iconst_5       
        //   200: iaload         
        //   201: iload           llllllllllllIlllllllIlIllIIlIlll
        //   203: iadd           
        //   204: iastore        
        //   205: iload           llllllllllllIlllllllIlIllIIllIII
        //   207: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   210: bipush          6
        //   212: iaload         
        //   213: isub           
        //   214: istore          llllllllllllIlllllllIlIllIIlIIlI
        //   216: ldc             ""
        //   218: invokevirtual   java/lang/String.length:()I
        //   221: pop            
        //   222: bipush          61
        //   224: bipush          78
        //   226: ixor           
        //   227: bipush          26
        //   229: bipush          108
        //   231: ixor           
        //   232: ixor           
        //   233: ineg           
        //   234: iflt            442
        //   237: return         
        //   238: iload           llllllllllllIlllllllIlIllIIlIlII
        //   240: iload           llllllllllllIlllllllIlIllIIllIII
        //   242: imul           
        //   243: iload           llllllllllllIlllllllIlIllIIlIIlI
        //   245: iadd           
        //   246: istore          llllllllllllIlllllllIlIllIIlIIIl
        //   248: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   251: bipush          6
        //   253: iaload         
        //   254: istore          llllllllllllIlllllllIlIllIIlIIII
        //   256: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   259: iconst_4       
        //   260: iaload         
        //   261: istore          llllllllllllIlllllllIlIllIIIllll
        //   263: ldc             ""
        //   265: invokevirtual   java/lang/String.length:()I
        //   268: pop            
        //   269: bipush          117
        //   271: iconst_0       
        //   272: ixor           
        //   273: bipush          28
        //   275: bipush          109
        //   277: ixor           
        //   278: ixor           
        //   279: bipush          36
        //   281: bipush          21
        //   283: iadd           
        //   284: bipush          49
        //   286: isub           
        //   287: sipush          156
        //   290: iadd           
        //   291: bipush          22
        //   293: bipush          47
        //   295: iadd           
        //   296: bipush          -43
        //   298: isub           
        //   299: bipush          16
        //   301: iadd           
        //   302: ixor           
        //   303: bipush          115
        //   305: bipush          27
        //   307: iadd           
        //   308: bipush          -29
        //   310: isub           
        //   311: bipush          16
        //   313: iadd           
        //   314: bipush          69
        //   316: bipush          92
        //   318: iadd           
        //   319: bipush          97
        //   321: isub           
        //   322: bipush          95
        //   324: iadd           
        //   325: ixor           
        //   326: ldc             " "
        //   328: invokevirtual   java/lang/String.length:()I
        //   331: ineg           
        //   332: ixor           
        //   333: iand           
        //   334: if_icmpgt       388
        //   337: return         
        //   338: iload           llllllllllllIlllllllIlIllIIlIIll
        //   340: iload           llllllllllllIlllllllIlIllIIllIII
        //   342: imul           
        //   343: iload           llllllllllllIlllllllIlIllIIIllll
        //   345: iadd           
        //   346: iload_2         /* llllllllllllIlllllllIlIllIIlllII */
        //   347: imul           
        //   348: istore          llllllllllllIlllllllIlIllIIIlllI
        //   350: aload           llllllllllllIlllllllIlIllIIllIlI
        //   352: iload           llllllllllllIlllllllIlIllIIlIIIl
        //   354: iload           llllllllllllIlllllllIlIllIIIlllI
        //   356: iadd           
        //   357: iaload         
        //   358: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   361: bipush          20
        //   363: iaload         
        //   364: ishr           
        //   365: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   368: bipush          18
        //   370: iaload         
        //   371: iand           
        //   372: invokestatic    net/minecraft/client/gui/FontRenderer.llllllIlIIllIIl:(I)Z
        //   375: ifeq            385
        //   378: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   381: iconst_4       
        //   382: iaload         
        //   383: istore          llllllllllllIlllllllIlIllIIlIIII
        //   385: iinc            llllllllllllIlllllllIlIllIIIllll, 1
        //   388: iload           llllllllllllIlllllllIlIllIIIllll
        //   390: iload           llllllllllllIlllllllIlIllIIllIIl
        //   392: invokestatic    net/minecraft/client/gui/FontRenderer.llllllIlIIllIll:(II)Z
        //   395: ifeq            406
        //   398: iload           llllllllllllIlllllllIlIllIIlIIII
        //   400: invokestatic    net/minecraft/client/gui/FontRenderer.llllllIlIIlllII:(I)Z
        //   403: ifeq            338
        //   406: iload           llllllllllllIlllllllIlIllIIlIIII
        //   408: invokestatic    net/minecraft/client/gui/FontRenderer.llllllIlIIlllII:(I)Z
        //   411: ifeq            439
        //   414: ldc             ""
        //   416: invokevirtual   java/lang/String.length:()I
        //   419: pop            
        //   420: sipush          200
        //   423: sipush          195
        //   426: ixor           
        //   427: bipush          118
        //   429: bipush          125
        //   431: ixor           
        //   432: iconst_m1      
        //   433: ixor           
        //   434: iand           
        //   435: ifle            450
        //   438: return         
        //   439: iinc            llllllllllllIlllllllIlIllIIlIIlI, -1
        //   442: iload           llllllllllllIlllllllIlIllIIlIIlI
        //   444: invokestatic    net/minecraft/client/gui/FontRenderer.llllllIlIIlllIl:(I)Z
        //   447: ifeq            238
        //   450: iinc            llllllllllllIlllllllIlIllIIlIIlI, 1
        //   453: aload_0         /* llllllllllllIlllllllIlIllIIIllIl */
        //   454: getfield        net/minecraft/client/gui/FontRenderer.charWidth:[I
        //   457: iload           llllllllllllIlllllllIlIllIIlIlIl
        //   459: ldc2_w          0.5
        //   462: iload           llllllllllllIlllllllIlIllIIlIIlI
        //   464: i2f            
        //   465: fload           llllllllllllIlllllllIlIllIIlIllI
        //   467: fmul           
        //   468: f2d            
        //   469: dadd           
        //   470: d2i            
        //   471: iload           llllllllllllIlllllllIlIllIIlIlll
        //   473: iadd           
        //   474: iastore        
        //   475: iinc            llllllllllllIlllllllIlIllIIlIlIl, 1
        //   478: iload           llllllllllllIlllllllIlIllIIlIlIl
        //   480: getstatic       net/minecraft/client/gui/FontRenderer.lIllIlIlIIIlll:[I
        //   483: iconst_0       
        //   484: iaload         
        //   485: invokestatic    net/minecraft/client/gui/FontRenderer.llllllIlIIllIlI:(II)Z
        //   488: ifeq            155
        //   491: return         
        //    StackMapTable: 00 0D 67 07 00 2C FC 00 09 07 00 5C FF 00 69 00 0A 07 00 02 07 00 5C 01 01 07 00 B2 01 01 01 02 01 00 00 FD 00 31 01 01 FC 00 20 01 FE 00 63 01 01 01 FC 00 2E 01 FA 00 02 11 20 F8 00 02 07 F8 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      24     39     49     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setUnicodeFlag(final boolean llllllllllllIlllllllIIllllllllIl) {
        this.unicodeFlag = llllllllllllIlllllllIIllllllllIl;
    }
    
    private static boolean llllllIlIIlllII(final int llllllllllllIlllllllIIllIlIIlIIl) {
        return llllllllllllIlllllllIIllIlIIlIIl == 0;
    }
    
    private static boolean llllllIlIIllIII(final int llllllllllllIlllllllIIllIllIIIlI, final int llllllllllllIlllllllIIllIllIIIIl) {
        return llllllllllllIlllllllIIllIllIIIlI == llllllllllllIlllllllIIllIllIIIIl;
    }
    
    public String trimStringToWidth(final String llllllllllllIlllllllIlIIIllIIIIl, final int llllllllllllIlllllllIlIIIllIIIll) {
        return this.trimStringToWidth(llllllllllllIlllllllIlIIIllIIIIl, llllllllllllIlllllllIlIIIllIIIll, (boolean)(FontRenderer.lIllIlIlIIIlll[4] != 0));
    }
    
    public boolean getUnicodeFlag() {
        return this.unicodeFlag;
    }
    
    private static boolean llllllIlIIllllI(final int llllllllllllIlllllllIIllIlIIIIII, final int llllllllllllIlllllllIIllIIllllll) {
        return llllllllllllIlllllllIIllIlIIIIII != llllllllllllIlllllllIIllIIllllll;
    }
    
    public int splitStringWidth(final String llllllllllllIlllllllIlIIIIIIIlII, final int llllllllllllIlllllllIlIIIIIIIllI) {
        return this.FONT_HEIGHT * this.listFormattedStringToWidth(llllllllllllIlllllllIlIIIIIIIlII, llllllllllllIlllllllIlIIIIIIIllI).size();
    }
    
    private static boolean llllllIlIlIIIII(final int llllllllllllIlllllllIIllIlIIIlll) {
        return llllllllllllIlllllllIIllIlIIIlll >= 0;
    }
    
    private static boolean llllllIlIIllIlI(final int llllllllllllIlllllllIIllIlIllllI, final int llllllllllllIlllllllIIllIlIlllIl) {
        return llllllllllllIlllllllIIllIlIllllI >= llllllllllllIlllllllIIllIlIlllIl;
    }
    
    private static boolean llllllIlIIlllIl(final int llllllllllllIlllllllIIllIlIIIlIl) {
        return llllllllllllIlllllllIIllIlIIIlIl < 0;
    }
    
    private void resetStyles() {
        this.randomStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
        this.boldStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
        this.italicStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
        this.underlineStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
        this.strikethroughStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
    }
    
    public FontRenderer(final GameSettings llllllllllllIlllllllIlIlllIIlllI, final ResourceLocation llllllllllllIlllllllIlIlllIIllIl, final TextureManager llllllllllllIlllllllIlIllIllllll, final boolean llllllllllllIlllllllIlIllIlllllI) {
        this.charWidth = new int[FontRenderer.lIllIlIlIIIlll[0]];
        this.FONT_HEIGHT = FontRenderer.lIllIlIlIIIlll[1];
        this.fontRandom = new Random();
        this.glyphWidth = new byte[FontRenderer.lIllIlIlIIIlll[2]];
        this.colorCode = new int[FontRenderer.lIllIlIlIIIlll[3]];
        this.locationFontTexture = llllllllllllIlllllllIlIlllIIllIl;
        this.renderEngine = llllllllllllIlllllllIlIllIllllll;
        this.unicodeFlag = llllllllllllIlllllllIlIllIlllllI;
        llllllllllllIlllllllIlIllIllllll.bindTexture(this.locationFontTexture);
        int llllllllllllIlllllllIlIlllIIlIlI = FontRenderer.lIllIlIlIIIlll[4];
        "".length();
        if (((0xA7 ^ 0x8B ^ (0xF7 ^ 0xBA)) & (0x24 ^ 0xD ^ (0x28 ^ 0x60) ^ -" ".length())) == (101 + 175 - 215 + 132 ^ 76 + 102 - 110 + 129)) {
            throw null;
        }
        while (!llllllIlIIllIlI(llllllllllllIlllllllIlIlllIIlIlI, FontRenderer.lIllIlIlIIIlll[3])) {
            final int llllllllllllIlllllllIlIlllIIlIIl = (llllllllllllIlllllllIlIlllIIlIlI >> FontRenderer.lIllIlIlIIIlll[5] & FontRenderer.lIllIlIlIIIlll[6]) * FontRenderer.lIllIlIlIIIlll[7];
            int llllllllllllIlllllllIlIlllIIlIII = (llllllllllllIlllllllIlIlllIIlIlI >> FontRenderer.lIllIlIlIIIlll[8] & FontRenderer.lIllIlIlIIIlll[6]) * FontRenderer.lIllIlIlIIIlll[9] + llllllllllllIlllllllIlIlllIIlIIl;
            int llllllllllllIlllllllIlIlllIIIlll = (llllllllllllIlllllllIlIlllIIlIlI >> FontRenderer.lIllIlIlIIIlll[6] & FontRenderer.lIllIlIlIIIlll[6]) * FontRenderer.lIllIlIlIIIlll[9] + llllllllllllIlllllllIlIlllIIlIIl;
            int llllllllllllIlllllllIlIlllIIIllI = (llllllllllllIlllllllIlIlllIIlIlI >> FontRenderer.lIllIlIlIIIlll[4] & FontRenderer.lIllIlIlIIIlll[6]) * FontRenderer.lIllIlIlIIIlll[9] + llllllllllllIlllllllIlIlllIIlIIl;
            if (llllllIlIIllIII(llllllllllllIlllllllIlIlllIIlIlI, FontRenderer.lIllIlIlIIIlll[10])) {
                llllllllllllIlllllllIlIlllIIlIII += 85;
            }
            if (llllllIlIIllIIl(llllllllllllIlllllllIlIlllIIlllI.anaglyph ? 1 : 0)) {
                final int llllllllllllIlllllllIlIlllIIIlIl = (llllllllllllIlllllllIlIlllIIlIII * FontRenderer.lIllIlIlIIIlll[11] + llllllllllllIlllllllIlIlllIIIlll * FontRenderer.lIllIlIlIIIlll[12] + llllllllllllIlllllllIlIlllIIIllI * FontRenderer.lIllIlIlIIIlll[13]) / FontRenderer.lIllIlIlIIIlll[14];
                final int llllllllllllIlllllllIlIlllIIIlII = (llllllllllllIlllllllIlIlllIIlIII * FontRenderer.lIllIlIlIIIlll[11] + llllllllllllIlllllllIlIlllIIIlll * FontRenderer.lIllIlIlIIIlll[15]) / FontRenderer.lIllIlIlIIIlll[14];
                final int llllllllllllIlllllllIlIlllIIIIll = (llllllllllllIlllllllIlIlllIIlIII * FontRenderer.lIllIlIlIIIlll[11] + llllllllllllIlllllllIlIlllIIIllI * FontRenderer.lIllIlIlIIIlll[15]) / FontRenderer.lIllIlIlIIIlll[14];
                llllllllllllIlllllllIlIlllIIlIII = llllllllllllIlllllllIlIlllIIIlIl;
                llllllllllllIlllllllIlIlllIIIlll = llllllllllllIlllllllIlIlllIIIlII;
                llllllllllllIlllllllIlIlllIIIllI = llllllllllllIlllllllIlIlllIIIIll;
            }
            if (llllllIlIIllIlI(llllllllllllIlllllllIlIlllIIlIlI, FontRenderer.lIllIlIlIIIlll[16])) {
                llllllllllllIlllllllIlIlllIIlIII /= FontRenderer.lIllIlIlIIIlll[17];
                llllllllllllIlllllllIlIlllIIIlll /= FontRenderer.lIllIlIlIIIlll[17];
                llllllllllllIlllllllIlIlllIIIllI /= FontRenderer.lIllIlIlIIIlll[17];
            }
            this.colorCode[llllllllllllIlllllllIlIlllIIlIlI] = ((llllllllllllIlllllllIlIlllIIlIII & FontRenderer.lIllIlIlIIIlll[18]) << FontRenderer.lIllIlIlIIIlll[16] | (llllllllllllIlllllllIlIlllIIIlll & FontRenderer.lIllIlIlIIIlll[18]) << FontRenderer.lIllIlIlIIIlll[19] | (llllllllllllIlllllllIlIlllIIIllI & FontRenderer.lIllIlIlIIIlll[18]));
            ++llllllllllllIlllllllIlIlllIIlIlI;
        }
        this.readGlyphSizes();
    }
    
    private static String llllllIlIIIllIl(final String llllllllllllIlllllllIIlllIIIllll, final String llllllllllllIlllllllIIlllIIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllllllIIlllIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIlllIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllIIlllIIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllIIlllIIlIIIl.init(FontRenderer.lIllIlIlIIIlll[8], llllllllllllIlllllllIIlllIIlIIlI);
            return new String(llllllllllllIlllllllIIlllIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIlllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIIlllIIlIIII) {
            llllllllllllIlllllllIIlllIIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllllIlIIllIIl(final int llllllllllllIlllllllIIllIlIIlIll) {
        return llllllllllllIlllllllIIllIlIIlIll != 0;
    }
    
    public int getColorCode(final char llllllllllllIlllllllIIlllIIllIIl) {
        return this.colorCode[FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[51]].indexOf(llllllllllllIlllllllIIlllIIllIIl)];
    }
    
    private static boolean llllllIlIlIIIIl(final int llllllllllllIlllllllIIllIlIlIIlI, final int llllllllllllIlllllllIIllIlIlIIIl) {
        return llllllllllllIlllllllIIllIlIlIIlI > llllllllllllIlllllllIIllIlIlIIIl;
    }
    
    public void setBidiFlag(final boolean llllllllllllIlllllllIIllllllIlII) {
        this.bidiFlag = llllllllllllIlllllllIIllllllIlII;
    }
    
    public int drawString(final String llllllllllllIlllllllIlIIlllllIIl, final float llllllllllllIlllllllIlIIlllllIII, final float llllllllllllIlllllllIlIIllllIlll, final int llllllllllllIlllllllIlIIllllIllI, final boolean llllllllllllIlllllllIlIIlllIllIl) {
        GlStateManager.enableAlpha();
        this.resetStyles();
        int llllllllllllIlllllllIlIIllllIIll = 0;
        if (llllllIlIIllIIl(llllllllllllIlllllllIlIIlllIllIl ? 1 : 0)) {
            int llllllllllllIlllllllIlIIllllIlII = this.renderString(llllllllllllIlllllllIlIIlllllIIl, llllllllllllIlllllllIlIIlllllIII + 1.0f, llllllllllllIlllllllIlIIllllIlll + 1.0f, llllllllllllIlllllllIlIIllllIllI, (boolean)(FontRenderer.lIllIlIlIIIlll[6] != 0));
            llllllllllllIlllllllIlIIllllIlII = Math.max(llllllllllllIlllllllIlIIllllIlII, this.renderString(llllllllllllIlllllllIlIIlllllIIl, llllllllllllIlllllllIlIIlllllIII, llllllllllllIlllllllIlIIllllIlll, llllllllllllIlllllllIlIIllllIllI, (boolean)(FontRenderer.lIllIlIlIIIlll[4] != 0)));
            "".length();
            if (-" ".length() != -" ".length()) {
                return (0x20 ^ 0x2E) & ~(0x9D ^ 0x93);
            }
        }
        else {
            llllllllllllIlllllllIlIIllllIIll = this.renderString(llllllllllllIlllllllIlIIlllllIIl, llllllllllllIlllllllIlIIlllllIII, llllllllllllIlllllllIlIIllllIlll, llllllllllllIlllllllIlIIllllIllI, (boolean)(FontRenderer.lIllIlIlIIIlll[4] != 0));
        }
        return llllllllllllIlllllllIlIIllllIIll;
    }
    
    private static void llllllIlIIlIlll() {
        (lIllIlIlIIIlll = new int[52])[0] = (0xFFFFDDEC & 0x2313);
        FontRenderer.lIllIlIlIIIlll[1] = (0x57 ^ 0x5E);
        FontRenderer.lIllIlIlIIIlll[2] = (-(0xFFFFDCFB & 0x3F7D) & (0xFFFFFF7A & 0x11CFD));
        FontRenderer.lIllIlIlIIIlll[3] = (82 + 78 - 37 + 64 ^ 69 + 102 - 26 + 10);
        FontRenderer.lIllIlIlIIIlll[4] = ("   ".length() & ("   ".length() ^ -" ".length()));
        FontRenderer.lIllIlIlIIIlll[5] = "   ".length();
        FontRenderer.lIllIlIlIIIlll[6] = " ".length();
        FontRenderer.lIllIlIlIIIlll[7] = (0xD0 ^ 0x85);
        FontRenderer.lIllIlIlIIIlll[8] = "  ".length();
        FontRenderer.lIllIlIlIIIlll[9] = 119 + 80 - 144 + 115;
        FontRenderer.lIllIlIlIIIlll[10] = (0x5A ^ 0x5C);
        FontRenderer.lIllIlIlIIIlll[11] = (93 + 132 - 190 + 120 ^ 18 + 76 + 4 + 35);
        FontRenderer.lIllIlIlIIIlll[12] = (0x7D ^ 0x28 ^ (0x2B ^ 0x45));
        FontRenderer.lIllIlIlIIIlll[13] = (0x2B ^ 0x20);
        FontRenderer.lIllIlIlIIIlll[14] = (0x22 ^ 0x47 ^ " ".length());
        FontRenderer.lIllIlIlIIIlll[15] = (0x68 ^ 0xE ^ (0x77 ^ 0x57));
        FontRenderer.lIllIlIlIIIlll[16] = (0x50 ^ 0x40);
        FontRenderer.lIllIlIlIIIlll[17] = (0x1B ^ 0x1F);
        FontRenderer.lIllIlIlIIIlll[18] = (0x3D ^ 0x6E) + (0x48 ^ 0x7D) - -(0xC4 ^ 0xAA) + (0x21 ^ 0x28);
        FontRenderer.lIllIlIlIIIlll[19] = (0x75 ^ 0x7D);
        FontRenderer.lIllIlIlIIIlll[20] = (25 + 211 - 66 + 49 ^ 153 + 145 - 181 + 78);
        FontRenderer.lIllIlIlIIIlll[21] = -" ".length();
        FontRenderer.lIllIlIlIIIlll[22] = (0x7E ^ 0x4D ^ (0x3E ^ 0x8));
        FontRenderer.lIllIlIlIIIlll[23] = (0x14 ^ 0x1B);
        FontRenderer.lIllIlIlIIIlll[24] = 6 + 20 + 60 + 41;
        FontRenderer.lIllIlIlIIIlll[25] = 139 + 68 - 182 + 142;
        FontRenderer.lIllIlIlIIIlll[26] = (0x24 ^ 0x35);
        FontRenderer.lIllIlIlIIIlll[27] = (0xBE ^ 0xAC);
        FontRenderer.lIllIlIlIIIlll[28] = (0x89 ^ 0x9A);
        FontRenderer.lIllIlIlIIIlll[29] = (0xF8 ^ 0xBA ^ (0x2E ^ 0x78));
        FontRenderer.lIllIlIlIIIlll[30] = (0x3C ^ 0x29);
        FontRenderer.lIllIlIlIIIlll[31] = (0x79 ^ 0x7E);
        FontRenderer.lIllIlIlIIIlll[32] = -(-(0xFFFFDCEF & 0x7F71) & (0xFFFFDE63 & 0x4007DFC));
        FontRenderer.lIllIlIlIIIlll[33] = -(0xFFFFB287 & 0x1004D78);
        FontRenderer.lIllIlIlIIIlll[34] = (-(0xFFFFD262 & 0x2F9F) & (0xFFFFFEFD & 0xFCFFFF));
        FontRenderer.lIllIlIlIIIlll[35] = (0x52 ^ 0x3E);
        FontRenderer.lIllIlIlIIIlll[36] = (0x39 ^ 0x75);
        FontRenderer.lIllIlIlIIIlll[37] = (0x20 ^ 0x52);
        FontRenderer.lIllIlIlIIIlll[38] = (0xFD ^ 0xAF);
        FontRenderer.lIllIlIlIIIlll[39] = (39 + 160 - 91 + 96 ^ 29 + 124 - 47 + 92);
        FontRenderer.lIllIlIlIIIlll[40] = (0x72 ^ 0x42);
        FontRenderer.lIllIlIlIIIlll[41] = (43 + 133 - 95 + 62 ^ 159 + 173 - 323 + 173);
        FontRenderer.lIllIlIlIIIlll[42] = (0xF9 ^ 0x98);
        FontRenderer.lIllIlIlIIIlll[43] = (0xF8 ^ 0x9E);
        FontRenderer.lIllIlIlIIIlll[44] = (0x13 ^ 0x3E ^ (0xE0 ^ 0x8C));
        FontRenderer.lIllIlIlIIIlll[45] = (0xE2 ^ 0x89);
        FontRenderer.lIllIlIlIIIlll[46] = (0x4D ^ 0x14 ^ (0x72 ^ 0x44));
        FontRenderer.lIllIlIlIIIlll[47] = (0x8 ^ 0x1D ^ (0xE2 ^ 0xBC));
        FontRenderer.lIllIlIlIIIlll[48] = (0x26 ^ 0x73 ^ (0x9F ^ 0x85));
        FontRenderer.lIllIlIlIIIlll[49] = (0x28 ^ 0x24);
        FontRenderer.lIllIlIlIIIlll[50] = (0xA6 ^ 0xAB);
        FontRenderer.lIllIlIlIIIlll[51] = (31 + 95 - 52 + 87 ^ 73 + 40 - 54 + 116);
    }
    
    public boolean getBidiFlag() {
        return this.bidiFlag;
    }
    
    private static boolean llllllIlIlIIIlI(final int llllllllllllIlllllllIIllIlIIIIll) {
        return llllllllllllIlllllllIIllIlIIIIll > 0;
    }
    
    private float func_181559_a(final char llllllllllllIlllllllIlIlIllIlIII, final boolean llllllllllllIlllllllIlIlIllIIlll) {
        if (llllllIlIIllIII(llllllllllllIlllllllIlIlIllIlIII, FontRenderer.lIllIlIlIIIlll[3])) {
            return 4.0f;
        }
        final int llllllllllllIlllllllIlIlIllIlIlI = FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[6]].indexOf(llllllllllllIlllllllIlIlIllIlIII);
        float n;
        if (llllllIlIIllllI(llllllllllllIlllllllIlIlIllIlIlI, FontRenderer.lIllIlIlIIIlll[21]) && llllllIlIIlllII(this.unicodeFlag ? 1 : 0)) {
            n = this.renderDefaultChar(llllllllllllIlllllllIlIlIllIlIlI, llllllllllllIlllllllIlIlIllIIlll);
            "".length();
            if (((0xB4 ^ 0xAD) & ~(0x29 ^ 0x30)) != 0x0) {
                return 0.0f;
            }
        }
        else {
            n = this.renderUnicodeChar(llllllllllllIlllllllIlIlIllIlIII, llllllllllllIlllllllIlIlIllIIlll);
        }
        return n;
    }
    
    public int drawString(final String llllllllllllIlllllllIlIlIIIIlIlI, final int llllllllllllIlllllllIlIlIIIIIlII, final int llllllllllllIlllllllIlIlIIIIlIII, final int llllllllllllIlllllllIlIlIIIIIIlI) {
        return this.drawString(llllllllllllIlllllllIlIlIIIIlIlI, (float)llllllllllllIlllllllIlIlIIIIIlII, (float)llllllllllllIlllllllIlIlIIIIlIII, llllllllllllIlllllllIlIlIIIIIIlI, (boolean)(FontRenderer.lIllIlIlIIIlll[4] != 0));
    }
    
    private static boolean llllllIlIIlllll(final Object llllllllllllIlllllllIIllIlIIllIl) {
        return llllllllllllIlllllllIIllIlIIllIl == null;
    }
    
    private static String llllllIlIIIllII(final String llllllllllllIlllllllIIlllIIIIIII, final String llllllllllllIlllllllIIlllIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllllllIIlllIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIlllIIIIIIl.getBytes(StandardCharsets.UTF_8)), FontRenderer.lIllIlIlIIIlll[19]), "DES");
            final Cipher llllllllllllIlllllllIIlllIIIIlII = Cipher.getInstance("DES");
            llllllllllllIlllllllIIlllIIIIlII.init(FontRenderer.lIllIlIlIIIlll[8], llllllllllllIlllllllIIlllIIIIlIl);
            return new String(llllllllllllIlllllllIIlllIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIlllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIIlllIIIIIll) {
            llllllllllllIlllllllIIlllIIIIIll.printStackTrace();
            return null;
        }
    }
    
    private void readGlyphSizes() {
        InputStream llllllllllllIlllllllIlIlIlllIlll = null;
        try {
            llllllllllllIlllllllIlIlIlllIlll = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[4]])).getInputStream();
            llllllllllllIlllllllIlIlIlllIlll.read(this.glyphWidth);
            "".length();
            "".length();
            if (-" ".length() >= (48 + 31 + 7 + 86 ^ 18 + 128 - 100 + 122)) {
                return;
            }
        }
        catch (IOException llllllllllllIlllllllIlIlIlllIllI) {
            throw new RuntimeException(llllllllllllIlllllllIlIlIlllIllI);
        }
        finally {
            IOUtils.closeQuietly(llllllllllllIlllllllIlIlIlllIlll);
        }
        IOUtils.closeQuietly(llllllllllllIlllllllIlIlIlllIlll);
    }
    
    private ResourceLocation getUnicodePageLocation(final int llllllllllllIlllllllIlIlIlIIlIlI) {
        if (llllllIlIIlllll(FontRenderer.unicodePageLocations[llllllllllllIlllllllIlIlIlIIlIlI])) {
            final ResourceLocation[] unicodePageLocations = FontRenderer.unicodePageLocations;
            final String format = FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[8]];
            final Object[] args = new Object[FontRenderer.lIllIlIlIIIlll[6]];
            args[FontRenderer.lIllIlIlIIIlll[4]] = llllllllllllIlllllllIlIlIlIIlIlI;
            unicodePageLocations[llllllllllllIlllllllIlIlIlIIlIlI] = new ResourceLocation(String.format(format, args));
        }
        return FontRenderer.unicodePageLocations[llllllllllllIlllllllIlIlIlIIlIlI];
    }
    
    private void renderSplitString(final String llllllllllllIlllllllIlIIIIIllIIl, final int llllllllllllIlllllllIlIIIIIlIIIl, int llllllllllllIlllllllIlIIIIIlIIII, final int llllllllllllIlllllllIlIIIIIlIllI, final boolean llllllllllllIlllllllIlIIIIIIlllI) {
        final byte llllllllllllIlllllllIlIIIIIIllII = (byte)this.listFormattedStringToWidth(llllllllllllIlllllllIlIIIIIllIIl, llllllllllllIlllllllIlIIIIIlIllI).iterator();
        "".length();
        if ((0x96 ^ 0x92) != (0xB ^ 0xF)) {
            return;
        }
        while (!llllllIlIIlllII(((Iterator)llllllllllllIlllllllIlIIIIIIllII).hasNext() ? 1 : 0)) {
            final String llllllllllllIlllllllIlIIIIIlIlII = ((Iterator<String>)llllllllllllIlllllllIlIIIIIIllII).next();
            this.renderStringAligned(llllllllllllIlllllllIlIIIIIlIlII, llllllllllllIlllllllIlIIIIIlIIIl, (int)llllllllllllIlllllllIlIIIIIlIIII, llllllllllllIlllllllIlIIIIIlIllI, this.textColor, llllllllllllIlllllllIlIIIIIIlllI);
            "".length();
            llllllllllllIlllllllIlIIIIIlIIII += this.FONT_HEIGHT;
        }
    }
    
    private float renderUnicodeChar(final char llllllllllllIlllllllIlIlIIlIlIlI, final boolean llllllllllllIlllllllIlIlIIlIlIIl) {
        if (llllllIlIIlllII(this.glyphWidth[llllllllllllIlllllllIlIlIIlIlIlI])) {
            return 0.0f;
        }
        final int llllllllllllIlllllllIlIlIIllIlII = llllllllllllIlllllllIlIlIIlIlIlI / FontRenderer.lIllIlIlIIIlll[0];
        this.loadGlyphTexture(llllllllllllIlllllllIlIlIIllIlII);
        final int llllllllllllIlllllllIlIlIIllIIll = this.glyphWidth[llllllllllllIlllllllIlIlIIlIlIlI] >>> FontRenderer.lIllIlIlIIIlll[17];
        final int llllllllllllIlllllllIlIlIIllIIlI = this.glyphWidth[llllllllllllIlllllllIlIlIIlIlIlI] & FontRenderer.lIllIlIlIIIlll[23];
        final float llllllllllllIlllllllIlIlIIllIIIl = (float)llllllllllllIlllllllIlIlIIllIIll;
        final float llllllllllllIlllllllIlIlIIllIIII = (float)(llllllllllllIlllllllIlIlIIllIIlI + FontRenderer.lIllIlIlIIIlll[6]);
        final float llllllllllllIlllllllIlIlIIlIllll = llllllllllllIlllllllIlIlIIlIlIlI % FontRenderer.lIllIlIlIIIlll[16] * FontRenderer.lIllIlIlIIIlll[16] + llllllllllllIlllllllIlIlIIllIIIl;
        final float llllllllllllIlllllllIlIlIIlIlllI = (float)((llllllllllllIlllllllIlIlIIlIlIlI & FontRenderer.lIllIlIlIIIlll[18]) / FontRenderer.lIllIlIlIIIlll[16] * FontRenderer.lIllIlIlIIIlll[16]);
        final float llllllllllllIlllllllIlIlIIlIllIl = llllllllllllIlllllllIlIlIIllIIII - llllllllllllIlllllllIlIlIIllIIIl - 0.02f;
        float n;
        if (llllllIlIIllIIl(llllllllllllIlllllllIlIlIIlIlIIl ? 1 : 0)) {
            n = 1.0f;
            "".length();
            if (-"   ".length() >= 0) {
                return 0.0f;
            }
        }
        else {
            n = 0.0f;
        }
        final float llllllllllllIlllllllIlIlIIlIllII = n;
        GL11.glBegin(FontRenderer.lIllIlIlIIIlll[22]);
        GL11.glTexCoord2f(llllllllllllIlllllllIlIlIIlIllll / 256.0f, llllllllllllIlllllllIlIlIIlIlllI / 256.0f);
        GL11.glVertex3f(this.posX + llllllllllllIlllllllIlIlIIlIllII, this.posY, 0.0f);
        GL11.glTexCoord2f(llllllllllllIlllllllIlIlIIlIllll / 256.0f, (llllllllllllIlllllllIlIlIIlIlllI + 15.98f) / 256.0f);
        GL11.glVertex3f(this.posX - llllllllllllIlllllllIlIlIIlIllII, this.posY + 7.99f, 0.0f);
        GL11.glTexCoord2f((llllllllllllIlllllllIlIlIIlIllll + llllllllllllIlllllllIlIlIIlIllIl) / 256.0f, llllllllllllIlllllllIlIlIIlIlllI / 256.0f);
        GL11.glVertex3f(this.posX + llllllllllllIlllllllIlIlIIlIllIl / 2.0f + llllllllllllIlllllllIlIlIIlIllII, this.posY, 0.0f);
        GL11.glTexCoord2f((llllllllllllIlllllllIlIlIIlIllll + llllllllllllIlllllllIlIlIIlIllIl) / 256.0f, (llllllllllllIlllllllIlIlIIlIlllI + 15.98f) / 256.0f);
        GL11.glVertex3f(this.posX + llllllllllllIlllllllIlIlIIlIllIl / 2.0f - llllllllllllIlllllllIlIlIIlIllII, this.posY + 7.99f, 0.0f);
        GL11.glEnd();
        return (llllllllllllIlllllllIlIlIIllIIII - llllllllllllIlllllllIlIlIIllIIIl) / 2.0f + 1.0f;
    }
    
    private String trimStringNewline(String llllllllllllIlllllllIlIIIIllIlIl) {
        "".length();
        if ("  ".length() < 0) {
            return null;
        }
        while (llllllIlIlIIlII(llllllllllllIlllllllIlIIIIllIlIl) && !llllllIlIIlllII(llllllllllllIlllllllIlIIIIllIlIl.endsWith(FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[19]]) ? 1 : 0)) {
            llllllllllllIlllllllIlIIIIllIlIl = llllllllllllIlllllllIlIIIIllIlIl.substring(FontRenderer.lIllIlIlIIIlll[4], llllllllllllIlllllllIlIIIIllIlIl.length() - FontRenderer.lIllIlIlIIIlll[6]);
        }
        return llllllllllllIlllllllIlIIIIllIlIl;
    }
    
    public void drawSplitString(String llllllllllllIlllllllIlIIIIlIIlll, final int llllllllllllIlllllllIlIIIIlIIllI, final int llllllllllllIlllllllIlIIIIlIIlIl, final int llllllllllllIlllllllIlIIIIlIlIlI, final int llllllllllllIlllllllIlIIIIlIIIll) {
        this.resetStyles();
        this.textColor = llllllllllllIlllllllIlIIIIlIIIll;
        llllllllllllIlllllllIlIIIIlIIlll = this.trimStringNewline(llllllllllllIlllllllIlIIIIlIIlll);
        this.renderSplitString(llllllllllllIlllllllIlIIIIlIIlll, llllllllllllIlllllllIlIIIIlIIllI, llllllllllllIlllllllIlIIIIlIIlIl, llllllllllllIlllllllIlIIIIlIlIlI, (boolean)(FontRenderer.lIllIlIlIIIlll[4] != 0));
    }
    
    private static boolean llllllIlIlIIlII(final Object llllllllllllIlllllllIIllIlIIllll) {
        return llllllllllllIlllllllIIllIlIIllll != null;
    }
    
    private int sizeStringToWidth(final String llllllllllllIlllllllIIllllIIIlll, final int llllllllllllIlllllllIIlllIllllII) {
        final int llllllllllllIlllllllIIllllIIIlIl = llllllllllllIlllllllIIllllIIIlll.length();
        int llllllllllllIlllllllIIllllIIIlII = FontRenderer.lIllIlIlIIIlll[4];
        int llllllllllllIlllllllIIllllIIIIll = FontRenderer.lIllIlIlIIIlll[4];
        int llllllllllllIlllllllIIllllIIIIlI = FontRenderer.lIllIlIlIIIlll[21];
        boolean llllllllllllIlllllllIIllllIIIIIl = FontRenderer.lIllIlIlIIIlll[4] != 0;
        "".length();
        if ((0xAD ^ 0xA9) <= " ".length()) {
            return (0x3B ^ 0x79) & ~(0x2D ^ 0x6F);
        }
        while (!llllllIlIIllIlI(llllllllllllIlllllllIIllllIIIIll, llllllllllllIlllllllIIllllIIIlIl)) {
            final char llllllllllllIlllllllIIllllIIIIII = llllllllllllIlllllllIIllllIIIlll.charAt(llllllllllllIlllllllIIllllIIIIll);
            Label_0418: {
                switch (llllllllllllIlllllllIIllllIIIIII) {
                    case '\n': {
                        --llllllllllllIlllllllIIllllIIIIll;
                        "".length();
                        if ((94 + 106 - 152 + 137 ^ 157 + 138 - 182 + 76) < -" ".length()) {
                            return ("  ".length() ^ (0x7E ^ 0x7B)) & (0x8C ^ 0x9C ^ (0x27 ^ 0x30) ^ -" ".length());
                        }
                        break Label_0418;
                    }
                    case ' ': {
                        llllllllllllIlllllllIIllllIIIIlI = llllllllllllIlllllllIIllllIIIIll;
                        break;
                    }
                    case '§': {
                        if (!llllllIlIIllIll(llllllllllllIlllllllIIllllIIIIll, llllllllllllIlllllllIIllllIIIlIl - FontRenderer.lIllIlIlIIIlll[6])) {
                            break Label_0418;
                        }
                        ++llllllllllllIlllllllIIllllIIIIll;
                        final char llllllllllllIlllllllIIlllIllllll = llllllllllllIlllllllIIllllIIIlll.charAt(llllllllllllIlllllllIIllllIIIIll);
                        if (!llllllIlIIllllI(llllllllllllIlllllllIIlllIllllll, FontRenderer.lIllIlIlIIIlll[35]) || !llllllIlIIllllI(llllllllllllIlllllllIIlllIllllll, FontRenderer.lIllIlIlIIIlll[36])) {
                            llllllllllllIlllllllIIllllIIIIIl = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                            break Label_0418;
                        }
                        if (llllllIlIIllllI(llllllllllllIlllllllIIlllIllllll, FontRenderer.lIllIlIlIIIlll[37]) && llllllIlIIllllI(llllllllllllIlllllllIIlllIllllll, FontRenderer.lIllIlIlIIIlll[38]) && !llllllIlIIllIIl(isFormatColor(llllllllllllIlllllllIIlllIllllll) ? 1 : 0)) {
                            break Label_0418;
                        }
                        llllllllllllIlllllllIIllllIIIIIl = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                        "".length();
                        if ("   ".length() <= 0) {
                            return (0x37 ^ 0x22) & ~(0xD0 ^ 0xC5);
                        }
                        break Label_0418;
                    }
                }
                llllllllllllIlllllllIIllllIIIlII += this.getCharWidth(llllllllllllIlllllllIIllllIIIIII);
                if (llllllIlIIllIIl(llllllllllllIlllllllIIllllIIIIIl ? 1 : 0)) {
                    ++llllllllllllIlllllllIIllllIIIlII;
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return (127 + 54 - 80 + 42 ^ 77 + 60 - 119 + 111) & (0x49 ^ 0x3A ^ (0x39 ^ 0x44) ^ -" ".length());
                    }
                }
            }
            if (llllllIlIIllIII(llllllllllllIlllllllIIllllIIIIII, FontRenderer.lIllIlIlIIIlll[39])) {
                llllllllllllIlllllllIIllllIIIIlI = ++llllllllllllIlllllllIIllllIIIIll;
                "".length();
                if (-" ".length() > "   ".length()) {
                    return (0x45 ^ 0x73) & ~(0x81 ^ 0xB7);
                }
                break;
            }
            else if (llllllIlIlIIIIl(llllllllllllIlllllllIIllllIIIlII, llllllllllllIlllllllIIlllIllllII)) {
                "".length();
                if ("   ".length() > "   ".length()) {
                    return (0x5A ^ 0x1D) & ~(0x44 ^ 0x3);
                }
                break;
            }
            else {
                ++llllllllllllIlllllllIIllllIIIIll;
            }
        }
        int n;
        if (llllllIlIIllllI(llllllllllllIlllllllIIllllIIIIll, llllllllllllIlllllllIIllllIIIlIl) && llllllIlIIllllI(llllllllllllIlllllllIIllllIIIIlI, FontRenderer.lIllIlIlIIIlll[21]) && llllllIlIIllIll(llllllllllllIlllllllIIllllIIIIlI, llllllllllllIlllllllIIllllIIIIll)) {
            n = llllllllllllIlllllllIIllllIIIIlI;
            "".length();
            if ((76 + 41 - 68 + 78 ^ (0x2F ^ 0x54)) == " ".length()) {
                return (0x44 ^ 0x50 ^ (0x7C ^ 0x5D)) & (0x9A ^ 0x91 ^ (0xA1 ^ 0x9F) ^ -" ".length());
            }
        }
        else {
            n = llllllllllllIlllllllIIllllIIIIll;
        }
        return n;
    }
    
    private void renderStringAtPos(final String llllllllllllIlllllllIlIIllIlIIll, final boolean llllllllllllIlllllllIlIIllIlIIlI) {
        int llllllllllllIlllllllIlIIllIlIIIl = FontRenderer.lIllIlIlIIIlll[4];
        "".length();
        if (-" ".length() >= "   ".length()) {
            return;
        }
        while (!llllllIlIIllIlI(llllllllllllIlllllllIlIIllIlIIIl, llllllllllllIlllllllIlIIllIlIIll.length())) {
            char llllllllllllIlllllllIlIIllIlIIII = llllllllllllIlllllllIlIIllIlIIll.charAt(llllllllllllIlllllllIlIIllIlIIIl);
            if (llllllIlIIllIII(llllllllllllIlllllllIlIIllIlIIII, FontRenderer.lIllIlIlIIIlll[25]) && llllllIlIIllIll(llllllllllllIlllllllIlIIllIlIIIl + FontRenderer.lIllIlIlIIIlll[6], llllllllllllIlllllllIlIIllIlIIll.length())) {
                int llllllllllllIlllllllIlIIllIIllll = FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[5]].indexOf(llllllllllllIlllllllIlIIllIlIIll.toLowerCase(Locale.ENGLISH).charAt(llllllllllllIlllllllIlIIllIlIIIl + FontRenderer.lIllIlIlIIIlll[6]));
                if (llllllIlIIllIll(llllllllllllIlllllllIlIIllIIllll, FontRenderer.lIllIlIlIIIlll[16])) {
                    this.randomStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    this.boldStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    this.strikethroughStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    this.underlineStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    this.italicStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    if (!llllllIlIlIIIII(llllllllllllIlllllllIlIIllIIllll) || llllllIlIlIIIIl(llllllllllllIlllllllIlIIllIIllll, FontRenderer.lIllIlIlIIIlll[23])) {
                        llllllllllllIlllllllIlIIllIIllll = FontRenderer.lIllIlIlIIIlll[23];
                    }
                    if (llllllIlIIllIIl(llllllllllllIlllllllIlIIllIlIIlI ? 1 : 0)) {
                        llllllllllllIlllllllIlIIllIIllll += 16;
                    }
                    final int llllllllllllIlllllllIlIIllIIlllI = this.colorCode[llllllllllllIlllllllIlIIllIIllll];
                    this.textColor = llllllllllllIlllllllIlIIllIIlllI;
                    GlStateManager.color((llllllllllllIlllllllIlIIllIIlllI >> FontRenderer.lIllIlIlIIIlll[16]) / 255.0f, (llllllllllllIlllllllIlIIllIIlllI >> FontRenderer.lIllIlIlIIIlll[19] & FontRenderer.lIllIlIlIIIlll[18]) / 255.0f, (llllllllllllIlllllllIlIIllIIlllI & FontRenderer.lIllIlIlIIIlll[18]) / 255.0f, this.alpha);
                    "".length();
                    if (((0xC6 ^ 0x8D ^ (0x5E ^ 0xD)) & (0x9 ^ 0x4D ^ (0xCF ^ 0x93) ^ -" ".length())) < -" ".length()) {
                        return;
                    }
                }
                else if (llllllIlIIllIII(llllllllllllIlllllllIlIIllIIllll, FontRenderer.lIllIlIlIIIlll[16])) {
                    this.randomStyle = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (llllllIlIIllIII(llllllllllllIlllllllIlIIllIIllll, FontRenderer.lIllIlIlIIIlll[26])) {
                    this.boldStyle = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                    "".length();
                    if (((0xB9 ^ 0xA7) & ~(0x7D ^ 0x63)) == -" ".length()) {
                        return;
                    }
                }
                else if (llllllIlIIllIII(llllllllllllIlllllllIlIIllIIllll, FontRenderer.lIllIlIlIIIlll[27])) {
                    this.strikethroughStyle = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                    "".length();
                    if ((31 + 141 - 107 + 81 ^ 36 + 1 - 25 + 138) <= "  ".length()) {
                        return;
                    }
                }
                else if (llllllIlIIllIII(llllllllllllIlllllllIlIIllIIllll, FontRenderer.lIllIlIlIIIlll[28])) {
                    this.underlineStyle = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                    "".length();
                    if (((29 + 99 - 50 + 68 ^ 77 + 50 - 25 + 33) & (0x10 ^ 0x66 ^ (0x16 ^ 0x75) ^ -" ".length())) >= "   ".length()) {
                        return;
                    }
                }
                else if (llllllIlIIllIII(llllllllllllIlllllllIlIIllIIllll, FontRenderer.lIllIlIlIIIlll[29])) {
                    this.italicStyle = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                    "".length();
                    if (((0x10 ^ 0x42) & ~(0xE2 ^ 0xB0)) != ((0xB3 ^ 0x9A) & ~(0x79 ^ 0x50))) {
                        return;
                    }
                }
                else if (llllllIlIIllIII(llllllllllllIlllllllIlIIllIIllll, FontRenderer.lIllIlIlIIIlll[30])) {
                    this.randomStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    this.boldStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    this.strikethroughStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    this.underlineStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    this.italicStyle = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                    GlStateManager.color(this.red, this.blue, this.green, this.alpha);
                }
                ++llllllllllllIlllllllIlIIllIlIIIl;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                int llllllllllllIlllllllIlIIllIIllIl = FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[17]].indexOf(llllllllllllIlllllllIlIIllIlIIII);
                if (llllllIlIIllIIl(this.randomStyle ? 1 : 0) && llllllIlIIllllI(llllllllllllIlllllllIlIIllIIllIl, FontRenderer.lIllIlIlIIIlll[21])) {
                    final int llllllllllllIlllllllIlIIllIIllII = this.getCharWidth(llllllllllllIlllllllIlIIllIlIIII);
                    char llllllllllllIlllllllIlIIllIIlIll;
                    do {
                        llllllllllllIlllllllIlIIllIIllIl = this.fontRandom.nextInt(FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[22]].length());
                        llllllllllllIlllllllIlIIllIIlIll = FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[10]].charAt(llllllllllllIlllllllIlIIllIIllIl);
                    } while (!llllllIlIIllIII(llllllllllllIlllllllIlIIllIIllII, this.getCharWidth(llllllllllllIlllllllIlIIllIIlIll)));
                    llllllllllllIlllllllIlIIllIlIIII = llllllllllllIlllllllIlIIllIIlIll;
                }
                float n;
                if (llllllIlIIllIIl(this.unicodeFlag ? 1 : 0)) {
                    n = 0.5f;
                    "".length();
                    if (((111 + 200 - 229 + 133 ^ 58 + 20 + 95 + 21) & (0xF0 ^ 0xC0 ^ (0x49 ^ 0x6C) ^ -" ".length())) > "  ".length()) {
                        return;
                    }
                }
                else {
                    n = 1.0f;
                }
                final float llllllllllllIlllllllIlIIllIIlIlI = n;
                int n2;
                if ((!llllllIlIIllIIl(llllllllllllIlllllllIlIIllIlIIII) || !llllllIlIIllllI(llllllllllllIlllllllIlIIllIIllIl, FontRenderer.lIllIlIlIIIlll[21]) || llllllIlIIllIIl(this.unicodeFlag ? 1 : 0)) && llllllIlIIllIIl(llllllllllllIlllllllIlIIllIlIIlI ? 1 : 0)) {
                    n2 = FontRenderer.lIllIlIlIIIlll[6];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    n2 = FontRenderer.lIllIlIlIIIlll[4];
                }
                final boolean llllllllllllIlllllllIlIIllIIlIIl = n2 != 0;
                if (llllllIlIIllIIl(llllllllllllIlllllllIlIIllIIlIIl ? 1 : 0)) {
                    this.posX -= llllllllllllIlllllllIlIIllIIlIlI;
                    this.posY -= llllllllllllIlllllllIlIIllIIlIlI;
                }
                float llllllllllllIlllllllIlIIllIIlIII = this.func_181559_a(llllllllllllIlllllllIlIIllIlIIII, this.italicStyle);
                if (llllllIlIIllIIl(llllllllllllIlllllllIlIIllIIlIIl ? 1 : 0)) {
                    this.posX += llllllllllllIlllllllIlIIllIIlIlI;
                    this.posY += llllllllllllIlllllllIlIIllIIlIlI;
                }
                if (llllllIlIIllIIl(this.boldStyle ? 1 : 0)) {
                    this.posX += llllllllllllIlllllllIlIIllIIlIlI;
                    if (llllllIlIIllIIl(llllllllllllIlllllllIlIIllIIlIIl ? 1 : 0)) {
                        this.posX -= llllllllllllIlllllllIlIIllIIlIlI;
                        this.posY -= llllllllllllIlllllllIlIIllIIlIlI;
                    }
                    this.func_181559_a(llllllllllllIlllllllIlIIllIlIIII, this.italicStyle);
                    "".length();
                    this.posX -= llllllllllllIlllllllIlIIllIIlIlI;
                    if (llllllIlIIllIIl(llllllllllllIlllllllIlIIllIIlIIl ? 1 : 0)) {
                        this.posX += llllllllllllIlllllllIlIIllIIlIlI;
                        this.posY += llllllllllllIlllllllIlIIllIIlIlI;
                    }
                    ++llllllllllllIlllllllIlIIllIIlIII;
                }
                if (llllllIlIIllIIl(this.strikethroughStyle ? 1 : 0)) {
                    final Tessellator llllllllllllIlllllllIlIIllIIIlll = Tessellator.getInstance();
                    final WorldRenderer llllllllllllIlllllllIlIIllIIIllI = llllllllllllIlllllllIlIIllIIIlll.getWorldRenderer();
                    GlStateManager.disableTexture2D();
                    llllllllllllIlllllllIlIIllIIIllI.begin(FontRenderer.lIllIlIlIIIlll[31], DefaultVertexFormats.POSITION);
                    llllllllllllIlllllllIlIIllIIIllI.pos(this.posX, this.posY + this.FONT_HEIGHT / FontRenderer.lIllIlIlIIIlll[8], 0.0).endVertex();
                    llllllllllllIlllllllIlIIllIIIllI.pos(this.posX + llllllllllllIlllllllIlIIllIIlIII, this.posY + this.FONT_HEIGHT / FontRenderer.lIllIlIlIIIlll[8], 0.0).endVertex();
                    llllllllllllIlllllllIlIIllIIIllI.pos(this.posX + llllllllllllIlllllllIlIIllIIlIII, this.posY + this.FONT_HEIGHT / FontRenderer.lIllIlIlIIIlll[8] - 1.0f, 0.0).endVertex();
                    llllllllllllIlllllllIlIIllIIIllI.pos(this.posX, this.posY + this.FONT_HEIGHT / FontRenderer.lIllIlIlIIIlll[8] - 1.0f, 0.0).endVertex();
                    llllllllllllIlllllllIlIIllIIIlll.draw();
                    GlStateManager.enableTexture2D();
                }
                if (llllllIlIIllIIl(this.underlineStyle ? 1 : 0)) {
                    final Tessellator llllllllllllIlllllllIlIIllIIIlIl = Tessellator.getInstance();
                    final WorldRenderer llllllllllllIlllllllIlIIllIIIlII = llllllllllllIlllllllIlIIllIIIlIl.getWorldRenderer();
                    GlStateManager.disableTexture2D();
                    llllllllllllIlllllllIlIIllIIIlII.begin(FontRenderer.lIllIlIlIIIlll[31], DefaultVertexFormats.POSITION);
                    int n3;
                    if (llllllIlIIllIIl(this.underlineStyle ? 1 : 0)) {
                        n3 = FontRenderer.lIllIlIlIIIlll[21];
                        "".length();
                        if ("   ".length() <= 0) {
                            return;
                        }
                    }
                    else {
                        n3 = FontRenderer.lIllIlIlIIIlll[4];
                    }
                    final int llllllllllllIlllllllIlIIllIIIIll = n3;
                    llllllllllllIlllllllIlIIllIIIlII.pos(this.posX + llllllllllllIlllllllIlIIllIIIIll, this.posY + this.FONT_HEIGHT, 0.0).endVertex();
                    llllllllllllIlllllllIlIIllIIIlII.pos(this.posX + llllllllllllIlllllllIlIIllIIlIII, this.posY + this.FONT_HEIGHT, 0.0).endVertex();
                    llllllllllllIlllllllIlIIllIIIlII.pos(this.posX + llllllllllllIlllllllIlIIllIIlIII, this.posY + this.FONT_HEIGHT - 1.0f, 0.0).endVertex();
                    llllllllllllIlllllllIlIIllIIIlII.pos(this.posX + llllllllllllIlllllllIlIIllIIIIll, this.posY + this.FONT_HEIGHT - 1.0f, 0.0).endVertex();
                    llllllllllllIlllllllIlIIllIIIlIl.draw();
                    GlStateManager.enableTexture2D();
                }
                this.posX += (int)llllllllllllIlllllllIlIIllIIlIII;
            }
            ++llllllllllllIlllllllIlIIllIlIIIl;
        }
    }
    
    private static boolean isFormatSpecial(final char llllllllllllIlllllllIIlllIllIIII) {
        if ((!llllllIlIIllIlI(llllllllllllIlllllllIIlllIllIIII, FontRenderer.lIllIlIlIIIlll[45]) || llllllIlIlIIIIl(llllllllllllIlllllllIIlllIllIIII, FontRenderer.lIllIlIlIIIlll[46])) && (!llllllIlIIllIlI(llllllllllllIlllllllIIlllIllIIII, FontRenderer.lIllIlIlIIIlll[47]) || llllllIlIlIIIIl(llllllllllllIlllllllIIlllIllIIII, FontRenderer.lIllIlIlIIIlll[48])) && llllllIlIIllllI(llllllllllllIlllllllIIlllIllIIII, FontRenderer.lIllIlIlIIIlll[37]) && llllllIlIIllllI(llllllllllllIlllllllIIlllIllIIII, FontRenderer.lIllIlIlIIIlll[38])) {
            return FontRenderer.lIllIlIlIIIlll[4] != 0;
        }
        return FontRenderer.lIllIlIlIIIlll[6] != 0;
    }
    
    private static boolean lllllllIllIllIl(final int llllllllllllIlllllllIIllIlIlIllI, final int llllllllllllIlllllllIIllIlIlIlIl) {
        return llllllllllllIlllllllIIllIlIlIllI <= llllllllllllIlllllllIIllIlIlIlIl;
    }
    
    private static boolean llllllIlIIllIll(final int llllllllllllIlllllllIIllIlIllIlI, final int llllllllllllIlllllllIIllIlIllIIl) {
        return llllllllllllIlllllllIIllIlIllIlI < llllllllllllIlllllllIIllIlIllIIl;
    }
    
    private void loadGlyphTexture(final int llllllllllllIlllllllIlIlIlIIIlII) {
        this.renderEngine.bindTexture(this.getUnicodePageLocation(llllllllllllIlllllllIlIlIlIIIlII));
    }
    
    private int renderStringAligned(final String llllllllllllIlllllllIlIIlIlIllIl, int llllllllllllIlllllllIlIIlIlIIlII, final int llllllllllllIlllllllIlIIlIlIlIll, final int llllllllllllIlllllllIlIIlIlIlIlI, final int llllllllllllIlllllllIlIIlIlIIIIl, final boolean llllllllllllIlllllllIlIIlIlIIIII) {
        if (llllllIlIIllIIl(this.bidiFlag ? 1 : 0)) {
            final int llllllllllllIlllllllIlIIlIlIIlll = this.getStringWidth(this.bidiReorder(llllllllllllIlllllllIlIIlIlIllIl));
            llllllllllllIlllllllIlIIlIlIIlII = llllllllllllIlllllllIlIIlIlIIlII + llllllllllllIlllllllIlIIlIlIlIlI - llllllllllllIlllllllIlIIlIlIIlll;
        }
        return this.renderString(llllllllllllIlllllllIlIIlIlIllIl, (float)llllllllllllIlllllllIlIIlIlIIlII, (float)llllllllllllIlllllllIlIIlIlIlIll, llllllllllllIlllllllIlIIlIlIIIIl, llllllllllllIlllllllIlIIlIlIIIII);
    }
    
    public int getCharWidth(final char llllllllllllIlllllllIlIIIllIllII) {
        if (llllllIlIIllIII(llllllllllllIlllllllIlIIIllIllII, FontRenderer.lIllIlIlIIIlll[25])) {
            return FontRenderer.lIllIlIlIIIlll[21];
        }
        if (llllllIlIIllIII(llllllllllllIlllllllIlIIIllIllII, FontRenderer.lIllIlIlIIIlll[3])) {
            return FontRenderer.lIllIlIlIIIlll[17];
        }
        final int llllllllllllIlllllllIlIIIlllIIII = FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[31]].indexOf(llllllllllllIlllllllIlIIIllIllII);
        if (llllllIlIlIIIlI(llllllllllllIlllllllIlIIIllIllII) && llllllIlIIllllI(llllllllllllIlllllllIlIIIlllIIII, FontRenderer.lIllIlIlIIIlll[21]) && llllllIlIIlllII(this.unicodeFlag ? 1 : 0)) {
            return this.charWidth[llllllllllllIlllllllIlIIIlllIIII];
        }
        if (llllllIlIIllIIl(this.glyphWidth[llllllllllllIlllllllIlIIIllIllII])) {
            int llllllllllllIlllllllIlIIIllIllll = this.glyphWidth[llllllllllllIlllllllIlIIIllIllII] >>> FontRenderer.lIllIlIlIIIlll[17];
            int llllllllllllIlllllllIlIIIllIlllI = this.glyphWidth[llllllllllllIlllllllIlIIIllIllII] & FontRenderer.lIllIlIlIIIlll[23];
            if (llllllIlIlIIIIl(llllllllllllIlllllllIlIIIllIlllI, FontRenderer.lIllIlIlIIIlll[31])) {
                llllllllllllIlllllllIlIIIllIlllI = FontRenderer.lIllIlIlIIIlll[23];
                llllllllllllIlllllllIlIIIllIllll = FontRenderer.lIllIlIlIIIlll[4];
            }
            return (++llllllllllllIlllllllIlIIIllIlllI - llllllllllllIlllllllIlIIIllIllll) / FontRenderer.lIllIlIlIIIlll[8] + FontRenderer.lIllIlIlIIIlll[6];
        }
        return FontRenderer.lIllIlIlIIIlll[4];
    }
    
    String wrapFormattedStringToWidth(final String llllllllllllIlllllllIIlllllIIIIl, final int llllllllllllIlllllllIIllllIllIII) {
        final int llllllllllllIlllllllIIllllIlllll = this.sizeStringToWidth(llllllllllllIlllllllIIlllllIIIIl, llllllllllllIlllllllIIllllIllIII);
        if (lllllllIllIllIl(llllllllllllIlllllllIIlllllIIIIl.length(), llllllllllllIlllllllIIllllIlllll)) {
            return llllllllllllIlllllllIIlllllIIIIl;
        }
        final String llllllllllllIlllllllIIllllIllllI = llllllllllllIlllllllIIlllllIIIIl.substring(FontRenderer.lIllIlIlIIIlll[4], llllllllllllIlllllllIIllllIlllll);
        final char llllllllllllIlllllllIIllllIlllIl = llllllllllllIlllllllIIlllllIIIIl.charAt(llllllllllllIlllllllIIllllIlllll);
        int n;
        if (llllllIlIIllllI(llllllllllllIlllllllIIllllIlllIl, FontRenderer.lIllIlIlIIIlll[3]) && llllllIlIIllllI(llllllllllllIlllllllIIllllIlllIl, FontRenderer.lIllIlIlIIIlll[39])) {
            n = FontRenderer.lIllIlIlIIIlll[4];
            "".length();
            if ((0x12 ^ 0x20 ^ (0x19 ^ 0x2F)) != (0xF7 ^ 0xB4 ^ (0x66 ^ 0x21))) {
                return null;
            }
        }
        else {
            n = FontRenderer.lIllIlIlIIIlll[6];
        }
        final boolean llllllllllllIlllllllIIllllIlllII = n != 0;
        final StringBuilder sb = new StringBuilder(String.valueOf(getFormatFromString(llllllllllllIlllllllIIllllIllllI)));
        final int n2 = llllllllllllIlllllllIIllllIlllll;
        int n3;
        if (llllllIlIIllIIl(llllllllllllIlllllllIIllllIlllII ? 1 : 0)) {
            n3 = FontRenderer.lIllIlIlIIIlll[6];
            "".length();
            if ((0x44 ^ 0x41) <= 0) {
                return null;
            }
        }
        else {
            n3 = FontRenderer.lIllIlIlIIIlll[4];
        }
        final String llllllllllllIlllllllIIllllIllIll = String.valueOf(sb.append(llllllllllllIlllllllIIlllllIIIIl.substring(n2 + n3)));
        return String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllllllIIllllIllllI)).append(FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[39]]).append(this.wrapFormattedStringToWidth(llllllllllllIlllllllIIllllIllIll, llllllllllllIlllllllIIllllIllIII)));
    }
    
    private String bidiReorder(final String llllllllllllIlllllllIlIIlllIIlIl) {
        try {
            final Bidi llllllllllllIlllllllIlIIlllIIlll = new Bidi(new ArabicShaping(FontRenderer.lIllIlIlIIIlll[19]).shape(llllllllllllIlllllllIlIIlllIIlIl), FontRenderer.lIllIlIlIIIlll[24]);
            llllllllllllIlllllllIlIIlllIIlll.setReorderingMode(FontRenderer.lIllIlIlIIIlll[4]);
            return llllllllllllIlllllllIlIIlllIIlll.writeReordered(FontRenderer.lIllIlIlIIIlll[8]);
        }
        catch (ArabicShapingException llllllllllllIlllllllIlIIlllIIllI) {
            return llllllllllllIlllllllIlIIlllIIlIl;
        }
    }
    
    static {
        llllllIlIIlIlll();
        llllllIlIIIlllI();
        unicodePageLocations = new ResourceLocation[FontRenderer.lIllIlIlIIIlll[0]];
    }
    
    public List<String> listFormattedStringToWidth(final String llllllllllllIlllllllIIlllllIllll, final int llllllllllllIlllllllIIlllllIlIll) {
        return Arrays.asList(this.wrapFormattedStringToWidth(llllllllllllIlllllllIIlllllIllll, llllllllllllIlllllllIIlllllIlIll).split(FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[1]]));
    }
    
    private static void llllllIlIIIlllI() {
        (lIllIlIIllllll = new String[FontRenderer.lIllIlIlIIIlll[23]])[FontRenderer.lIllIlIlIIIlll[4]] = llllllIlIIIlIll("DDU3IU4NNiAlCTUpMC8EGXQ7PA8=", "jZYUa");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[6]] = llllllIlIIIllII("AnSPnLLNN4XWW0JlV+f/9SMYdMXCqKCM2AUQXZ3zND7FFQjln9p9byFPCd1cFCnnRMiWQUhFl6SDqt3HNGF622f27hoBHtJdxoBBOpKD68ghah1AhEM3hCzKh3YZB+fLuSpiozayAuQJMxmnCxPJFiArwo2Gl2ZUe/FyKoTReBccSFD2H0Y1xzaX7OUSpf/jIesasxwbeoNdT2kuI/ycGYAQuNuT1K7GvQoNqrvam3Na/9UQYQYxav7DKd110kZ40460IHbUc5O6qWJ+QZShY6P23xSE8XOmYfwGobJYp2760uLL8pxf0WFUgN3+jvKGB+D5Uq7Ssa9KjuYzp+okU2UN20afOyLpudhLgFDRzeI8zxtxeay5Gn13dQYC8wqV+88/SPuUVOTFb0YXYoVXDCVoLAfRBqtpDGJEZ7IbrMKJe/BFhV2UBK3LNuXOzUEGZ4V4w+ET6uNsPNOQSBesebXzlO5FcEOt11I4zemycyiOS4ibzoauw01+WPcsz8HQ+VkocY/7P0MtBiMXLA7lWyvFs6Kl/J/dFMGij/14+3Dcy01SjcfGdQ4LXmS2TPJ65NsAsh9/Y3E4h03fXyv9dnf4JPmbfpuKfpOAUFfI9B4Cuu3Dkfn/aA==", "Qlnab");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[8]] = llllllIlIIIlIll("GxwqLTAdHCF2IwAXJnYwARAxNiEKJiI4Igomd2l3F1ciNyI=", "oyRYE");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[5]] = llllllIlIIIlIll("ZUl5RWNgTnxObjQaKBIyMxMnGzk6Cg==", "UxKvW");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[17]] = llllllIlIIIllIl("yEpLxUeE5WXCK0LH8jCFGSgaOQQMail8FC0Rx6sIVRSTSfJhLptf9OCc1don7+5FTfN4Vbwoz8VQLBstV+vDjvQNz2gdlFbaMuWkdQkPucg2f0PHDcxOgQaiD9SBudfEmipeiZg+TJU3yFvOOUj/vqNvbJts3kFsiGQ9PIY/ugomGl4mNJMTCdR9hJuQcyavCVVT+OjG5ySQUFE7B7b5BJ+RJ5hRvDNGOymCf8ZQZpxzjY0510K8HklpdcY40aBnxOY0QRKQD8OUaY8/7r0r1FlRtpfrWcSdRM5ZHq6c6N9+OrEIMGLWdcc1V3REU6ivfIhUV5G1At5yaU8Ek+bNz+7Zg4VrAOE3uSGry73hs0DU9FI7GE9WzlaTAK/0SBbUVJZUopkiee9Xleb21uazeYvQn7IFZjbOXaKT1fwJz13R4RUYww9bvAc6TjCcJTRvVysXSbYC7r9DDYns590mLi2Pxf8RzxfhThB3JdUwJWBRQeWoZ0tetS28uWQRu9StjpII/PW9XR92E8zbALbzKKXa7iBMzthj6n66Q5NT31+dn4t3Q/gS7n2JR73973/tEAhyrnV0V/0yV1oLu8X7Vpc/rEpWSv6ZYUthUO3uo2utIQ1QdKUVMg==", "hOEHU");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[22]] = llllllIlIIIlIll("wqbCgsK6wrnChsKtwo7Cq8KlwpnCvMKcwpvChMWTxZbFssSqxKLEksS5xLfEjcSPyYtmQ3hxTGZDWFBuRWddV2tOalJaYEttV0F9VHBMRHpRe0FLd1p+Rk4MJwE7NQkgBDA4Bi0PNT8DNhIqIhgzFS8pFTwYJCwSOSMZEy8CJh4WJA8pEx0hCCwIAD4VNw0HOx46AgowGz14wrbCsMKPwqHCnMKRwqnCgcKpwpPCmcKjwojCr8K8wrTChcKAwoXCjMKHwr7CncK6wofCp8KQwp7DoMKgwqbHnsKHwq7Ci8KLwr3Ct8Opw4LDjsOiw4rDvsOEw5DDp8Od4peS4peq4pei4pWO4pWC4pSi4pSa4pSn4pSZ4pSF4pSS4pSv4pSs4pSQ4pS94pWT4pWs4pWF4pWg4pW64pWD4pWE4pSv4pST4pS84pSX4pSR4pSX4pSs4pS24pSv4pSf4pSZ4pSo4pSD4pSa4pSg4pSj4pSf4pSN4pSp4pWg4pW94peE4pei4peP4peo4pexz73PlM+QzrjPks6Pz5rOh8+ez6nPpc+S4omd4om94om54oml4oiHw7LiiJ3iiJXijazijYfCtOKIsMOB4omVw5HiiZnigIfDg+KXrGY=", "fCxqL");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[10]] = llllllIlIIIlIll("wq3CiMKtwqrCncKmwoTCvMK2woLCt8KWwozCl8WIxZ3FuMS9xLHEicSyxL3EmsScyZBtSW9iV21JT0N1Tm1KRHBFYEVJe0BnQFJmX3pbV2FacVZYbFF0UV0XLAssJhIrDicrHSYFIiwYPRg9MQM4Hzg6DjcSMz8JMikOADQJLAkFPwQjBA46AyYfEyUePRoUIBUwFRkrEDdvwqXCq8KEwqvCi8KCwrLCisKjwoTCisK4woPCpcKrwqfCnsKLwo/Cm8KUwqXClsKwwpDCtMKLwpXDqsK3wrXHhcKMwqTCnMKYwqbCvMOjw5XDncO5w4HDtMOTw4PDvMOW4peY4pe94pex4pWV4pWJ4pSo4pSN4pS04pSC4pSO4pSY4pS44pS/4pSL4pS24pWZ4pW74pWW4pW74pWx4pWJ4pWT4pS84pSI4pS34pSd4pSG4pSE4pS34pS94pSl4pSI4pSK4pSz4pSI4pSQ4pS34pSw4pSE4pSG4pSj4pW34pWu4pef4pep4peF4pe/4peiz6bPn8+azq/Pgc6Uz5HOjc+Jz7rPvs+Z4omX4omq4omq4om+4oiMw7jiiIriiIbijbfijYzCvuKIp8OS4omOw5riiZPigJDDkOKXt20=", "mIobW");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[31]] = llllllIlIIIllII("S7VvW/5J8ioPIp4UaoiKrTd6Q2XvD1C0gKwdz9vjdOG1JUvZh+zCtgyLvxo5PQvI4SCv9jZhuSzSvpsWoteC9sTVURhzZa7lGWq8HBI72H8ZavOEy2HWb5kgXhdDOpC856IjeGWiii9oFxoG0jDMEozM5qbMon4buBCPi618UYm2jUJ20azn465072RwRsD8R/7HPBM5P1qE59mjrxEJaUWgYkt3dP2KNTWBswthmV6vJOM1LYXF+q9SjeO1dmO8Kdc4JQ+0lukEyVmXf4g4RvMaN7yBAUGbIQzt6X34Rs91yGkDoXLL4ZHnVkl5YNkvEwTYQK15YHyKwkgP3kIZ0DZG7OqxSGZnq1oDjBiM2bsY7N2ysfPUGu8XAcxtKIewsF0JzBQKvoX6o0Fyoc1JR1aJu2ihAAxt/hN+3JIN599/bnQsJnfBdkjq3nM/p/uaR4NIai+jscrmMio6a8SOleWwFNcxshiZ3TIFTC5zwEdUntxCSHSiqGGJZjbV4xcs4X13w2lJJXrQ3dKzsBnCXJFOkbIWqulpBueh0iTx6KApQWcKFd5mV7plLF0pxKhbeT9EDzMiQkQgUUkFMNsee2y6kQXx5Ps8cRLdYCGyY7pq3mdZm4XoLg==", "lziYg");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[19]] = llllllIlIIIllIl("sluGtQ8tGCU=", "bTJaG");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[1]] = llllllIlIIIlIll("Tw==", "EvSPL");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[39]] = llllllIlIIIlIll("Qg==", "HzSUh");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[13]] = llllllIlIIIlIll("", "nPdGv");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[49]] = llllllIlIIIllIl("+uFVDRFD/pQ=", "jPUoQ");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[50]] = llllllIlIIIlIll("w6I=", "EoecL");
        FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[51]] = llllllIlIIIllIl("1sNIQVHZovcV05bSClD71v1r/1Zjyv8u", "wcgMR");
    }
    
    private float renderDefaultChar(final int llllllllllllIlllllllIlIlIlIlIlII, final boolean llllllllllllIlllllllIlIlIlIllIll) {
        final int llllllllllllIlllllllIlIlIlIllIlI = llllllllllllIlllllllIlIlIlIlIlII % FontRenderer.lIllIlIlIIIlll[16] * FontRenderer.lIllIlIlIIIlll[19];
        final int llllllllllllIlllllllIlIlIlIllIIl = llllllllllllIlllllllIlIlIlIlIlII / FontRenderer.lIllIlIlIIIlll[16] * FontRenderer.lIllIlIlIIIlll[19];
        int n;
        if (llllllIlIIllIIl(llllllllllllIlllllllIlIlIlIllIll ? 1 : 0)) {
            n = FontRenderer.lIllIlIlIIIlll[6];
            "".length();
            if (-(0xA9 ^ 0xAC) >= 0) {
                return 0.0f;
            }
        }
        else {
            n = FontRenderer.lIllIlIlIIIlll[4];
        }
        final int llllllllllllIlllllllIlIlIlIllIII = n;
        this.renderEngine.bindTexture(this.locationFontTexture);
        final int llllllllllllIlllllllIlIlIlIlIlll = this.charWidth[llllllllllllIlllllllIlIlIlIlIlII];
        final float llllllllllllIlllllllIlIlIlIlIllI = llllllllllllIlllllllIlIlIlIlIlll - 0.01f;
        GL11.glBegin(FontRenderer.lIllIlIlIIIlll[22]);
        GL11.glTexCoord2f(llllllllllllIlllllllIlIlIlIllIlI / 128.0f, llllllllllllIlllllllIlIlIlIllIIl / 128.0f);
        GL11.glVertex3f(this.posX + llllllllllllIlllllllIlIlIlIllIII, this.posY, 0.0f);
        GL11.glTexCoord2f(llllllllllllIlllllllIlIlIlIllIlI / 128.0f, (llllllllllllIlllllllIlIlIlIllIIl + 7.99f) / 128.0f);
        GL11.glVertex3f(this.posX - llllllllllllIlllllllIlIlIlIllIII, this.posY + 7.99f, 0.0f);
        GL11.glTexCoord2f((llllllllllllIlllllllIlIlIlIllIlI + llllllllllllIlllllllIlIlIlIlIllI - 1.0f) / 128.0f, llllllllllllIlllllllIlIlIlIllIIl / 128.0f);
        GL11.glVertex3f(this.posX + llllllllllllIlllllllIlIlIlIlIllI - 1.0f + llllllllllllIlllllllIlIlIlIllIII, this.posY, 0.0f);
        GL11.glTexCoord2f((llllllllllllIlllllllIlIlIlIllIlI + llllllllllllIlllllllIlIlIlIlIllI - 1.0f) / 128.0f, (llllllllllllIlllllllIlIlIlIllIIl + 7.99f) / 128.0f);
        GL11.glVertex3f(this.posX + llllllllllllIlllllllIlIlIlIlIllI - 1.0f - llllllllllllIlllllllIlIlIlIllIII, this.posY + 7.99f, 0.0f);
        GL11.glEnd();
        return (float)llllllllllllIlllllllIlIlIlIlIlll;
    }
    
    private int renderString(String llllllllllllIlllllllIlIIlIIlIIIl, final float llllllllllllIlllllllIlIIlIIlIllI, final float llllllllllllIlllllllIlIIlIIlIlIl, int llllllllllllIlllllllIlIIlIIlIlII, final boolean llllllllllllIlllllllIlIIlIIlIIll) {
        if (llllllIlIIlllll(llllllllllllIlllllllIlIIlIIlIIIl)) {
            return FontRenderer.lIllIlIlIIIlll[4];
        }
        if (llllllIlIIllIIl(this.bidiFlag ? 1 : 0)) {
            llllllllllllIlllllllIlIIlIIlIIIl = this.bidiReorder((String)llllllllllllIlllllllIlIIlIIlIIIl);
        }
        if (llllllIlIIlllII(llllllllllllIlllllllIlIIlIIlIlII & FontRenderer.lIllIlIlIIIlll[32])) {
            llllllllllllIlllllllIlIIlIIlIlII |= FontRenderer.lIllIlIlIIIlll[33];
        }
        if (llllllIlIIllIIl(llllllllllllIlllllllIlIIlIIlIIll ? 1 : 0)) {
            llllllllllllIlllllllIlIIlIIlIlII = ((llllllllllllIlllllllIlIIlIIlIlII & FontRenderer.lIllIlIlIIIlll[34]) >> FontRenderer.lIllIlIlIIIlll[8] | (llllllllllllIlllllllIlIIlIIlIlII & FontRenderer.lIllIlIlIIIlll[33]));
        }
        this.red = (llllllllllllIlllllllIlIIlIIlIlII >> FontRenderer.lIllIlIlIIIlll[16] & FontRenderer.lIllIlIlIIIlll[18]) / 255.0f;
        this.blue = (llllllllllllIlllllllIlIIlIIlIlII >> FontRenderer.lIllIlIlIIIlll[19] & FontRenderer.lIllIlIlIIIlll[18]) / 255.0f;
        this.green = (llllllllllllIlllllllIlIIlIIlIlII & FontRenderer.lIllIlIlIIIlll[18]) / 255.0f;
        this.alpha = (llllllllllllIlllllllIlIIlIIlIlII >> FontRenderer.lIllIlIlIIIlll[20] & FontRenderer.lIllIlIlIIIlll[18]) / 255.0f;
        GlStateManager.color(this.red, this.blue, this.green, this.alpha);
        this.posX = llllllllllllIlllllllIlIIlIIlIllI;
        this.posY = llllllllllllIlllllllIlIIlIIlIlIl;
        this.renderStringAtPos((String)llllllllllllIlllllllIlIIlIIlIIIl, llllllllllllIlllllllIlIIlIIlIIll);
        return (int)this.posX;
    }
    
    public static String getFormatFromString(final String llllllllllllIlllllllIIlllIlIlIIl) {
        String llllllllllllIlllllllIIlllIlIlIII = FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[13]];
        int llllllllllllIlllllllIIlllIlIIlll = FontRenderer.lIllIlIlIIIlll[21];
        final int llllllllllllIlllllllIIlllIlIIllI = llllllllllllIlllllllIIlllIlIlIIl.length();
        "".length();
        if (" ".length() == 0) {
            return null;
        }
        while (!llllllIlIIllIII(llllllllllllIlllllllIIlllIlIIlll = llllllllllllIlllllllIIlllIlIlIIl.indexOf(FontRenderer.lIllIlIlIIIlll[25], llllllllllllIlllllllIIlllIlIIlll + FontRenderer.lIllIlIlIIIlll[6]), FontRenderer.lIllIlIlIIIlll[21])) {
            if (llllllIlIIllIll(llllllllllllIlllllllIIlllIlIIlll, llllllllllllIlllllllIIlllIlIIllI - FontRenderer.lIllIlIlIIIlll[6])) {
                final char llllllllllllIlllllllIIlllIlIIlIl = llllllllllllIlllllllIIlllIlIlIIl.charAt(llllllllllllIlllllllIIlllIlIIlll + FontRenderer.lIllIlIlIIIlll[6]);
                if (llllllIlIIllIIl(isFormatColor(llllllllllllIlllllllIIlllIlIIlIl) ? 1 : 0)) {
                    llllllllllllIlllllllIIlllIlIlIII = String.valueOf(new StringBuilder(FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[49]]).append(llllllllllllIlllllllIIlllIlIIlIl));
                    "".length();
                    if ((0x72 ^ 0x1C ^ (0xE9 ^ 0x83)) == 0x0) {
                        return null;
                    }
                    continue;
                }
                else {
                    if (!llllllIlIIllIIl(isFormatSpecial(llllllllllllIlllllllIIlllIlIIlIl) ? 1 : 0)) {
                        continue;
                    }
                    llllllllllllIlllllllIIlllIlIlIII = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllllllIIlllIlIlIII)).append(FontRenderer.lIllIlIIllllll[FontRenderer.lIllIlIlIIIlll[50]]).append(llllllllllllIlllllllIIlllIlIIlIl));
                }
            }
        }
        return llllllllllllIlllllllIIlllIlIlIII;
    }
    
    private static String llllllIlIIIlIll(String llllllllllllIlllllllIIllIllIllIl, final String llllllllllllIlllllllIIllIlllIIIl) {
        llllllllllllIlllllllIIllIllIllIl = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllllIIllIllIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllIIllIlllIIII = new StringBuilder();
        final char[] llllllllllllIlllllllIIllIllIllll = llllllllllllIlllllllIIllIlllIIIl.toCharArray();
        int llllllllllllIlllllllIIllIllIlllI = FontRenderer.lIllIlIlIIIlll[4];
        final float llllllllllllIlllllllIIllIllIlIII = (Object)((String)llllllllllllIlllllllIIllIllIllIl).toCharArray();
        final boolean llllllllllllIlllllllIIllIllIIlll = llllllllllllIlllllllIIllIllIlIII.length != 0;
        byte llllllllllllIlllllllIIllIllIIllI = (byte)FontRenderer.lIllIlIlIIIlll[4];
        while (llllllIlIIllIll(llllllllllllIlllllllIIllIllIIllI, llllllllllllIlllllllIIllIllIIlll ? 1 : 0)) {
            final char llllllllllllIlllllllIIllIlllIIll = llllllllllllIlllllllIIllIllIlIII[llllllllllllIlllllllIIllIllIIllI];
            llllllllllllIlllllllIIllIlllIIII.append((char)(llllllllllllIlllllllIIllIlllIIll ^ llllllllllllIlllllllIIllIllIllll[llllllllllllIlllllllIIllIllIlllI % llllllllllllIlllllllIIllIllIllll.length]));
            "".length();
            ++llllllllllllIlllllllIIllIllIlllI;
            ++llllllllllllIlllllllIIllIllIIllI;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllIIllIlllIIII);
    }
    
    public int getStringWidth(final String llllllllllllIlllllllIlIIlIIIIlII) {
        if (llllllIlIIlllll(llllllllllllIlllllllIlIIlIIIIlII)) {
            return FontRenderer.lIllIlIlIIIlll[4];
        }
        int llllllllllllIlllllllIlIIlIIIIIll = FontRenderer.lIllIlIlIIIlll[4];
        boolean llllllllllllIlllllllIlIIlIIIIIlI = FontRenderer.lIllIlIlIIIlll[4] != 0;
        int llllllllllllIlllllllIlIIlIIIIIIl = FontRenderer.lIllIlIlIIIlll[4];
        "".length();
        if ("   ".length() <= 0) {
            return (0xF1 ^ 0xAC ^ (0x65 ^ 0x19)) & (72 + 7 + 69 + 28 ^ 90 + 61 - 55 + 49 ^ -" ".length());
        }
        while (!llllllIlIIllIlI(llllllllllllIlllllllIlIIlIIIIIIl, llllllllllllIlllllllIlIIlIIIIlII.length())) {
            char llllllllllllIlllllllIlIIlIIIIIII = llllllllllllIlllllllIlIIlIIIIlII.charAt(llllllllllllIlllllllIlIIlIIIIIIl);
            int llllllllllllIlllllllIlIIIlllllll = this.getCharWidth(llllllllllllIlllllllIlIIlIIIIIII);
            if (llllllIlIIlllIl(llllllllllllIlllllllIlIIIlllllll) && llllllIlIIllIll(llllllllllllIlllllllIlIIlIIIIIIl, llllllllllllIlllllllIlIIlIIIIlII.length() - FontRenderer.lIllIlIlIIIlll[6])) {
                ++llllllllllllIlllllllIlIIlIIIIIIl;
                llllllllllllIlllllllIlIIlIIIIIII = llllllllllllIlllllllIlIIlIIIIlII.charAt(llllllllllllIlllllllIlIIlIIIIIIl);
                if (llllllIlIIllllI(llllllllllllIlllllllIlIIlIIIIIII, FontRenderer.lIllIlIlIIIlll[35]) && llllllIlIIllllI(llllllllllllIlllllllIlIIlIIIIIII, FontRenderer.lIllIlIlIIIlll[36])) {
                    if (!llllllIlIIllllI(llllllllllllIlllllllIlIIlIIIIIII, FontRenderer.lIllIlIlIIIlll[37]) || llllllIlIIllIII(llllllllllllIlllllllIlIIlIIIIIII, FontRenderer.lIllIlIlIIIlll[38])) {
                        llllllllllllIlllllllIlIIlIIIIIlI = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                        "".length();
                        if (" ".length() == 0) {
                            return (0x50 ^ 0x30 ^ (0x4A ^ 0x37)) & (0xA4 ^ 0x9C ^ (0x76 ^ 0x53) ^ -" ".length());
                        }
                    }
                }
                else {
                    llllllllllllIlllllllIlIIlIIIIIlI = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                }
                llllllllllllIlllllllIlIIIlllllll = FontRenderer.lIllIlIlIIIlll[4];
            }
            llllllllllllIlllllllIlIIlIIIIIll += llllllllllllIlllllllIlIIIlllllll;
            if (llllllIlIIllIIl(llllllllllllIlllllllIlIIlIIIIIlI ? 1 : 0) && llllllIlIlIIIlI(llllllllllllIlllllllIlIIIlllllll)) {
                ++llllllllllllIlllllllIlIIlIIIIIll;
            }
            ++llllllllllllIlllllllIlIIlIIIIIIl;
        }
        return llllllllllllIlllllllIlIIlIIIIIll;
    }
    
    public int drawStringWithShadow(final String llllllllllllIlllllllIlIlIIIllIIl, final float llllllllllllIlllllllIlIlIIIlIIll, final float llllllllllllIlllllllIlIlIIIlIIlI, final int llllllllllllIlllllllIlIlIIIlIllI) {
        return this.drawString(llllllllllllIlllllllIlIlIIIllIIl, llllllllllllIlllllllIlIlIIIlIIll, llllllllllllIlllllllIlIlIIIlIIlI, llllllllllllIlllllllIlIlIIIlIllI, (boolean)(FontRenderer.lIllIlIlIIIlll[6] != 0));
    }
    
    public String trimStringToWidth(final String llllllllllllIlllllllIlIIIlIIIlII, final int llllllllllllIlllllllIlIIIlIlIIII, final boolean llllllllllllIlllllllIlIIIlIIIIlI) {
        final StringBuilder llllllllllllIlllllllIlIIIlIIlllI = new StringBuilder();
        int llllllllllllIlllllllIlIIIlIIllIl = FontRenderer.lIllIlIlIIIlll[4];
        int n;
        if (llllllIlIIllIIl(llllllllllllIlllllllIlIIIlIIIIlI ? 1 : 0)) {
            n = llllllllllllIlllllllIlIIIlIIIlII.length() - FontRenderer.lIllIlIlIIIlll[6];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            n = FontRenderer.lIllIlIlIIIlll[4];
        }
        final int llllllllllllIlllllllIlIIIlIIllII = n;
        int n2;
        if (llllllIlIIllIIl(llllllllllllIlllllllIlIIIlIIIIlI ? 1 : 0)) {
            n2 = FontRenderer.lIllIlIlIIIlll[21];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return null;
            }
        }
        else {
            n2 = FontRenderer.lIllIlIlIIIlll[6];
        }
        final int llllllllllllIlllllllIlIIIlIIlIll = n2;
        boolean llllllllllllIlllllllIlIIIlIIlIlI = FontRenderer.lIllIlIlIIIlll[4] != 0;
        boolean llllllllllllIlllllllIlIIIlIIlIIl = FontRenderer.lIllIlIlIIIlll[4] != 0;
        int llllllllllllIlllllllIlIIIlIIlIII = llllllllllllIlllllllIlIIIlIIllII;
        "".length();
        if ((0x9B ^ 0x9F) <= 0) {
            return null;
        }
        while (llllllIlIlIIIII(llllllllllllIlllllllIlIIIlIIlIII) && llllllIlIIllIll(llllllllllllIlllllllIlIIIlIIlIII, llllllllllllIlllllllIlIIIlIIIlII.length()) && !llllllIlIIllIlI(llllllllllllIlllllllIlIIIlIIllIl, llllllllllllIlllllllIlIIIlIlIIII)) {
            final char llllllllllllIlllllllIlIIIlIIIlll = llllllllllllIlllllllIlIIIlIIIlII.charAt(llllllllllllIlllllllIlIIIlIIlIII);
            final int llllllllllllIlllllllIlIIIlIIIllI = this.getCharWidth(llllllllllllIlllllllIlIIIlIIIlll);
            if (llllllIlIIllIIl(llllllllllllIlllllllIlIIIlIIlIlI ? 1 : 0)) {
                llllllllllllIlllllllIlIIIlIIlIlI = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                if (llllllIlIIllllI(llllllllllllIlllllllIlIIIlIIIlll, FontRenderer.lIllIlIlIIIlll[35]) && llllllIlIIllllI(llllllllllllIlllllllIlIIIlIIIlll, FontRenderer.lIllIlIlIIIlll[36])) {
                    if (!llllllIlIIllllI(llllllllllllIlllllllIlIIIlIIIlll, FontRenderer.lIllIlIlIIIlll[37]) || llllllIlIIllIII(llllllllllllIlllllllIlIIIlIIIlll, FontRenderer.lIllIlIlIIIlll[38])) {
                        llllllllllllIlllllllIlIIIlIIlIIl = (FontRenderer.lIllIlIlIIIlll[4] != 0);
                        "".length();
                        if ("   ".length() == " ".length()) {
                            return null;
                        }
                    }
                }
                else {
                    llllllllllllIlllllllIlIIIlIIlIIl = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                    "".length();
                    if (" ".length() < " ".length()) {
                        return null;
                    }
                }
            }
            else if (llllllIlIIlllIl(llllllllllllIlllllllIlIIIlIIIllI)) {
                llllllllllllIlllllllIlIIIlIIlIlI = (FontRenderer.lIllIlIlIIIlll[6] != 0);
                "".length();
                if (-" ".length() >= (0x85 ^ 0x81)) {
                    return null;
                }
            }
            else {
                llllllllllllIlllllllIlIIIlIIllIl += llllllllllllIlllllllIlIIIlIIIllI;
                if (llllllIlIIllIIl(llllllllllllIlllllllIlIIIlIIlIIl ? 1 : 0)) {
                    ++llllllllllllIlllllllIlIIIlIIllIl;
                }
            }
            if (llllllIlIlIIIIl(llllllllllllIlllllllIlIIIlIIllIl, llllllllllllIlllllllIlIIIlIlIIII)) {
                "".length();
                if ((0xA1 ^ 0xA5) == "   ".length()) {
                    return null;
                }
                break;
            }
            else {
                if (llllllIlIIllIIl(llllllllllllIlllllllIlIIIlIIIIlI ? 1 : 0)) {
                    llllllllllllIlllllllIlIIIlIIlllI.insert(FontRenderer.lIllIlIlIIIlll[4], llllllllllllIlllllllIlIIIlIIIlll);
                    "".length();
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return null;
                    }
                }
                else {
                    llllllllllllIlllllllIlIIIlIIlllI.append(llllllllllllIlllllllIlIIIlIIIlll);
                    "".length();
                }
                llllllllllllIlllllllIlIIIlIIlIII += llllllllllllIlllllllIlIIIlIIlIll;
            }
        }
        return String.valueOf(llllllllllllIlllllllIlIIIlIIlllI);
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager llllllllllllIlllllllIlIllIllIIll) {
        this.readFontTexture();
    }
    
    private static boolean isFormatColor(final char llllllllllllIlllllllIIlllIllIIll) {
        if ((!llllllIlIIllIlI(llllllllllllIlllllllIIlllIllIIll, FontRenderer.lIllIlIlIIIlll[40]) || llllllIlIlIIIIl(llllllllllllIlllllllIIlllIllIIll, FontRenderer.lIllIlIlIIIlll[41])) && (!llllllIlIIllIlI(llllllllllllIlllllllIIlllIllIIll, FontRenderer.lIllIlIlIIIlll[42]) || llllllIlIlIIIIl(llllllllllllIlllllllIIlllIllIIll, FontRenderer.lIllIlIlIIIlll[43])) && (!llllllIlIIllIlI(llllllllllllIlllllllIIlllIllIIll, FontRenderer.lIllIlIlIIIlll[44]) || llllllIlIlIIIIl(llllllllllllIlllllllIIlllIllIIll, FontRenderer.lIllIlIlIIIlll[15]))) {
            return FontRenderer.lIllIlIlIIIlll[4] != 0;
        }
        return FontRenderer.lIllIlIlIIIlll[6] != 0;
    }
}
