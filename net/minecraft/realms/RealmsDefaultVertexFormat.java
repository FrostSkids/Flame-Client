// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.client.renderer.vertex.VertexFormat;

public class RealmsDefaultVertexFormat
{
    public static final /* synthetic */ RealmsVertexFormat POSITION_TEX_COLOR;
    public static final /* synthetic */ RealmsVertexFormat POSITION_TEX_NORMAL;
    private static final /* synthetic */ int[] llllIllllllII;
    public static final /* synthetic */ RealmsVertexFormatElement ELEMENT_COLOR;
    public static final /* synthetic */ RealmsVertexFormatElement ELEMENT_NORMAL;
    public static final /* synthetic */ RealmsVertexFormat POSITION_COLOR;
    public static final /* synthetic */ RealmsVertexFormatElement ELEMENT_UV1;
    public static final /* synthetic */ RealmsVertexFormat ENTITY;
    public static final /* synthetic */ RealmsVertexFormat POSITION_NORMAL;
    public static final /* synthetic */ RealmsVertexFormat PARTICLE;
    public static final /* synthetic */ RealmsVertexFormat POSITION_TEX_COLOR_NORMAL;
    public static final /* synthetic */ RealmsVertexFormat POSITION_TEX2_COLOR;
    public static final /* synthetic */ RealmsVertexFormat BLOCK;
    public static final /* synthetic */ RealmsVertexFormat BLOCK_NORMALS;
    public static final /* synthetic */ RealmsVertexFormat POSITION;
    public static final /* synthetic */ RealmsVertexFormat POSITION_TEX;
    public static final /* synthetic */ RealmsVertexFormatElement ELEMENT_PADDING;
    public static final /* synthetic */ RealmsVertexFormatElement ELEMENT_UV0;
    public static final /* synthetic */ RealmsVertexFormatElement ELEMENT_POSITION;
    
    private static void lIlIllIIlIlIIII() {
        (llllIllllllII = new int[5])[0] = ((0x89 ^ 0xB1) & ~(0x8E ^ 0xB6));
        RealmsDefaultVertexFormat.llllIllllllII[1] = "   ".length();
        RealmsDefaultVertexFormat.llllIllllllII[2] = (0x13 ^ 0x17);
        RealmsDefaultVertexFormat.llllIllllllII[3] = "  ".length();
        RealmsDefaultVertexFormat.llllIllllllII[4] = " ".length();
    }
    
    static {
        lIlIllIIlIlIIII();
        BLOCK = new RealmsVertexFormat(new VertexFormat());
        BLOCK_NORMALS = new RealmsVertexFormat(new VertexFormat());
        ENTITY = new RealmsVertexFormat(new VertexFormat());
        PARTICLE = new RealmsVertexFormat(new VertexFormat());
        POSITION = new RealmsVertexFormat(new VertexFormat());
        POSITION_COLOR = new RealmsVertexFormat(new VertexFormat());
        POSITION_TEX = new RealmsVertexFormat(new VertexFormat());
        POSITION_NORMAL = new RealmsVertexFormat(new VertexFormat());
        POSITION_TEX_COLOR = new RealmsVertexFormat(new VertexFormat());
        POSITION_TEX_NORMAL = new RealmsVertexFormat(new VertexFormat());
        POSITION_TEX2_COLOR = new RealmsVertexFormat(new VertexFormat());
        POSITION_TEX_COLOR_NORMAL = new RealmsVertexFormat(new VertexFormat());
        ELEMENT_POSITION = new RealmsVertexFormatElement(new VertexFormatElement(RealmsDefaultVertexFormat.llllIllllllII[0], VertexFormatElement.EnumType.FLOAT, VertexFormatElement.EnumUsage.POSITION, RealmsDefaultVertexFormat.llllIllllllII[1]));
        ELEMENT_COLOR = new RealmsVertexFormatElement(new VertexFormatElement(RealmsDefaultVertexFormat.llllIllllllII[0], VertexFormatElement.EnumType.UBYTE, VertexFormatElement.EnumUsage.COLOR, RealmsDefaultVertexFormat.llllIllllllII[2]));
        ELEMENT_UV0 = new RealmsVertexFormatElement(new VertexFormatElement(RealmsDefaultVertexFormat.llllIllllllII[0], VertexFormatElement.EnumType.FLOAT, VertexFormatElement.EnumUsage.UV, RealmsDefaultVertexFormat.llllIllllllII[3]));
        ELEMENT_UV1 = new RealmsVertexFormatElement(new VertexFormatElement(RealmsDefaultVertexFormat.llllIllllllII[4], VertexFormatElement.EnumType.SHORT, VertexFormatElement.EnumUsage.UV, RealmsDefaultVertexFormat.llllIllllllII[3]));
        ELEMENT_NORMAL = new RealmsVertexFormatElement(new VertexFormatElement(RealmsDefaultVertexFormat.llllIllllllII[0], VertexFormatElement.EnumType.BYTE, VertexFormatElement.EnumUsage.NORMAL, RealmsDefaultVertexFormat.llllIllllllII[1]));
        ELEMENT_PADDING = new RealmsVertexFormatElement(new VertexFormatElement(RealmsDefaultVertexFormat.llllIllllllII[0], VertexFormatElement.EnumType.BYTE, VertexFormatElement.EnumUsage.PADDING, RealmsDefaultVertexFormat.llllIllllllII[4]));
        RealmsDefaultVertexFormat.BLOCK.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.BLOCK.addElement(RealmsDefaultVertexFormat.ELEMENT_COLOR);
        "".length();
        RealmsDefaultVertexFormat.BLOCK.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.BLOCK.addElement(RealmsDefaultVertexFormat.ELEMENT_UV1);
        "".length();
        RealmsDefaultVertexFormat.BLOCK_NORMALS.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.BLOCK_NORMALS.addElement(RealmsDefaultVertexFormat.ELEMENT_COLOR);
        "".length();
        RealmsDefaultVertexFormat.BLOCK_NORMALS.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.BLOCK_NORMALS.addElement(RealmsDefaultVertexFormat.ELEMENT_NORMAL);
        "".length();
        RealmsDefaultVertexFormat.BLOCK_NORMALS.addElement(RealmsDefaultVertexFormat.ELEMENT_PADDING);
        "".length();
        RealmsDefaultVertexFormat.ENTITY.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.ENTITY.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.ENTITY.addElement(RealmsDefaultVertexFormat.ELEMENT_NORMAL);
        "".length();
        RealmsDefaultVertexFormat.ENTITY.addElement(RealmsDefaultVertexFormat.ELEMENT_PADDING);
        "".length();
        RealmsDefaultVertexFormat.PARTICLE.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.PARTICLE.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.PARTICLE.addElement(RealmsDefaultVertexFormat.ELEMENT_COLOR);
        "".length();
        RealmsDefaultVertexFormat.PARTICLE.addElement(RealmsDefaultVertexFormat.ELEMENT_UV1);
        "".length();
        RealmsDefaultVertexFormat.POSITION.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.POSITION_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.POSITION_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_COLOR);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.POSITION_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.POSITION_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_NORMAL);
        "".length();
        RealmsDefaultVertexFormat.POSITION_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_PADDING);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_COLOR);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_NORMAL);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_PADDING);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX2_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX2_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX2_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_UV1);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX2_COLOR.addElement(RealmsDefaultVertexFormat.ELEMENT_COLOR);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_COLOR_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_POSITION);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_COLOR_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_UV0);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_COLOR_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_COLOR);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_COLOR_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_NORMAL);
        "".length();
        RealmsDefaultVertexFormat.POSITION_TEX_COLOR_NORMAL.addElement(RealmsDefaultVertexFormat.ELEMENT_PADDING);
        "".length();
    }
}
