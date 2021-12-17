// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.vertex;

public class DefaultVertexFormats
{
    public static final /* synthetic */ VertexFormat PARTICLE_POSITION_TEX_COLOR_LMAP;
    public static final /* synthetic */ VertexFormatElement TEX_2S;
    public static final /* synthetic */ VertexFormatElement COLOR_4UB;
    public static final /* synthetic */ VertexFormat POSITION_TEX_COLOR_NORMAL;
    public static final /* synthetic */ VertexFormatElement POSITION_3F;
    public static final /* synthetic */ VertexFormat POSITION_TEX;
    public static final /* synthetic */ VertexFormat POSITION_NORMAL;
    public static final /* synthetic */ VertexFormat OLDMODEL_POSITION_TEX_NORMAL;
    public static final /* synthetic */ VertexFormatElement PADDING_1B;
    public static final /* synthetic */ VertexFormat POSITION;
    public static final /* synthetic */ VertexFormat POSITION_TEX_COLOR;
    public static final /* synthetic */ VertexFormatElement TEX_2F;
    private static final /* synthetic */ int[] llIlIIlIIlIlII;
    public static final /* synthetic */ VertexFormat POSITION_TEX_NORMAL;
    public static final /* synthetic */ VertexFormat POSITION_TEX_LMAP_COLOR;
    public static final /* synthetic */ VertexFormat BLOCK;
    public static final /* synthetic */ VertexFormat POSITION_COLOR;
    public static final /* synthetic */ VertexFormat ITEM;
    public static final /* synthetic */ VertexFormatElement NORMAL_3B;
    
    static {
        lIIlIIlIIllIIIIl();
        BLOCK = new VertexFormat();
        ITEM = new VertexFormat();
        OLDMODEL_POSITION_TEX_NORMAL = new VertexFormat();
        PARTICLE_POSITION_TEX_COLOR_LMAP = new VertexFormat();
        POSITION = new VertexFormat();
        POSITION_COLOR = new VertexFormat();
        POSITION_TEX = new VertexFormat();
        POSITION_NORMAL = new VertexFormat();
        POSITION_TEX_COLOR = new VertexFormat();
        POSITION_TEX_NORMAL = new VertexFormat();
        POSITION_TEX_LMAP_COLOR = new VertexFormat();
        POSITION_TEX_COLOR_NORMAL = new VertexFormat();
        POSITION_3F = new VertexFormatElement(DefaultVertexFormats.llIlIIlIIlIlII[0], VertexFormatElement.EnumType.FLOAT, VertexFormatElement.EnumUsage.POSITION, DefaultVertexFormats.llIlIIlIIlIlII[1]);
        COLOR_4UB = new VertexFormatElement(DefaultVertexFormats.llIlIIlIIlIlII[0], VertexFormatElement.EnumType.UBYTE, VertexFormatElement.EnumUsage.COLOR, DefaultVertexFormats.llIlIIlIIlIlII[2]);
        TEX_2F = new VertexFormatElement(DefaultVertexFormats.llIlIIlIIlIlII[0], VertexFormatElement.EnumType.FLOAT, VertexFormatElement.EnumUsage.UV, DefaultVertexFormats.llIlIIlIIlIlII[3]);
        TEX_2S = new VertexFormatElement(DefaultVertexFormats.llIlIIlIIlIlII[4], VertexFormatElement.EnumType.SHORT, VertexFormatElement.EnumUsage.UV, DefaultVertexFormats.llIlIIlIIlIlII[3]);
        NORMAL_3B = new VertexFormatElement(DefaultVertexFormats.llIlIIlIIlIlII[0], VertexFormatElement.EnumType.BYTE, VertexFormatElement.EnumUsage.NORMAL, DefaultVertexFormats.llIlIIlIIlIlII[1]);
        PADDING_1B = new VertexFormatElement(DefaultVertexFormats.llIlIIlIIlIlII[0], VertexFormatElement.EnumType.BYTE, VertexFormatElement.EnumUsage.PADDING, DefaultVertexFormats.llIlIIlIIlIlII[4]);
        DefaultVertexFormats.BLOCK.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.BLOCK.func_181721_a(DefaultVertexFormats.COLOR_4UB);
        "".length();
        DefaultVertexFormats.BLOCK.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.BLOCK.func_181721_a(DefaultVertexFormats.TEX_2S);
        "".length();
        DefaultVertexFormats.ITEM.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.ITEM.func_181721_a(DefaultVertexFormats.COLOR_4UB);
        "".length();
        DefaultVertexFormats.ITEM.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.ITEM.func_181721_a(DefaultVertexFormats.NORMAL_3B);
        "".length();
        DefaultVertexFormats.ITEM.func_181721_a(DefaultVertexFormats.PADDING_1B);
        "".length();
        DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL.func_181721_a(DefaultVertexFormats.NORMAL_3B);
        "".length();
        DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL.func_181721_a(DefaultVertexFormats.PADDING_1B);
        "".length();
        DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP.func_181721_a(DefaultVertexFormats.COLOR_4UB);
        "".length();
        DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP.func_181721_a(DefaultVertexFormats.TEX_2S);
        "".length();
        DefaultVertexFormats.POSITION.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.POSITION_COLOR.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.POSITION_COLOR.func_181721_a(DefaultVertexFormats.COLOR_4UB);
        "".length();
        DefaultVertexFormats.POSITION_TEX.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.POSITION_TEX.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.POSITION_NORMAL.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.POSITION_NORMAL.func_181721_a(DefaultVertexFormats.NORMAL_3B);
        "".length();
        DefaultVertexFormats.POSITION_NORMAL.func_181721_a(DefaultVertexFormats.PADDING_1B);
        "".length();
        DefaultVertexFormats.POSITION_TEX_COLOR.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.POSITION_TEX_COLOR.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.POSITION_TEX_COLOR.func_181721_a(DefaultVertexFormats.COLOR_4UB);
        "".length();
        DefaultVertexFormats.POSITION_TEX_NORMAL.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.POSITION_TEX_NORMAL.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.POSITION_TEX_NORMAL.func_181721_a(DefaultVertexFormats.NORMAL_3B);
        "".length();
        DefaultVertexFormats.POSITION_TEX_NORMAL.func_181721_a(DefaultVertexFormats.PADDING_1B);
        "".length();
        DefaultVertexFormats.POSITION_TEX_LMAP_COLOR.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.POSITION_TEX_LMAP_COLOR.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.POSITION_TEX_LMAP_COLOR.func_181721_a(DefaultVertexFormats.TEX_2S);
        "".length();
        DefaultVertexFormats.POSITION_TEX_LMAP_COLOR.func_181721_a(DefaultVertexFormats.COLOR_4UB);
        "".length();
        DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL.func_181721_a(DefaultVertexFormats.POSITION_3F);
        "".length();
        DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL.func_181721_a(DefaultVertexFormats.TEX_2F);
        "".length();
        DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL.func_181721_a(DefaultVertexFormats.COLOR_4UB);
        "".length();
        DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL.func_181721_a(DefaultVertexFormats.NORMAL_3B);
        "".length();
        DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL.func_181721_a(DefaultVertexFormats.PADDING_1B);
        "".length();
    }
    
    private static void lIIlIIlIIllIIIIl() {
        (llIlIIlIIlIlII = new int[5])[0] = ((191 + 162 - 344 + 234 ^ 39 + 90 - 0 + 46) & (0xB9 ^ 0xAB ^ (0xD1 ^ 0x9F) ^ -" ".length()));
        DefaultVertexFormats.llIlIIlIIlIlII[1] = "   ".length();
        DefaultVertexFormats.llIlIIlIIlIlII[2] = (0x2E ^ 0x4 ^ (0xF ^ 0x21));
        DefaultVertexFormats.llIlIIlIIlIlII[3] = "  ".length();
        DefaultVertexFormats.llIlIIlIIlIlII[4] = " ".length();
    }
}
