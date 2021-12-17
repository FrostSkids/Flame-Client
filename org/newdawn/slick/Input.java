// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import org.lwjgl.opengl.Display;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.util.Log;
import org.lwjgl.input.Controllers;
import java.util.Arrays;
import java.util.Collection;
import org.lwjgl.input.Keyboard;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.input.Controller;
import org.lwjgl.input.Mouse;
import java.util.HashSet;
import java.util.ArrayList;

public class Input
{
    private /* synthetic */ int mouseClickTolerance;
    private static final /* synthetic */ String[] lIlIIllIIIlllI;
    private /* synthetic */ int keyRepeatInterval;
    private /* synthetic */ float yoffset;
    protected /* synthetic */ ArrayList mouseListeners;
    private /* synthetic */ int lastMouseY;
    protected /* synthetic */ long[] nextRepeat;
    private /* synthetic */ boolean[][] controllerPressed;
    private /* synthetic */ int lastMouseX;
    protected /* synthetic */ ArrayList controllerListeners;
    private /* synthetic */ int clickButton;
    protected /* synthetic */ boolean consumed;
    protected /* synthetic */ ArrayList keyListeners;
    private static /* synthetic */ boolean controllersInited;
    private /* synthetic */ boolean paused;
    private static /* synthetic */ ArrayList controllers;
    protected /* synthetic */ ArrayList keyListenersToAdd;
    private /* synthetic */ int keyRepeatInitial;
    private /* synthetic */ int height;
    private /* synthetic */ int wheel;
    private /* synthetic */ int pressedY;
    protected /* synthetic */ char[] keys;
    protected /* synthetic */ ArrayList mouseListenersToAdd;
    private /* synthetic */ boolean displayActive;
    private /* synthetic */ float scaleY;
    private /* synthetic */ float xoffset;
    private /* synthetic */ int clickX;
    protected /* synthetic */ HashSet allListeners;
    private /* synthetic */ long doubleClickTimeout;
    private /* synthetic */ int pressedX;
    private /* synthetic */ boolean[][] controls;
    private /* synthetic */ float scaleX;
    private /* synthetic */ int clickY;
    private /* synthetic */ boolean keyRepeat;
    private static final /* synthetic */ int[] lIlIIllIIlIIlI;
    protected /* synthetic */ boolean[] mousePressed;
    protected /* synthetic */ boolean[] pressed;
    private /* synthetic */ int doubleClickDelay;
    
    public int getAbsoluteMouseX() {
        return Mouse.getX();
    }
    
    public boolean isButtonPressed(final int lllllllllllllIIIllIlIIIIIlIIlIII, final int lllllllllllllIIIllIlIIIIIlIIlIlI) {
        if (lllIIllllIIIlII(lllllllllllllIIIllIlIIIIIlIIlIlI, this.getControllerCount())) {
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        if (lllIIllllIIIlIl(lllllllllllllIIIllIlIIIIIlIIlIlI, Input.lIlIIllIIlIIlI[7])) {
            int lllllllllllllIIIllIlIIIIIlIIllIl = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIlIIllIl, Input.controllers.size())) {
                if (lllIIllllIIIIII(this.isButtonPressed(lllllllllllllIIIllIlIIIIIlIIlIII, lllllllllllllIIIllIlIIIIIlIIllIl) ? 1 : 0)) {
                    return Input.lIlIIllIIlIIlI[0] != 0;
                }
                ++lllllllllllllIIIllIlIIIIIlIIllIl;
                "".length();
                if ("   ".length() == 0) {
                    return ((0x36 ^ 0x6A) & ~(0x5F ^ 0x3)) != 0x0;
                }
            }
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        return Input.controllers.get(lllllllllllllIIIllIlIIIIIlIIlIlI).isButtonPressed(lllllllllllllIIIllIlIIIIIlIIlIII);
    }
    
    private static String lllIIlllIllIllI(String lllllllllllllIIIllIIllllIllIlIII, final String lllllllllllllIIIllIIllllIllIllII) {
        lllllllllllllIIIllIIllllIllIlIII = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIllllIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIllllIllIlIll = new StringBuilder();
        final char[] lllllllllllllIIIllIIllllIllIlIlI = lllllllllllllIIIllIIllllIllIllII.toCharArray();
        int lllllllllllllIIIllIIllllIllIlIIl = Input.lIlIIllIIlIIlI[5];
        final String lllllllllllllIIIllIIllllIllIIIIl = (Object)lllllllllllllIIIllIIllllIllIlIII.toCharArray();
        final short lllllllllllllIIIllIIllllIlIlllll = (short)lllllllllllllIIIllIIllllIllIIIIl.length;
        short lllllllllllllIIIllIIllllIlIlllIl = (short)Input.lIlIIllIIlIIlI[5];
        while (lllIIllllIIIIlI(lllllllllllllIIIllIIllllIlIlllIl, lllllllllllllIIIllIIllllIlIlllll)) {
            final char lllllllllllllIIIllIIllllIllIlllI = lllllllllllllIIIllIIllllIllIIIIl[lllllllllllllIIIllIIllllIlIlllIl];
            lllllllllllllIIIllIIllllIllIlIll.append((char)(lllllllllllllIIIllIIllllIllIlllI ^ lllllllllllllIIIllIIllllIllIlIlI[lllllllllllllIIIllIIllllIllIlIIl % lllllllllllllIIIllIIllllIllIlIlI.length]));
            "".length();
            ++lllllllllllllIIIllIIllllIllIlIIl;
            ++lllllllllllllIIIllIIllllIlIlllIl;
            "".length();
            if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIllllIllIlIll);
    }
    
    public boolean isControllerUp(final int lllllllllllllIIIllIlIIIIIlIllllI) {
        if (lllIIllllIIIlII(lllllllllllllIIIllIlIIIIIlIllllI, this.getControllerCount())) {
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        if (lllIIllllIIIlIl(lllllllllllllIIIllIlIIIIIlIllllI, Input.lIlIIllIIlIIlI[7])) {
            int lllllllllllllIIIllIlIIIIIllIIIII = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIllIIIII, Input.controllers.size())) {
                if (lllIIllllIIIIII(this.isControllerUp(lllllllllllllIIIllIlIIIIIllIIIII) ? 1 : 0)) {
                    return Input.lIlIIllIIlIIlI[0] != 0;
                }
                ++lllllllllllllIIIllIlIIIIIllIIIII;
                "".length();
                if (null != null) {
                    return ((0xD9 ^ 0xA7 ^ (0x44 ^ 0x1F)) & (0x6D ^ 0x4 ^ (0xD3 ^ 0x9F) ^ -" ".length())) != 0x0;
                }
            }
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        int n;
        if (!lllIIllllIIIllI(lllIIllllIIlIll(Input.controllers.get(lllllllllllllIIIllIlIIIIIlIllllI).getYAxisValue(), -0.5f)) || lllIIllllIIIlll(lllIIllllIIlIll(Input.controllers.get(lllllllllllllIIIllIlIIIIIlIllllI).getPovY(), -0.5f))) {
            n = Input.lIlIIllIIlIIlI[0];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x89 ^ 0xC3 ^ (0x6B ^ 0xA)) & (0x58 ^ 0x38 ^ (0x28 ^ 0x63) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Input.lIlIIllIIlIIlI[5];
        }
        return n != 0;
    }
    
    private void addKeyListenerImpl(final KeyListener lllllllllllllIIIllIlIIIlIIIlIIII) {
        if (lllIIllllIIIIII(this.keyListeners.contains(lllllllllllllIIIllIlIIIlIIIlIIII) ? 1 : 0)) {
            return;
        }
        this.keyListeners.add(lllllllllllllIIIllIlIIIlIIIlIIII);
        "".length();
        this.allListeners.add(lllllllllllllIIIllIlIIIlIIIlIIII);
        "".length();
    }
    
    public static String getKeyName(final int lllllllllllllIIIllIlIIIIllIIllII) {
        return Keyboard.getKeyName(lllllllllllllIIIllIlIIIIllIIllII);
    }
    
    private static void lllIIlllIllllll() {
        (lIlIIllIIlIIlI = new int[128])[0] = " ".length();
        Input.lIlIIllIIlIIlI[1] = (0xCE ^ 0xC4);
        Input.lIlIIllIIlIIlI[2] = (0xA0 ^ 0xC4);
        Input.lIlIIllIIlIIlI[3] = (0xFFFFFC8B & 0x774);
        Input.lIlIIllIIlIIlI[4] = (" ".length() ^ (0xAA ^ 0xC5));
        Input.lIlIIllIIlIIlI[5] = ("  ".length() & ("  ".length() ^ -" ".length()));
        Input.lIlIIllIIlIIlI[6] = (0x7B ^ 0x5A) + (0x65 ^ 0x5) - -(0x80 ^ 0x93) + (0x14 ^ 0x72);
        Input.lIlIIllIIlIIlI[7] = -" ".length();
        Input.lIlIIllIIlIIlI[8] = (0xB5 ^ 0xB0);
        Input.lIlIIllIIlIIlI[9] = "   ".length();
        Input.lIlIIllIIlIIlI[10] = "  ".length();
        Input.lIlIIllIIlIIlI[11] = (0x36 ^ 0x32);
        Input.lIlIIllIIlIIlI[12] = (0x63 ^ 0x5E);
        Input.lIlIIllIIlIIlI[13] = (0x28 ^ 0x25);
        Input.lIlIIllIIlIIlI[14] = (0x1 ^ 0x19);
        Input.lIlIIllIIlIIlI[15] = (0x53 ^ 0x55);
        Input.lIlIIllIIlIIlI[16] = (0xF9 ^ 0xB6) + (0xA0 ^ 0x95) - (0xF7 ^ 0x9B) + (82 + 24 + 10 + 57);
        Input.lIlIIllIIlIIlI[17] = (0x9A ^ 0xB9);
        Input.lIlIIllIIlIIlI[18] = (0xA8 ^ 0xB1);
        Input.lIlIIllIIlIIlI[19] = (0x8D ^ 0x9B) + (0x61 ^ 0x17) - (0xAF ^ 0xB8) + (0x2A ^ 0x77);
        Input.lIlIIllIIlIIlI[20] = (0x24 ^ 0x4);
        Input.lIlIIllIIlIIlI[21] = (0x9 ^ 0x37 ^ (0xD5 ^ 0xC6));
        Input.lIlIIllIIlIIlI[22] = (0xB9 ^ 0xA0) + (0x28 ^ 0x1D) - -(0x96 ^ 0xA5) + (0x3B ^ 0xC);
        Input.lIlIIllIIlIIlI[23] = (((0x33 ^ 0x79) & ~(0xF0 ^ 0xBA)) ^ (0x2A ^ 0x3E));
        Input.lIlIIllIIlIIlI[24] = (0x6C ^ 0x57);
        Input.lIlIIllIIlIIlI[25] = (0x30 ^ 0x67 ^ (0xEB ^ 0x84));
        Input.lIlIIllIIlIIlI[26] = (0x75 ^ 0x7A);
        Input.lIlIIllIIlIIlI[27] = (0x6F ^ 0x1F) + (0xB0 ^ 0xA6) - -(0x7E ^ 0x48) + (0x58 ^ 0x47);
        Input.lIlIIllIIlIIlI[28] = (0x59 ^ 0x7E);
        Input.lIlIIllIIlIIlI[29] = (0x5E ^ 0x71 ^ (0xCF ^ 0x86));
        Input.lIlIIllIIlIIlI[30] = 50 + 43 - 87 + 139;
        Input.lIlIIllIIlIIlI[31] = (0x30 ^ 0x1E) + (0xBA ^ 0xAD) - (0xBB ^ 0x98) + (0xE4 ^ 0x95);
        Input.lIlIIllIIlIIlI[32] = (104 + 168 - 184 + 88 ^ 55 + 128 - 93 + 85);
        Input.lIlIIllIIlIIlI[33] = 126 + 200 - 149 + 45;
        Input.lIlIIllIIlIIlI[34] = (0xCD ^ 0x9D);
        Input.lIlIIllIIlIIlI[35] = (0x38 ^ 0x40) + (0x26 ^ 0x36) - (0x35 ^ 0xA) + (102 + 79 - 139 + 85);
        Input.lIlIIllIIlIIlI[36] = (0x8D ^ 0x9F);
        Input.lIlIIllIIlIIlI[37] = (55 + 130 - 52 + 50 ^ 47 + 68 - 66 + 96);
        Input.lIlIIllIIlIIlI[38] = (0xBB ^ 0x91 ^ (0xFC ^ 0x9C));
        Input.lIlIIllIIlIIlI[39] = (0x5 ^ 0x3B);
        Input.lIlIIllIIlIIlI[40] = (0x43 ^ 0x4);
        Input.lIlIIllIIlIIlI[41] = (0x48 ^ 0x19);
        Input.lIlIIllIIlIIlI[42] = (0x55 ^ 0x11);
        Input.lIlIIllIIlIIlI[43] = (0xF9 ^ 0xC5 ^ (0xD5 ^ 0xA5));
        Input.lIlIIllIIlIIlI[44] = (42 + 91 - 125 + 122 ^ 91 + 49 - 60 + 58);
        Input.lIlIIllIIlIIlI[45] = (0x24 ^ 0x3C ^ (0x34 ^ 0x22));
        Input.lIlIIllIIlIIlI[46] = 99 + 159 - 137 + 51 + (167 + 35 - 195 + 176) - (140 + 132 - 129 + 76) + (0x15 ^ 0x42);
        Input.lIlIIllIIlIIlI[47] = (0x76 ^ 0x15 ^ (0x54 ^ 0x3));
        Input.lIlIIllIIlIIlI[48] = (0x4D ^ 0x4A ^ (0x8F ^ 0xC0));
        Input.lIlIIllIIlIIlI[49] = (125 + 204 - 272 + 149 ^ 7 + 67 + 75 + 1);
        Input.lIlIIllIIlIIlI[50] = (122 + 61 - 63 + 11 ^ 112 + 53 - 117 + 88);
        Input.lIlIIllIIlIIlI[51] = (0x11 ^ 0x2B);
        Input.lIlIIllIIlIIlI[52] = (0x3B ^ 0x9 ^ (0x60 ^ 0x45));
        Input.lIlIIllIIlIIlI[53] = (0x15 ^ 0x76 ^ (0x1F ^ 0x43));
        Input.lIlIIllIIlIIlI[54] = (0xEB ^ 0xAC ^ (0xEE ^ 0x9A));
        Input.lIlIIllIIlIIlI[55] = (0x78 ^ 0x5A);
        Input.lIlIIllIIlIIlI[56] = (0x34 ^ 0x72);
        Input.lIlIIllIIlIIlI[57] = (0x6D ^ 0x64);
        Input.lIlIIllIIlIIlI[58] = (0x1C ^ 0x6D ^ (0xF8 ^ 0x95));
        Input.lIlIIllIIlIIlI[59] = (0x19 ^ 0x2F);
        Input.lIlIIllIIlIIlI[60] = (135 + 129 - 236 + 182 ^ 140 + 40 - 74 + 40);
        Input.lIlIIllIIlIIlI[61] = (0x12 ^ 0x2A) + (0xE5 ^ 0xA1) - (0xF0 ^ 0x83) + (36 + 12 + 39 + 48);
        Input.lIlIIllIIlIIlI[62] = (0x93 ^ 0xC6) + (76 + 129 - 104 + 44) - (177 + 27 - 52 + 43) + (4 + 5 + 129 + 34);
        Input.lIlIIllIIlIIlI[63] = (0x17 ^ 0x3F);
        Input.lIlIIllIIlIIlI[64] = (0xC ^ 0x75);
        Input.lIlIIllIIlIIlI[65] = (0x88 ^ 0xB4);
        Input.lIlIIllIIlIIlI[66] = (0xB3 ^ 0xAE);
        Input.lIlIIllIIlIIlI[67] = (10 + 153 - 101 + 120 ^ 90 + 26 - 49 + 90);
        Input.lIlIIllIIlIIlI[68] = 122 + 76 - 175 + 118 + (0x1D ^ 0x43) - (65 + 82 - 142 + 146) + (0x86 ^ 0xC5);
        Input.lIlIIllIIlIIlI[69] = (0x7C ^ 0x4D);
        Input.lIlIIllIIlIIlI[70] = (0x57 ^ 0x15);
        Input.lIlIIllIIlIIlI[71] = (0xC9 ^ 0x8F) + (122 + 37 - 120 + 99) - (0x53 ^ 0x3B) + (0x81 ^ 0xAF);
        Input.lIlIIllIIlIIlI[72] = (0x2A ^ 0x60) + (95 + 64 - 88 + 72) - (0xB ^ 0x30) + (0x2D ^ 0x0);
        Input.lIlIIllIIlIIlI[73] = (0xD ^ 0x28 ^ (0xB7 ^ 0x88));
        Input.lIlIIllIIlIIlI[74] = (0xB5 ^ 0xAE);
        Input.lIlIIllIIlIIlI[75] = (0x66 ^ 0x31 ^ (0xE6 ^ 0x9F));
        Input.lIlIIllIIlIIlI[76] = (0xA8 ^ 0x9D);
        Input.lIlIIllIIlIIlI[77] = (0x2C ^ 0x3D);
        Input.lIlIIllIIlIIlI[78] = (0x1C ^ 0x5D);
        Input.lIlIIllIIlIIlI[79] = 130 + 25 - 84 + 64 + (0x15 ^ 0x42) - (0x7B ^ 0x27) + (0x9A ^ 0xC0);
        Input.lIlIIllIIlIIlI[80] = (0x76 ^ 0x5A);
        Input.lIlIIllIIlIIlI[81] = (0xFC ^ 0xB6 ^ " ".length());
        Input.lIlIIllIIlIIlI[82] = 74 + 145 - 189 + 116;
        Input.lIlIIllIIlIIlI[83] = (0x55 ^ 0x46 ^ (0x5C ^ 0x6));
        Input.lIlIIllIIlIIlI[84] = (0x2F ^ 0x24) + (0x86 ^ 0xAE) - -(0xAC ^ 0x8E) + (0xC3 ^ 0x9D);
        Input.lIlIIllIIlIIlI[85] = (0x1F ^ 0x20) + (108 + 52 - 34 + 21) - (171 + 129 - 281 + 189) + (132 + 181 - 262 + 152);
        Input.lIlIIllIIlIIlI[86] = 67 + 168 - 195 + 171;
        Input.lIlIIllIIlIIlI[87] = (0x66 ^ 0x1 ^ (0xF1 ^ 0xB7));
        Input.lIlIIllIIlIIlI[88] = (0xD3 ^ 0xBF ^ (0x46 ^ 0x7D));
        Input.lIlIIllIIlIIlI[89] = (0x68 ^ 0x20 ^ (0x19 ^ 0x41));
        Input.lIlIIllIIlIIlI[90] = 0 + 154 - 52 + 55;
        Input.lIlIIllIIlIIlI[91] = (0xE ^ 0x3A ^ (0x37 ^ 0x3A));
        Input.lIlIIllIIlIIlI[92] = (0x1B ^ 0x2A) + (0x36 ^ 0x5E) - (0x50 ^ 0x66) + (0xF7 ^ 0x91);
        Input.lIlIIllIIlIIlI[93] = (87 + 67 - 66 + 156 ^ 85 + 31 - 91 + 120);
        Input.lIlIIllIIlIIlI[94] = 55 + 125 - 87 + 116;
        Input.lIlIIllIIlIIlI[95] = (0x74 ^ 0x5C ^ (0xD0 ^ 0xB6));
        Input.lIlIIllIIlIIlI[96] = (150 + 56 - 98 + 100 ^ 22 + 135 - 137 + 151);
        Input.lIlIIllIIlIIlI[97] = (0x1 ^ 0x63 ^ (0xED ^ 0x83));
        Input.lIlIIllIIlIIlI[98] = (0x25 ^ 0x60) + (0x44 ^ 0xE) - (0x21 ^ 0x63) + (0x6A ^ 0x2D);
        Input.lIlIIllIIlIIlI[99] = (133 + 94 - 109 + 49 ^ 103 + 114 - 127 + 61);
        Input.lIlIIllIIlIIlI[100] = (0xCB ^ 0x85) + (0x49 ^ 0x59) - -(0x37 ^ 0x63) + (0x87 ^ 0x82);
        Input.lIlIIllIIlIIlI[101] = (0x9E ^ 0xB1);
        Input.lIlIIllIIlIIlI[102] = 95 + 90 - 83 + 47;
        Input.lIlIIllIIlIIlI[103] = 124 + 11 - 120 + 193;
        Input.lIlIIllIIlIIlI[104] = (23 + 107 - 30 + 86 ^ 170 + 76 - 179 + 122);
        Input.lIlIIllIIlIIlI[105] = (66 + 183 - 119 + 57 ^ 6 + 99 + 15 + 53);
        Input.lIlIIllIIlIIlI[106] = 104 + 5 - 37 + 111 + (110 + 29 - 57 + 91) - (0xFFFFC9EF & 0x375F) + (58 + 3 + 73 + 44);
        Input.lIlIIllIIlIIlI[107] = (0xA6 ^ 0x94);
        Input.lIlIIllIIlIIlI[108] = (87 + 14 + 14 + 95 ^ 0 + 17 + 83 + 29);
        Input.lIlIIllIIlIIlI[109] = 24 + 24 + 29 + 104;
        Input.lIlIIllIIlIIlI[110] = (0x4C ^ 0x2 ^ (0xF6 ^ 0xAD));
        Input.lIlIIllIIlIIlI[111] = " ".length() + (0xFE ^ 0xBA) - -(0xBD ^ 0x8F) + (0x9A ^ 0xBF);
        Input.lIlIIllIIlIIlI[112] = (0x6D ^ 0x49);
        Input.lIlIIllIIlIIlI[113] = 100 + 44 - 88 + 78 + (0xC9 ^ 0x91) - (164 + 82 - 116 + 45) + (0x49 ^ 0x17);
        Input.lIlIIllIIlIIlI[114] = (0x92 ^ 0xB8);
        Input.lIlIIllIIlIIlI[115] = (0x6A ^ 0x27);
        Input.lIlIIllIIlIIlI[116] = (242 + 181 - 325 + 148 ^ 116 + 174 - 151 + 40);
        Input.lIlIIllIIlIIlI[117] = (0x5 ^ 0x5B ^ (0xC4 ^ 0x84));
        Input.lIlIIllIIlIIlI[118] = (115 + 124 - 120 + 20 ^ 113 + 110 - 77 + 6);
        Input.lIlIIllIIlIIlI[119] = (0xB ^ 0x3C);
        Input.lIlIIllIIlIIlI[120] = (0xF4 ^ 0xC0) + (0x2F ^ 0x69) - (0xE7 ^ 0xA4) + (13 + 67 - 9 + 95);
        Input.lIlIIllIIlIIlI[121] = (0x8B ^ 0xA2);
        Input.lIlIIllIIlIIlI[122] = (0xF9 ^ 0x89);
        Input.lIlIIllIIlIIlI[123] = (94 + 43 - 68 + 104 ^ 108 + 74 - 50 + 4);
        Input.lIlIIllIIlIIlI[124] = (0x1 ^ 0x7C);
        Input.lIlIIllIIlIIlI[125] = (0x49 ^ 0x1A ^ (0x5C ^ 0x40));
        Input.lIlIIllIIlIIlI[126] = (179 + 51 - 156 + 157 ^ 167 + 61 - 177 + 130);
        Input.lIlIIllIIlIIlI[127] = (0xDF ^ 0x9C);
    }
    
    public boolean isKeyRepeatEnabled() {
        return Keyboard.areRepeatEventsEnabled();
    }
    
    public void removeAllMouseListeners() {
        this.allListeners.removeAll(this.mouseListeners);
        "".length();
        this.mouseListeners.clear();
    }
    
    static {
        lllIIlllIllllll();
        lllIIlllIllIlll();
        KEY_PAUSE = Input.lIlIIllIIlIIlI[16];
        KEY_H = Input.lIlIIllIIlIIlI[17];
        KEY_P = Input.lIlIIllIIlIIlI[18];
        KEY_INSERT = Input.lIlIIllIIlIIlI[19];
        KEY_D = Input.lIlIIllIIlIIlI[20];
        KEY_X = Input.lIlIIllIIlIIlI[21];
        KEY_RALT = Input.lIlIIllIIlIIlI[22];
        KEY_T = Input.lIlIIllIIlIIlI[23];
        KEY_F1 = Input.lIlIIllIIlIIlI[24];
        KEY_LALT = Input.lIlIIllIIlIIlI[25];
        KEY_TAB = Input.lIlIIllIIlIIlI[26];
        KEY_LWIN = Input.lIlIIllIIlIIlI[27];
        KEY_SEMICOLON = Input.lIlIIllIIlIIlI[28];
        KEY_F15 = Input.lIlIIllIIlIIlI[29];
        KEY_AT = Input.lIlIIllIIlIIlI[30];
        KEY_UNDERLINE = Input.lIlIIllIIlIIlI[31];
        KEY_S = Input.lIlIIllIIlIIlI[32];
        KEY_POWER = Input.lIlIIllIIlIIlI[33];
        KEY_NUMPAD2 = Input.lIlIIllIIlIIlI[34];
        KEY_LMENU = Input.lIlIIllIIlIIlI[25];
        KEY_UP = Input.lIlIIllIIlIIlI[35];
        KEY_E = Input.lIlIIllIIlIIlI[36];
        KEY_L = Input.lIlIIllIIlIIlI[37];
        KEY_SUBTRACT = Input.lIlIIllIIlIIlI[38];
        KEY_F4 = Input.lIlIIllIIlIIlI[39];
        KEY_NUMPAD7 = Input.lIlIIllIIlIIlI[40];
        KEY_NUMPAD3 = Input.lIlIIllIIlIIlI[41];
        KEY_F10 = Input.lIlIIllIIlIIlI[42];
        KEY_NUMPAD5 = Input.lIlIIllIIlIIlI[43];
        KEY_7 = Input.lIlIIllIIlIIlI[44];
        BUTTON1 = Input.lIlIIllIIlIIlI[11];
        KEY_BACK = Input.lIlIIllIIlIIlI[45];
        KEY_SLEEP = Input.lIlIIllIIlIIlI[46];
        KEY_PERIOD = Input.lIlIIllIIlIIlI[47];
        KEY_NUMPAD8 = Input.lIlIIllIIlIIlI[48];
        BUTTON10 = Input.lIlIIllIIlIIlI[13];
        KEY_F12 = Input.lIlIIllIIlIIlI[49];
        BUTTON8 = Input.lIlIIllIIlIIlI[50];
        KEY_CAPITAL = Input.lIlIIllIIlIIlI[51];
        KEY_I = Input.lIlIIllIIlIIlI[52];
        MOUSE_LEFT_BUTTON = Input.lIlIIllIIlIIlI[5];
        KEY_F5 = Input.lIlIIllIIlIIlI[53];
        KEY_COMMA = Input.lIlIIllIIlIIlI[54];
        BUTTON5 = Input.lIlIIllIIlIIlI[44];
        KEY_G = Input.lIlIIllIIlIIlI[55];
        KEY_SCROLL = Input.lIlIIllIIlIIlI[56];
        KEY_8 = Input.lIlIIllIIlIIlI[57];
        KEY_RETURN = Input.lIlIIllIIlIIlI[58];
        KEY_RSHIFT = Input.lIlIIllIIlIIlI[59];
        KEY_F6 = Input.lIlIIllIIlIIlI[60];
        KEY_CIRCUMFLEX = Input.lIlIIllIIlIIlI[61];
        KEY_9 = Input.lIlIIllIIlIIlI[1];
        KEY_END = Input.lIlIIllIIlIIlI[62];
        KEY_APOSTROPHE = Input.lIlIIllIIlIIlI[63];
        KEY_EQUALS = Input.lIlIIllIIlIIlI[13];
        KEY_CONVERT = Input.lIlIIllIIlIIlI[64];
        KEY_O = Input.lIlIIllIIlIIlI[14];
        KEY_F2 = Input.lIlIIllIIlIIlI[65];
        KEY_LCONTROL = Input.lIlIIllIIlIIlI[66];
        KEY_BACKSLASH = Input.lIlIIllIIlIIlI[67];
        KEY_UNLABELED = Input.lIlIIllIIlIIlI[68];
        KEY_N = Input.lIlIIllIIlIIlI[69];
        KEY_F8 = Input.lIlIIllIIlIIlI[70];
        KEY_AX = Input.lIlIIllIIlIIlI[71];
        KEY_RMENU = Input.lIlIIllIIlIIlI[22];
        KEY_LEFT = Input.lIlIIllIIlIIlI[72];
        KEY_LBRACKET = Input.lIlIIllIIlIIlI[73];
        BUTTON2 = Input.lIlIIllIIlIIlI[8];
        KEY_RBRACKET = Input.lIlIIllIIlIIlI[74];
        KEY_ESCAPE = Input.lIlIIllIIlIIlI[0];
        KEY_C = Input.lIlIIllIIlIIlI[75];
        KEY_SLASH = Input.lIlIIllIIlIIlI[76];
        KEY_W = Input.lIlIIllIIlIIlI[77];
        KEY_F7 = Input.lIlIIllIIlIIlI[78];
        KEY_RWIN = Input.lIlIIllIIlIIlI[79];
        KEY_Z = Input.lIlIIllIIlIIlI[80];
        KEY_NUMPAD4 = Input.lIlIIllIIlIIlI[81];
        KEY_COLON = Input.lIlIIllIIlIIlI[82];
        KEY_F3 = Input.lIlIIllIIlIIlI[12];
        KEY_NUMPAD9 = Input.lIlIIllIIlIIlI[83];
        KEY_NUMPADCOMMA = Input.lIlIIllIIlIIlI[84];
        KEY_RIGHT = Input.lIlIIllIIlIIlI[85];
        KEY_1 = Input.lIlIIllIIlIIlI[10];
        KEY_DELETE = Input.lIlIIllIIlIIlI[86];
        BUTTON6 = Input.lIlIIllIIlIIlI[57];
        KEY_F = Input.lIlIIllIIlIIlI[87];
        RIGHT = Input.lIlIIllIIlIIlI[0];
        KEY_F11 = Input.lIlIIllIIlIIlI[88];
        KEY_Q = Input.lIlIIllIIlIIlI[89];
        KEY_RCONTROL = Input.lIlIIllIIlIIlI[90];
        KEY_SPACE = Input.lIlIIllIIlIIlI[91];
        KEY_PRIOR = Input.lIlIIllIIlIIlI[92];
        KEY_ENTER = Input.lIlIIllIIlIIlI[58];
        KEY_F14 = Input.lIlIIllIIlIIlI[93];
        KEY_NEXT = Input.lIlIIllIIlIIlI[94];
        KEY_ADD = Input.lIlIIllIIlIIlI[95];
        KEY_NOCONVERT = Input.lIlIIllIIlIIlI[96];
        KEY_5 = Input.lIlIIllIIlIIlI[15];
        BUTTON9 = Input.lIlIIllIIlIIlI[97];
        KEY_KANJI = Input.lIlIIllIIlIIlI[98];
        KEY_B = Input.lIlIIllIIlIIlI[99];
        KEY_MINUS = Input.lIlIIllIIlIIlI[97];
        KEY_SYSRQ = Input.lIlIIllIIlIIlI[100];
        KEY_V = Input.lIlIIllIIlIIlI[101];
        KEY_STOP = Input.lIlIIllIIlIIlI[102];
        KEY_DOWN = Input.lIlIIllIIlIIlI[103];
        BUTTON4 = Input.lIlIIllIIlIIlI[104];
        KEY_2 = Input.lIlIIllIIlIIlI[9];
        KEY_U = Input.lIlIIllIIlIIlI[105];
        KEY_HOME = Input.lIlIIllIIlIIlI[106];
        KEY_M = Input.lIlIIllIIlIIlI[107];
        KEY_4 = Input.lIlIIllIIlIIlI[8];
        KEY_3 = Input.lIlIIllIIlIIlI[11];
        KEY_DECIMAL = Input.lIlIIllIIlIIlI[108];
        ANY_CONTROLLER = Input.lIlIIllIIlIIlI[7];
        KEY_DIVIDE = Input.lIlIIllIIlIIlI[109];
        KEY_Y = Input.lIlIIllIIlIIlI[110];
        KEY_NUMPADENTER = Input.lIlIIllIIlIIlI[111];
        UP = Input.lIlIIllIIlIIlI[10];
        KEY_J = Input.lIlIIllIIlIIlI[112];
        KEY_NUMPADEQUALS = Input.lIlIIllIIlIIlI[113];
        KEY_LSHIFT = Input.lIlIIllIIlIIlI[114];
        KEY_NUMPAD6 = Input.lIlIIllIIlIIlI[115];
        MOUSE_RIGHT_BUTTON = Input.lIlIIllIIlIIlI[0];
        KEY_6 = Input.lIlIIllIIlIIlI[104];
        KEY_0 = Input.lIlIIllIIlIIlI[50];
        BUTTON3 = Input.lIlIIllIIlIIlI[15];
        LEFT = Input.lIlIIllIIlIIlI[5];
        KEY_NUMLOCK = Input.lIlIIllIIlIIlI[116];
        KEY_A = Input.lIlIIllIIlIIlI[117];
        KEY_R = Input.lIlIIllIIlIIlI[118];
        KEY_MULTIPLY = Input.lIlIIllIIlIIlI[119];
        MOUSE_MIDDLE_BUTTON = Input.lIlIIllIIlIIlI[10];
        KEY_APPS = Input.lIlIIllIIlIIlI[120];
        KEY_GRAVE = Input.lIlIIllIIlIIlI[121];
        KEY_KANA = Input.lIlIIllIIlIIlI[122];
        KEY_K = Input.lIlIIllIIlIIlI[123];
        KEY_YEN = Input.lIlIIllIIlIIlI[124];
        KEY_F13 = Input.lIlIIllIIlIIlI[2];
        MAX_BUTTONS = Input.lIlIIllIIlIIlI[2];
        KEY_NUMPAD1 = Input.lIlIIllIIlIIlI[125];
        KEY_NUMPAD0 = Input.lIlIIllIIlIIlI[126];
        DOWN = Input.lIlIIllIIlIIlI[9];
        KEY_F9 = Input.lIlIIllIIlIIlI[127];
        BUTTON7 = Input.lIlIIllIIlIIlI[1];
        Input.controllersInited = (Input.lIlIIllIIlIIlI[5] != 0);
        Input.controllers = new ArrayList();
    }
    
    public boolean isMousePressed(final int lllllllllllllIIIllIlIIIIlIllllll) {
        if (lllIIllllIIIIII(this.mousePressed[lllllllllllllIIIllIlIIIIlIllllll] ? 1 : 0)) {
            this.mousePressed[lllllllllllllIIIllIlIIIIlIllllll] = (Input.lIlIIllIIlIIlI[5] != 0);
            return Input.lIlIIllIIlIIlI[0] != 0;
        }
        return Input.lIlIIllIIlIIlI[5] != 0;
    }
    
    public Input(final int lllllllllllllIIIllIlIIIlIlIIIlIl) {
        this.mousePressed = new boolean[Input.lIlIIllIIlIIlI[1]];
        this.controllerPressed = new boolean[Input.lIlIIllIIlIIlI[2]][Input.lIlIIllIIlIIlI[2]];
        this.keys = new char[Input.lIlIIllIIlIIlI[3]];
        this.pressed = new boolean[Input.lIlIIllIIlIIlI[3]];
        this.nextRepeat = new long[Input.lIlIIllIIlIIlI[3]];
        this.controls = new boolean[Input.lIlIIllIIlIIlI[1]][Input.lIlIIllIIlIIlI[4]];
        this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
        this.allListeners = new HashSet();
        this.keyListeners = new ArrayList();
        this.keyListenersToAdd = new ArrayList();
        this.mouseListeners = new ArrayList();
        this.mouseListenersToAdd = new ArrayList();
        this.controllerListeners = new ArrayList();
        this.displayActive = (Input.lIlIIllIIlIIlI[0] != 0);
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.xoffset = 0.0f;
        this.yoffset = 0.0f;
        this.doubleClickDelay = Input.lIlIIllIIlIIlI[6];
        this.doubleClickTimeout = 0L;
        this.pressedX = Input.lIlIIllIIlIIlI[7];
        this.pressedY = Input.lIlIIllIIlIIlI[7];
        this.mouseClickTolerance = Input.lIlIIllIIlIIlI[8];
        this.init(lllllllllllllIIIllIlIIIlIlIIIlIl);
    }
    
    public boolean isKeyPressed(final int lllllllllllllIIIllIlIIIIllIIIlIl) {
        if (lllIIllllIIIIII(this.pressed[lllllllllllllIIIllIlIIIIllIIIlIl] ? 1 : 0)) {
            this.pressed[lllllllllllllIIIllIlIIIIllIIIlIl] = (Input.lIlIIllIIlIIlI[5] != 0);
            return Input.lIlIIllIIlIIlI[0] != 0;
        }
        return Input.lIlIIllIIlIIlI[5] != 0;
    }
    
    private static boolean lllIIllllIIIIII(final int lllllllllllllIIIllIIllllIIIlIIlI) {
        return lllllllllllllIIIllIIllllIIIlIIlI != 0;
    }
    
    public void setOffset(final float lllllllllllllIIIllIlIIIlIIlIIllI, final float lllllllllllllIIIllIlIIIlIIlIIlIl) {
        this.xoffset = lllllllllllllIIIllIlIIIlIIlIIllI;
        this.yoffset = lllllllllllllIIIllIlIIIlIIlIIlIl;
    }
    
    public void clearControlPressedRecord() {
        int lllllllllllllIIIllIlIIIIlIlIllIl = Input.lIlIIllIIlIIlI[5];
        while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIlIlIllIl, Input.controllers.size())) {
            Arrays.fill(this.controllerPressed[lllllllllllllIIIllIlIIIIlIlIllIl], (boolean)(Input.lIlIIllIIlIIlI[5] != 0));
            ++lllllllllllllIIIllIlIIIIlIlIllIl;
            "".length();
            if (((0xF2 ^ 0xAE) & ~(0x46 ^ 0x1A)) != ((0x63 ^ 0x48) & ~(0x36 ^ 0x1D))) {
                return;
            }
        }
    }
    
    private boolean anyMouseDown() {
        int lllllllllllllIIIllIlIIIIlIIlIIII = Input.lIlIIllIIlIIlI[5];
        while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIlIIlIIII, Input.lIlIIllIIlIIlI[9])) {
            if (lllIIllllIIIIII(Mouse.isButtonDown(lllllllllllllIIIllIlIIIIlIIlIIII) ? 1 : 0)) {
                return Input.lIlIIllIIlIIlI[0] != 0;
            }
            ++lllllllllllllIIIllIlIIIIlIIlIIII;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0x51 ^ 0x6B ^ (0x92 ^ 0xBA)) & (0xC5 ^ 0x8E ^ (0x74 ^ 0x2D) ^ -" ".length())) != 0x0;
            }
        }
        return Input.lIlIIllIIlIIlI[5] != 0;
    }
    
    public void considerDoubleClick(final int lllllllllllllIIIllIlIIIIIIIlIIll, final int lllllllllllllIIIllIlIIIIIIIlIIlI, final int lllllllllllllIIIllIlIIIIIIIlIlIl) {
        if (lllIIllllIIIIIl(lllIIllllIIlllI(this.doubleClickTimeout, 0L))) {
            this.clickX = lllllllllllllIIIllIlIIIIIIIlIIlI;
            this.clickY = lllllllllllllIIIllIlIIIIIIIlIlIl;
            this.clickButton = lllllllllllllIIIllIlIIIIIIIlIIll;
            this.doubleClickTimeout = System.currentTimeMillis() + this.doubleClickDelay;
            this.fireMouseClicked(lllllllllllllIIIllIlIIIIIIIlIIll, lllllllllllllIIIllIlIIIIIIIlIIlI, lllllllllllllIIIllIlIIIIIIIlIlIl, Input.lIlIIllIIlIIlI[0]);
            "".length();
            if (((0x22 ^ 0x35) & ~(0x93 ^ 0x84)) != 0x0) {
                return;
            }
        }
        else if (lllIIllllIIIlIl(this.clickButton, lllllllllllllIIIllIlIIIIIIIlIIll) && lllIIllllIIIlll(lllIIllllIIlllI(System.currentTimeMillis(), this.doubleClickTimeout))) {
            this.fireMouseClicked(lllllllllllllIIIllIlIIIIIIIlIIll, lllllllllllllIIIllIlIIIIIIIlIIlI, lllllllllllllIIIllIlIIIIIIIlIlIl, Input.lIlIIllIIlIIlI[10]);
            this.doubleClickTimeout = 0L;
        }
    }
    
    private static boolean lllIIllllIIIlll(final int lllllllllllllIIIllIIllllIIIIIlll) {
        return lllllllllllllIIIllIIllllIIIIIlll < 0;
    }
    
    public void initControllers() throws SlickException {
        if (lllIIllllIIIIII(Input.controllersInited ? 1 : 0)) {
            return;
        }
        Input.controllersInited = (Input.lIlIIllIIlIIlI[0] != 0);
        try {
            Controllers.create();
            final int lllllllllllllIIIllIlIIIIIIlIllIl = Controllers.getControllerCount();
            int lllllllllllllIIIllIlIIIIIIlIllll = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIIlIllll, lllllllllllllIIIllIlIIIIIIlIllIl)) {
                final Controller lllllllllllllIIIllIlIIIIIIllIIII = Controllers.getController(lllllllllllllIIIllIlIIIIIIlIllll);
                if (lllIIllllIIIlII(lllllllllllllIIIllIlIIIIIIllIIII.getButtonCount(), Input.lIlIIllIIlIIlI[9]) && lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIIllIIII.getButtonCount(), Input.lIlIIllIIlIIlI[2])) {
                    Input.controllers.add(lllllllllllllIIIllIlIIIIIIllIIII);
                    "".length();
                }
                ++lllllllllllllIIIllIlIIIIIIlIllll;
                "".length();
                if (null != null) {
                    return;
                }
            }
            Log.info(String.valueOf(new StringBuilder().append(Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[0]]).append(Input.controllers.size()).append(Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[10]])));
            int lllllllllllllIIIllIlIIIIIIlIlllI = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIIlIlllI, Input.controllers.size())) {
                Log.info(String.valueOf(new StringBuilder().append(lllllllllllllIIIllIlIIIIIIlIlllI).append(Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[9]]).append(Input.controllers.get(lllllllllllllIIIllIlIIIIIIlIlllI).getName())));
                ++lllllllllllllIIIllIlIIIIIIlIlllI;
                "".length();
                if ((0x77 ^ 0xF ^ (0xD4 ^ 0xA8)) < (33 + 29 + 46 + 38 ^ 22 + 38 - 39 + 129)) {
                    return;
                }
            }
            "".length();
            if (((0x1A ^ 0x17) & ~(0x35 ^ 0x38)) != 0x0) {
                return;
            }
        }
        catch (LWJGLException lllllllllllllIIIllIlIIIIIIlIllII) {
            if (lllIIllllIIIIII((lllllllllllllIIIllIlIIIIIIlIllII.getCause() instanceof ClassNotFoundException) ? 1 : 0)) {
                throw new SlickException(Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[11]]);
            }
            throw new SlickException(Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[8]]);
        }
        catch (NoClassDefFoundError noClassDefFoundError) {}
    }
    
    private void addMouseListenerImpl(final MouseListener lllllllllllllIIIllIlIIIlIIIIIlII) {
        if (lllIIllllIIIIII(this.mouseListeners.contains(lllllllllllllIIIllIlIIIlIIIIIlII) ? 1 : 0)) {
            return;
        }
        this.mouseListeners.add(lllllllllllllIIIllIlIIIlIIIIIlII);
        "".length();
        this.allListeners.add(lllllllllllllIIIllIlIIIlIIIIIlII);
        "".length();
    }
    
    public boolean isControllerRight(final int lllllllllllllIIIllIlIIIIIllIIlIl) {
        if (lllIIllllIIIlII(lllllllllllllIIIllIlIIIIIllIIlIl, this.getControllerCount())) {
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        if (lllIIllllIIIlIl(lllllllllllllIIIllIlIIIIIllIIlIl, Input.lIlIIllIIlIIlI[7])) {
            int lllllllllllllIIIllIlIIIIIllIlIIl = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIllIlIIl, Input.controllers.size())) {
                if (lllIIllllIIIIII(this.isControllerRight(lllllllllllllIIIllIlIIIIIllIlIIl) ? 1 : 0)) {
                    return Input.lIlIIllIIlIIlI[0] != 0;
                }
                ++lllllllllllllIIIllIlIIIIIllIlIIl;
                "".length();
                if (((0xEE ^ 0x81 ^ (0x22 ^ 0xE)) & (122 + 72 - 180 + 116 ^ 167 + 165 - 160 + 21 ^ -" ".length())) != ((0x7C ^ 0x52 ^ (0x29 ^ 0x35)) & (49 + 90 - 42 + 45 ^ 144 + 117 - 101 + 28 ^ -" ".length()))) {
                    return ((0x50 ^ 0x7E ^ (0xD2 ^ 0xBC)) & (201 + 21 - 144 + 128 ^ 105 + 97 - 182 + 122 ^ -" ".length())) != 0x0;
                }
            }
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        int n;
        if (!lllIIllllIIlIIl(lllIIllllIIlIII(Input.controllers.get(lllllllllllllIIIllIlIIIIIllIIlIl).getXAxisValue(), 0.5f)) || lllIIllllIIlIlI(lllIIllllIIlIII(Input.controllers.get(lllllllllllllIIIllIlIIIIIllIIlIl).getPovX(), 0.5f))) {
            n = Input.lIlIIllIIlIIlI[0];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x33 ^ 0x7C) & ~(0x24 ^ 0x6B)) != 0x0;
            }
        }
        else {
            n = Input.lIlIIllIIlIIlI[5];
        }
        return n != 0;
    }
    
    public void resetInputTransform() {
        this.setOffset(0.0f, 0.0f);
        this.setScale(1.0f, 1.0f);
    }
    
    private static String lllIIlllIllIIlI(final String lllllllllllllIIIllIIlllllIIIllll, final String lllllllllllllIIIllIIlllllIIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlllllIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIlllllIIlIIII.getBytes(StandardCharsets.UTF_8)), Input.lIlIIllIIlIIlI[44]), "DES");
            final Cipher lllllllllllllIIIllIIlllllIIlIIll = Cipher.getInstance("DES");
            lllllllllllllIIIllIIlllllIIlIIll.init(Input.lIlIIllIIlIIlI[10], lllllllllllllIIIllIIlllllIIlIlII);
            return new String(lllllllllllllIIIllIIlllllIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIlllllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIlllllIIlIIlI) {
            lllllllllllllIIIllIIlllllIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    public void removeAllListeners() {
        this.removeAllKeyListeners();
        this.removeAllMouseListeners();
        this.removeAllControllerListeners();
    }
    
    public void addMouseListener(final MouseListener lllllllllllllIIIllIlIIIlIIIIlIlI) {
        this.mouseListenersToAdd.add(lllllllllllllIIIllIlIIIlIIIIlIlI);
        "".length();
    }
    
    private static int lllIIllllIIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lllIIllllIIIIlI(final int lllllllllllllIIIllIIllllIIlIIIll, final int lllllllllllllIIIllIIllllIIlIIIIl) {
        return lllllllllllllIIIllIIllllIIlIIIll < lllllllllllllIIIllIIllllIIlIIIIl;
    }
    
    public void addKeyListener(final KeyListener lllllllllllllIIIllIlIIIlIIIllIII) {
        this.keyListenersToAdd.add(lllllllllllllIIIllIlIIIlIIIllIII);
        "".length();
    }
    
    private static String lllIIlllIllIIll(final String lllllllllllllIIIllIIllllIllllllI, final String lllllllllllllIIIllIIllllIlllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIlllllIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIllllIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIlllllIIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIlllllIIIIIII.init(Input.lIlIIllIIlIIlI[10], lllllllllllllIIIllIIlllllIIIIIlI);
            return new String(lllllllllllllIIIllIIlllllIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIllllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIllllIlllllll) {
            lllllllllllllIIIllIIllllIlllllll.printStackTrace();
            return null;
        }
    }
    
    @Deprecated
    public void enableKeyRepeat(final int lllllllllllllIIIllIIllllllIlllll, final int lllllllllllllIIIllIIllllllIllllI) {
        Keyboard.enableRepeatEvents((boolean)(Input.lIlIIllIIlIIlI[0] != 0));
    }
    
    public boolean isMouseButtonDown(final int lllllllllllllIIIllIlIIIIlIIlIIlI) {
        return Mouse.isButtonDown(lllllllllllllIIIllIlIIIIlIIlIIlI);
    }
    
    public void poll(final int lllllllllllllIIIllIIlllllllIlIll, final int lllllllllllllIIIllIIlllllllIlIlI) {
        if (lllIIllllIIIIII(this.paused ? 1 : 0)) {
            this.clearControlPressedRecord();
            this.clearKeyPressedRecord();
            this.clearMousePressedRecord();
            while (lllIIllllIIIIII(Keyboard.next() ? 1 : 0)) {
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            while (lllIIllllIIIIII(Mouse.next() ? 1 : 0)) {
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            return;
        }
        if (lllIIllllIIIIIl(Display.isActive() ? 1 : 0)) {
            this.clearControlPressedRecord();
            this.clearKeyPressedRecord();
            this.clearMousePressedRecord();
        }
        int lllllllllllllIIIllIlIIIIIIIIlIIl = Input.lIlIIllIIlIIlI[5];
        while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIIIIlIIl, this.keyListenersToAdd.size())) {
            this.addKeyListenerImpl(this.keyListenersToAdd.get(lllllllllllllIIIllIlIIIIIIIIlIIl));
            ++lllllllllllllIIIllIlIIIIIIIIlIIl;
            "".length();
            if (null != null) {
                return;
            }
        }
        this.keyListenersToAdd.clear();
        int lllllllllllllIIIllIlIIIIIIIIlIII = Input.lIlIIllIIlIIlI[5];
        while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIIIIlIII, this.mouseListenersToAdd.size())) {
            this.addMouseListenerImpl(this.mouseListenersToAdd.get(lllllllllllllIIIllIlIIIIIIIIlIII));
            ++lllllllllllllIIIllIlIIIIIIIIlIII;
            "".length();
            if (null != null) {
                return;
            }
        }
        this.mouseListenersToAdd.clear();
        if (lllIIllllIIIIII(lllIIllllIIllll(this.doubleClickTimeout, 0L)) && lllIIllllIIlIlI(lllIIllllIIllll(System.currentTimeMillis(), this.doubleClickTimeout))) {
            this.doubleClickTimeout = 0L;
        }
        this.height = lllllllllllllIIIllIIlllllllIlIlI;
        final Iterator lllllllllllllIIIllIIlllllllIlIIl = this.allListeners.iterator();
        while (lllIIllllIIIIII(lllllllllllllIIIllIIlllllllIlIIl.hasNext() ? 1 : 0)) {
            final ControlledInputReciever lllllllllllllIIIllIlIIIIIIIIIlll = lllllllllllllIIIllIIlllllllIlIIl.next();
            lllllllllllllIIIllIlIIIIIIIIIlll.inputStarted();
            "".length();
            if (((160 + 113 - 166 + 68 ^ 22 + 159 - 41 + 26) & (0x37 ^ 0x5A ^ (0x4E ^ 0x2A) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        while (lllIIllllIIIIII(Keyboard.next() ? 1 : 0)) {
            if (lllIIllllIIIIII(Keyboard.getEventKeyState() ? 1 : 0)) {
                final int lllllllllllllIIIllIlIIIIIIIIIlII = this.resolveEventKey(Keyboard.getEventKey(), Keyboard.getEventCharacter());
                this.keys[lllllllllllllIIIllIlIIIIIIIIIlII] = Keyboard.getEventCharacter();
                this.pressed[lllllllllllllIIIllIlIIIIIIIIIlII] = (Input.lIlIIllIIlIIlI[0] != 0);
                this.nextRepeat[lllllllllllllIIIllIlIIIIIIIIIlII] = System.currentTimeMillis() + this.keyRepeatInitial;
                this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
                int lllllllllllllIIIllIlIIIIIIIIIlIl = Input.lIlIIllIIlIIlI[5];
                while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIIIIIlIl, this.keyListeners.size())) {
                    final KeyListener lllllllllllllIIIllIlIIIIIIIIIllI = this.keyListeners.get(lllllllllllllIIIllIlIIIIIIIIIlIl);
                    if (lllIIllllIIIIII(lllllllllllllIIIllIlIIIIIIIIIllI.isAcceptingInput() ? 1 : 0)) {
                        lllllllllllllIIIllIlIIIIIIIIIllI.keyPressed(lllllllllllllIIIllIlIIIIIIIIIlII, Keyboard.getEventCharacter());
                        if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                            "".length();
                            if ((104 + 51 - 65 + 59 ^ 42 + 53 - 69 + 119) < "   ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                    ++lllllllllllllIIIllIlIIIIIIIIIlIl;
                    "".length();
                    if (-(0xD9 ^ 0xBA ^ (0x63 ^ 0x5)) >= 0) {
                        return;
                    }
                }
                "".length();
                if ("  ".length() < "  ".length()) {
                    return;
                }
                continue;
            }
            else {
                final int lllllllllllllIIIllIlIIIIIIIIIIIl = this.resolveEventKey(Keyboard.getEventKey(), Keyboard.getEventCharacter());
                this.nextRepeat[lllllllllllllIIIllIlIIIIIIIIIIIl] = 0L;
                this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
                int lllllllllllllIIIllIlIIIIIIIIIIlI = Input.lIlIIllIIlIIlI[5];
                while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIIIIIIlI, this.keyListeners.size())) {
                    final KeyListener lllllllllllllIIIllIlIIIIIIIIIIll = this.keyListeners.get(lllllllllllllIIIllIlIIIIIIIIIIlI);
                    if (lllIIllllIIIIII(lllllllllllllIIIllIlIIIIIIIIIIll.isAcceptingInput() ? 1 : 0)) {
                        lllllllllllllIIIllIlIIIIIIIIIIll.keyReleased(lllllllllllllIIIllIlIIIIIIIIIIIl, this.keys[lllllllllllllIIIllIlIIIIIIIIIIIl]);
                        if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                    ++lllllllllllllIIIllIlIIIIIIIIIIlI;
                    "".length();
                    if (-" ".length() == (0x5A ^ 0x5E)) {
                        return;
                    }
                }
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return;
                }
                continue;
            }
        }
        while (lllIIllllIIIIII(Mouse.next() ? 1 : 0)) {
            if (lllIIllllIIIllI(Mouse.getEventButton())) {
                if (lllIIllllIIIIII(Mouse.getEventButtonState() ? 1 : 0)) {
                    this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
                    this.mousePressed[Mouse.getEventButton()] = (Input.lIlIIllIIlIIlI[0] != 0);
                    this.pressedX = (int)(this.xoffset + Mouse.getEventX() * this.scaleX);
                    this.pressedY = (int)(this.yoffset + (lllllllllllllIIIllIIlllllllIlIlI - Mouse.getEventY()) * this.scaleY);
                    int lllllllllllllIIIllIIllllllllllll = Input.lIlIIllIIlIIlI[5];
                    while (lllIIllllIIIIlI(lllllllllllllIIIllIIllllllllllll, this.mouseListeners.size())) {
                        final MouseListener lllllllllllllIIIllIlIIIIIIIIIIII = this.mouseListeners.get(lllllllllllllIIIllIIllllllllllll);
                        if (lllIIllllIIIIII(lllllllllllllIIIllIlIIIIIIIIIIII.isAcceptingInput() ? 1 : 0)) {
                            lllllllllllllIIIllIlIIIIIIIIIIII.mousePressed(Mouse.getEventButton(), this.pressedX, this.pressedY);
                            if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                                "".length();
                                if (-" ".length() >= "   ".length()) {
                                    return;
                                }
                                break;
                            }
                        }
                        ++lllllllllllllIIIllIIllllllllllll;
                        "".length();
                        if ((0xDC ^ 0x98 ^ (0x2F ^ 0x6F)) < "  ".length()) {
                            return;
                        }
                    }
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
                else {
                    this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
                    this.mousePressed[Mouse.getEventButton()] = (Input.lIlIIllIIlIIlI[5] != 0);
                    final int lllllllllllllIIIllIIllllllllllII = (int)(this.xoffset + Mouse.getEventX() * this.scaleX);
                    final int lllllllllllllIIIllIIlllllllllIll = (int)(this.yoffset + (lllllllllllllIIIllIIlllllllIlIlI - Mouse.getEventY()) * this.scaleY);
                    if (lllIIllllIIllIl(this.pressedX, Input.lIlIIllIIlIIlI[7]) && lllIIllllIIllIl(this.pressedY, Input.lIlIIllIIlIIlI[7]) && lllIIllllIIIIlI(Math.abs(this.pressedX - lllllllllllllIIIllIIllllllllllII), this.mouseClickTolerance) && lllIIllllIIIIlI(Math.abs(this.pressedY - lllllllllllllIIIllIIlllllllllIll), this.mouseClickTolerance)) {
                        this.considerDoubleClick(Mouse.getEventButton(), lllllllllllllIIIllIIllllllllllII, lllllllllllllIIIllIIlllllllllIll);
                        final int n = Input.lIlIIllIIlIIlI[7];
                        this.pressedY = n;
                        this.pressedX = n;
                    }
                    int lllllllllllllIIIllIIllllllllllIl = Input.lIlIIllIIlIIlI[5];
                    while (lllIIllllIIIIlI(lllllllllllllIIIllIIllllllllllIl, this.mouseListeners.size())) {
                        final MouseListener lllllllllllllIIIllIIlllllllllllI = this.mouseListeners.get(lllllllllllllIIIllIIllllllllllIl);
                        if (lllIIllllIIIIII(lllllllllllllIIIllIIlllllllllllI.isAcceptingInput() ? 1 : 0)) {
                            lllllllllllllIIIllIIlllllllllllI.mouseReleased(Mouse.getEventButton(), lllllllllllllIIIllIIllllllllllII, lllllllllllllIIIllIIlllllllllIll);
                            if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                                "".length();
                                if ("   ".length() != "   ".length()) {
                                    return;
                                }
                                break;
                            }
                        }
                        ++lllllllllllllIIIllIIllllllllllIl;
                        "".length();
                        if (((48 + 114 - 69 + 59 ^ 106 + 125 - 137 + 52) & (62 + 14 - 58 + 113 ^ 109 + 51 - 41 + 18 ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
            }
            else {
                if (lllIIllllIIIIII(Mouse.isGrabbed() ? 1 : 0) && lllIIllllIIIIII(this.displayActive ? 1 : 0) && (!lllIIllllIIIIIl(Mouse.getEventDX()) || lllIIllllIIIIII(Mouse.getEventDY()))) {
                    this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
                    int lllllllllllllIIIllIIlllllllllIIl = Input.lIlIIllIIlIIlI[5];
                    while (lllIIllllIIIIlI(lllllllllllllIIIllIIlllllllllIIl, this.mouseListeners.size())) {
                        final MouseListener lllllllllllllIIIllIIlllllllllIlI = this.mouseListeners.get(lllllllllllllIIIllIIlllllllllIIl);
                        if (lllIIllllIIIIII(lllllllllllllIIIllIIlllllllllIlI.isAcceptingInput() ? 1 : 0)) {
                            if (lllIIllllIIIIII(this.anyMouseDown() ? 1 : 0)) {
                                lllllllllllllIIIllIIlllllllllIlI.mouseDragged(Input.lIlIIllIIlIIlI[5], Input.lIlIIllIIlIIlI[5], Mouse.getEventDX(), -Mouse.getEventDY());
                                "".length();
                                if (" ".length() == (0x7 ^ 0x3)) {
                                    return;
                                }
                            }
                            else {
                                lllllllllllllIIIllIIlllllllllIlI.mouseMoved(Input.lIlIIllIIlIIlI[5], Input.lIlIIllIIlIIlI[5], Mouse.getEventDX(), -Mouse.getEventDY());
                            }
                            if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                                "".length();
                                if (-" ".length() >= "   ".length()) {
                                    return;
                                }
                                break;
                            }
                        }
                        ++lllllllllllllIIIllIIlllllllllIIl;
                        "".length();
                        if (" ".length() <= 0) {
                            return;
                        }
                    }
                }
                final int lllllllllllllIIIllIIllllllllIllI = Mouse.getEventDWheel();
                this.wheel += lllllllllllllIIIllIIllllllllIllI;
                if (lllIIllllIIIIII(lllllllllllllIIIllIIllllllllIllI)) {
                    this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
                    int lllllllllllllIIIllIIllllllllIlll = Input.lIlIIllIIlIIlI[5];
                    while (lllIIllllIIIIlI(lllllllllllllIIIllIIllllllllIlll, this.mouseListeners.size())) {
                        final MouseListener lllllllllllllIIIllIIlllllllllIII = this.mouseListeners.get(lllllllllllllIIIllIIllllllllIlll);
                        if (lllIIllllIIIIII(lllllllllllllIIIllIIlllllllllIII.isAcceptingInput() ? 1 : 0)) {
                            lllllllllllllIIIllIIlllllllllIII.mouseWheelMoved(lllllllllllllIIIllIIllllllllIllI);
                            if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                                "".length();
                                if (null != null) {
                                    return;
                                }
                                break;
                            }
                        }
                        ++lllllllllllllIIIllIIllllllllIlll;
                        "".length();
                        if ("   ".length() > (90 + 31 + 4 + 47 ^ 98 + 7 - 69 + 132)) {
                            return;
                        }
                    }
                }
                "".length();
                if ("  ".length() <= ((0xE3 ^ 0xA7) & ~(0x7 ^ 0x43))) {
                    return;
                }
                continue;
            }
        }
        if (!lllIIllllIIIIII(this.displayActive ? 1 : 0) || lllIIllllIIIIII(Mouse.isGrabbed() ? 1 : 0)) {
            this.lastMouseX = this.getMouseX();
            this.lastMouseY = this.getMouseY();
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (!lllIIllllIIIlIl(this.lastMouseX, this.getMouseX()) || lllIIllllIIllIl(this.lastMouseY, this.getMouseY())) {
            this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
            int lllllllllllllIIIllIIllllllllIlII = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIIllllllllIlII, this.mouseListeners.size())) {
                final MouseListener lllllllllllllIIIllIIllllllllIlIl = this.mouseListeners.get(lllllllllllllIIIllIIllllllllIlII);
                if (lllIIllllIIIIII(lllllllllllllIIIllIIllllllllIlIl.isAcceptingInput() ? 1 : 0)) {
                    if (lllIIllllIIIIII(this.anyMouseDown() ? 1 : 0)) {
                        lllllllllllllIIIllIIllllllllIlIl.mouseDragged(this.lastMouseX, this.lastMouseY, this.getMouseX(), this.getMouseY());
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIIllIIllllllllIlIl.mouseMoved(this.lastMouseX, this.lastMouseY, this.getMouseX(), this.getMouseY());
                    }
                    if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                        break;
                    }
                }
                ++lllllllllllllIIIllIIllllllllIlII;
                "".length();
                if ((0x90 ^ 0x95) == 0x0) {
                    return;
                }
            }
            this.lastMouseX = this.getMouseX();
            this.lastMouseY = this.getMouseY();
        }
        if (lllIIllllIIIIII(Input.controllersInited ? 1 : 0)) {
            int lllllllllllllIIIllIIllllllllIIIl = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIIllllllllIIIl, this.getControllerCount())) {
                int lllllllllllllIIIllIIllllllllIIlI = Input.controllers.get(lllllllllllllIIIllIIllllllllIIIl).getButtonCount() + Input.lIlIIllIIlIIlI[9];
                lllllllllllllIIIllIIllllllllIIlI = Math.min(lllllllllllllIIIllIIllllllllIIlI, Input.lIlIIllIIlIIlI[14]);
                int lllllllllllllIIIllIIllllllllIIll = Input.lIlIIllIIlIIlI[5];
                while (lllIIllllIlIIII(lllllllllllllIIIllIIllllllllIIll, lllllllllllllIIIllIIllllllllIIlI)) {
                    if (lllIIllllIIIIII(this.controls[lllllllllllllIIIllIIllllllllIIIl][lllllllllllllIIIllIIllllllllIIll] ? 1 : 0) && lllIIllllIIIIIl(this.isControlDwn(lllllllllllllIIIllIIllllllllIIll, lllllllllllllIIIllIIllllllllIIIl) ? 1 : 0)) {
                        this.controls[lllllllllllllIIIllIIllllllllIIIl][lllllllllllllIIIllIIllllllllIIll] = (Input.lIlIIllIIlIIlI[5] != 0);
                        this.fireControlRelease(lllllllllllllIIIllIIllllllllIIll, lllllllllllllIIIllIIllllllllIIIl);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else if (lllIIllllIIIIIl(this.controls[lllllllllllllIIIllIIllllllllIIIl][lllllllllllllIIIllIIllllllllIIll] ? 1 : 0) && lllIIllllIIIIII(this.isControlDwn(lllllllllllllIIIllIIllllllllIIll, lllllllllllllIIIllIIllllllllIIIl) ? 1 : 0)) {
                        this.controllerPressed[lllllllllllllIIIllIIllllllllIIIl][lllllllllllllIIIllIIllllllllIIll] = (Input.lIlIIllIIlIIlI[0] != 0);
                        this.controls[lllllllllllllIIIllIIllllllllIIIl][lllllllllllllIIIllIIllllllllIIll] = (Input.lIlIIllIIlIIlI[0] != 0);
                        this.fireControlPress(lllllllllllllIIIllIIllllllllIIll, lllllllllllllIIIllIIllllllllIIIl);
                    }
                    ++lllllllllllllIIIllIIllllllllIIll;
                    "".length();
                    if (((0xF ^ 0x63 ^ (0xB ^ 0x75)) & (0x59 ^ 0x15 ^ (0xF8 ^ 0xA6) ^ -" ".length())) < -" ".length()) {
                        return;
                    }
                }
                ++lllllllllllllIIIllIIllllllllIIIl;
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        if (lllIIllllIIIIII(this.keyRepeat ? 1 : 0)) {
            int lllllllllllllIIIllIIlllllllIlllI = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIIlllllllIlllI, Input.lIlIIllIIlIIlI[3])) {
                if (lllIIllllIIIIII(this.pressed[lllllllllllllIIIllIIlllllllIlllI] ? 1 : 0) && lllIIllllIIIIII(lllIIllllIIllll(this.nextRepeat[lllllllllllllIIIllIIlllllllIlllI], 0L)) && lllIIllllIIlIlI(lllIIllllIIllll(System.currentTimeMillis(), this.nextRepeat[lllllllllllllIIIllIIlllllllIlllI]))) {
                    this.nextRepeat[lllllllllllllIIIllIIlllllllIlllI] = System.currentTimeMillis() + this.keyRepeatInterval;
                    this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
                    int lllllllllllllIIIllIIlllllllIllll = Input.lIlIIllIIlIIlI[5];
                    while (lllIIllllIIIIlI(lllllllllllllIIIllIIlllllllIllll, this.keyListeners.size())) {
                        final KeyListener lllllllllllllIIIllIIllllllllIIII = this.keyListeners.get(lllllllllllllIIIllIIlllllllIllll);
                        if (lllIIllllIIIIII(lllllllllllllIIIllIIllllllllIIII.isAcceptingInput() ? 1 : 0)) {
                            lllllllllllllIIIllIIllllllllIIII.keyPressed(lllllllllllllIIIllIIlllllllIlllI, this.keys[lllllllllllllIIIllIIlllllllIlllI]);
                            if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                                "".length();
                                if (-" ".length() == ("  ".length() & ~"  ".length())) {
                                    return;
                                }
                                break;
                            }
                        }
                        ++lllllllllllllIIIllIIlllllllIllll;
                        "".length();
                        if ("   ".length() <= -" ".length()) {
                            return;
                        }
                    }
                }
                ++lllllllllllllIIIllIIlllllllIlllI;
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        final Iterator lllllllllllllIIIllIIlllllllIlIII = this.allListeners.iterator();
        while (lllIIllllIIIIII(lllllllllllllIIIllIIlllllllIlIII.hasNext() ? 1 : 0)) {
            final ControlledInputReciever lllllllllllllIIIllIIlllllllIllIl = lllllllllllllIIIllIIlllllllIlIII.next();
            lllllllllllllIIIllIIlllllllIllIl.inputEnded();
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        if (lllIIllllIIIIII(Display.isCreated() ? 1 : 0)) {
            this.displayActive = Display.isActive();
        }
    }
    
    public String getAxisName(final int lllllllllllllIIIllIlIIIIIllllIIl, final int lllllllllllllIIIllIlIIIIIlllIllI) {
        return Input.controllers.get(lllllllllllllIIIllIlIIIIIllllIIl).getAxisName(lllllllllllllIIIllIlIIIIIlllIllI);
    }
    
    private int resolveEventKey(final int lllllllllllllIIIllIlIIIIIIIllllI, final char lllllllllllllIIIllIlIIIIIIIlllll) {
        if (!lllIIllllIIllIl(lllllllllllllIIIllIlIIIIIIIlllll, Input.lIlIIllIIlIIlI[12]) || lllIIllllIIIIIl(lllllllllllllIIIllIlIIIIIIIllllI)) {
            return Input.lIlIIllIIlIIlI[13];
        }
        return lllllllllllllIIIllIlIIIIIIIllllI;
    }
    
    private void fireControlRelease(final int lllllllllllllIIIllIIllllllIIIIII, final int lllllllllllllIIIllIIlllllIllllll) {
        this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
        int lllllllllllllIIIllIIllllllIIIlIl = Input.lIlIIllIIlIIlI[5];
        while (lllIIllllIIIIlI(lllllllllllllIIIllIIllllllIIIlIl, this.controllerListeners.size())) {
            final ControllerListener lllllllllllllIIIllIIllllllIIIllI = this.controllerListeners.get(lllllllllllllIIIllIIllllllIIIlIl);
            if (lllIIllllIIIIII(lllllllllllllIIIllIIllllllIIIllI.isAcceptingInput() ? 1 : 0)) {
                switch (lllllllllllllIIIllIIllllllIIIIII) {
                    case 0: {
                        lllllllllllllIIIllIIllllllIIIllI.controllerLeftReleased(lllllllllllllIIIllIIlllllIllllll);
                        "".length();
                        if ("  ".length() > (0x23 ^ 0x66 ^ (0xF7 ^ 0xB6))) {
                            return;
                        }
                        break;
                    }
                    case 1: {
                        lllllllllllllIIIllIIllllllIIIllI.controllerRightReleased(lllllllllllllIIIllIIlllllIllllll);
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        lllllllllllllIIIllIIllllllIIIllI.controllerUpReleased(lllllllllllllIIIllIIlllllIllllll);
                        "".length();
                        if ("   ".length() == -" ".length()) {
                            return;
                        }
                        break;
                    }
                    case 3: {
                        lllllllllllllIIIllIIllllllIIIllI.controllerDownReleased(lllllllllllllIIIllIIlllllIllllll);
                        "".length();
                        if (((0xA1 ^ 0x97) & ~(0x46 ^ 0x70)) < 0) {
                            return;
                        }
                        break;
                    }
                    default: {
                        lllllllllllllIIIllIIllllllIIIllI.controllerButtonReleased(lllllllllllllIIIllIIlllllIllllll, lllllllllllllIIIllIIllllllIIIIII - Input.lIlIIllIIlIIlI[11] + Input.lIlIIllIIlIIlI[0]);
                        break;
                    }
                }
                if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return;
                    }
                    break;
                }
            }
            ++lllllllllllllIIIllIIllllllIIIlIl;
            "".length();
            if ((0x6D ^ 0x69) <= ((0xEA ^ 0xAC) & ~(0x24 ^ 0x62))) {
                return;
            }
        }
    }
    
    public boolean isButton2Pressed(final int lllllllllllllIIIllIlIIIIIIlllIlI) {
        return this.isButtonPressed(Input.lIlIIllIIlIIlI[0], lllllllllllllIIIllIlIIIIIIlllIlI);
    }
    
    public void addPrimaryListener(final InputListener lllllllllllllIIIllIlIIIIlllIlllI) {
        this.removeListener(lllllllllllllIIIllIlIIIIlllIlllI);
        this.keyListeners.add(Input.lIlIIllIIlIIlI[5], lllllllllllllIIIllIlIIIIlllIlllI);
        this.mouseListeners.add(Input.lIlIIllIIlIIlI[5], lllllllllllllIIIllIlIIIIlllIlllI);
        this.controllerListeners.add(Input.lIlIIllIIlIIlI[5], lllllllllllllIIIllIlIIIIlllIlllI);
        this.allListeners.add(lllllllllllllIIIllIlIIIIlllIlllI);
        "".length();
    }
    
    public boolean isControllerDown(final int lllllllllllllIIIllIlIIIIIlIlIIll) {
        if (lllIIllllIIIlII(lllllllllllllIIIllIlIIIIIlIlIIll, this.getControllerCount())) {
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        if (lllIIllllIIIlIl(lllllllllllllIIIllIlIIIIIlIlIIll, Input.lIlIIllIIlIIlI[7])) {
            int lllllllllllllIIIllIlIIIIIlIlIlll = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIlIlIlll, Input.controllers.size())) {
                if (lllIIllllIIIIII(this.isControllerDown(lllllllllllllIIIllIlIIIIIlIlIlll) ? 1 : 0)) {
                    return Input.lIlIIllIIlIIlI[0] != 0;
                }
                ++lllllllllllllIIIllIlIIIIIlIlIlll;
                "".length();
                if ("  ".length() > (0x76 ^ 0x72)) {
                    return ((0x7C ^ 0x28) & ~(0x3C ^ 0x68)) != 0x0;
                }
            }
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        int n;
        if (!lllIIllllIIlIIl(lllIIllllIIllII(Input.controllers.get(lllllllllllllIIIllIlIIIIIlIlIIll).getYAxisValue(), 0.5f)) || lllIIllllIIlIlI(lllIIllllIIllII(Input.controllers.get(lllllllllllllIIIllIlIIIIIlIlIIll).getPovY(), 0.5f))) {
            n = Input.lIlIIllIIlIIlI[0];
            "".length();
            if (((0x8B ^ 0xA9) & ~(0x43 ^ 0x61)) != 0x0) {
                return ((0x15 ^ 0x42) & ~(0xF8 ^ 0xAF)) != 0x0;
            }
        }
        else {
            n = Input.lIlIIllIIlIIlI[5];
        }
        return n != 0;
    }
    
    public int getMouseX() {
        return (int)(Mouse.getX() * this.scaleX + this.xoffset);
    }
    
    public void setScale(final float lllllllllllllIIIllIlIIIlIIllIIlI, final float lllllllllllllIIIllIlIIIlIIlIlllI) {
        this.scaleX = lllllllllllllIIIllIlIIIlIIllIIlI;
        this.scaleY = lllllllllllllIIIllIlIIIlIIlIlllI;
    }
    
    private boolean isControlDwn(final int lllllllllllllIIIllIIlllllIlllIII, final int lllllllllllllIIIllIIlllllIllIlll) {
        switch (lllllllllllllIIIllIIlllllIlllIII) {
            case 0: {
                return this.isControllerLeft(lllllllllllllIIIllIIlllllIllIlll);
            }
            case 1: {
                return this.isControllerRight(lllllllllllllIIIllIIlllllIllIlll);
            }
            case 2: {
                return this.isControllerUp(lllllllllllllIIIllIIlllllIllIlll);
            }
            case 3: {
                return this.isControllerDown(lllllllllllllIIIllIIlllllIllIlll);
            }
            default: {
                if (lllIIllllIIIlII(lllllllllllllIIIllIIlllllIlllIII, Input.lIlIIllIIlIIlI[11])) {
                    return this.isButtonPressed(lllllllllllllIIIllIIlllllIlllIII - Input.lIlIIllIIlIIlI[11], lllllllllllllIIIllIIlllllIllIlll);
                }
                throw new RuntimeException(Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[15]]);
            }
        }
    }
    
    private static boolean lllIIllllIIIllI(final int lllllllllllllIIIllIIllllIIIIlIIl) {
        return lllllllllllllIIIllIIllllIIIIlIIl >= 0;
    }
    
    public int getMouseY() {
        return (int)((this.height - Mouse.getY()) * this.scaleY + this.yoffset);
    }
    
    public int getAxisCount(final int lllllllllllllIIIllIlIIIIlIIIIlIl) {
        return Input.controllers.get(lllllllllllllIIIllIlIIIIlIIIIlIl).getAxisCount();
    }
    
    void init(final int lllllllllllllIIIllIlIIIIllIlIIII) {
        this.height = lllllllllllllIIIllIlIIIIllIlIIII;
        this.lastMouseX = this.getMouseX();
        this.lastMouseY = this.getMouseY();
    }
    
    private static int lllIIllllIIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllIIllllIIllIl(final int lllllllllllllIIIllIIlllIlllllIII, final int lllllllllllllIIIllIIlllIllllIllI) {
        return lllllllllllllIIIllIIlllIlllllIII != lllllllllllllIIIllIIlllIllllIllI;
    }
    
    private void fireControlPress(final int lllllllllllllIIIllIIllllllIIllll, final int lllllllllllllIIIllIIllllllIlIIIl) {
        this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
        int lllllllllllllIIIllIIllllllIlIlII = Input.lIlIIllIIlIIlI[5];
        while (lllIIllllIIIIlI(lllllllllllllIIIllIIllllllIlIlII, this.controllerListeners.size())) {
            final ControllerListener lllllllllllllIIIllIIllllllIlIlIl = this.controllerListeners.get(lllllllllllllIIIllIIllllllIlIlII);
            if (lllIIllllIIIIII(lllllllllllllIIIllIIllllllIlIlIl.isAcceptingInput() ? 1 : 0)) {
                switch (lllllllllllllIIIllIIllllllIIllll) {
                    case 0: {
                        lllllllllllllIIIllIIllllllIlIlIl.controllerLeftPressed(lllllllllllllIIIllIIllllllIlIIIl);
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    case 1: {
                        lllllllllllllIIIllIIllllllIlIlIl.controllerRightPressed(lllllllllllllIIIllIIllllllIlIIIl);
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        lllllllllllllIIIllIIllllllIlIlIl.controllerUpPressed(lllllllllllllIIIllIIllllllIlIIIl);
                        "".length();
                        if (((123 + 45 - 129 + 116 ^ 55 + 71 - 83 + 130) & (0x34 ^ 0x63 ^ (0xA5 ^ 0xC4) ^ -" ".length())) == " ".length()) {
                            return;
                        }
                        break;
                    }
                    case 3: {
                        lllllllllllllIIIllIIllllllIlIlIl.controllerDownPressed(lllllllllllllIIIllIIllllllIlIIIl);
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    default: {
                        lllllllllllllIIIllIIllllllIlIlIl.controllerButtonPressed(lllllllllllllIIIllIIllllllIlIIIl, lllllllllllllIIIllIIllllllIIllll - Input.lIlIIllIIlIIlI[11] + Input.lIlIIllIIlIIlI[0]);
                        break;
                    }
                }
                if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                    break;
                }
            }
            ++lllllllllllllIIIllIIllllllIlIlII;
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
    }
    
    private static boolean lllIIllllIIlIlI(final int lllllllllllllIIIllIIlllIllllllll) {
        return lllllllllllllIIIllIIlllIllllllll > 0;
    }
    
    private static void lllIIlllIllIlll() {
        (lIlIIllIIIlllI = new String[Input.lIlIIllIIlIIlI[104]])[Input.lIlIIllIIlIIlI[5]] = lllIIlllIllIIlI("Pcl19oqDrAN0uiWWpOTbxfESB22WPVqEAnz1A4JKBU9+5Fzoh62mIQ==", "YoRYK");
        Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[0]] = lllIIlllIllIIll("KWwMQ08pf4Q=", "AWgIf");
        Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[10]] = lllIIlllIllIIll("XqZzJO1M/IhiZMifTTjnuw==", "KmgiF");
        Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[9]] = lllIIlllIllIIll("HtT9Mtb8Zgc=", "mgWhe");
        Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[11]] = lllIIlllIllIIll("Sgq/Kv5rUU14nf/sxTmqQjm02V3UUSqyJzs5HassSpXkh1iuuX5oWhCjwlZKevSDA0rzR8DGt9PWf53x3UWJLlczk1QOG2RJrcEn1wrhC/oNzS0jNmUiTw==", "qGPuP");
        Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[8]] = lllIIlllIllIIlI("PN4NuetJ5eVALQ2rzhaDvdoRtyDIdyPrTihlfqpl72w=", "bntZZ");
        Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[15]] = lllIIlllIllIllI("FiouPBw0KmUxHC0wNz0fYy0rNhY7", "CDERs");
    }
    
    public void enableKeyRepeat() {
        Keyboard.enableRepeatEvents((boolean)(Input.lIlIIllIIlIIlI[0] != 0));
    }
    
    public void disableKeyRepeat() {
        Keyboard.enableRepeatEvents((boolean)(Input.lIlIIllIIlIIlI[5] != 0));
    }
    
    public void consumeEvent() {
        this.consumed = (Input.lIlIIllIIlIIlI[0] != 0);
    }
    
    public void removeAllKeyListeners() {
        this.allListeners.removeAll(this.keyListeners);
        "".length();
        this.keyListeners.clear();
    }
    
    public boolean isButton3Pressed(final int lllllllllllllIIIllIlIIIIIIllIlII) {
        return this.isButtonPressed(Input.lIlIIllIIlIIlI[10], lllllllllllllIIIllIlIIIIIIllIlII);
    }
    
    public static void disableControllers() {
        Input.controllersInited = (Input.lIlIIllIIlIIlI[0] != 0);
    }
    
    private static int lllIIllllIIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public int getAbsoluteMouseY() {
        return this.height - Mouse.getY();
    }
    
    public void pause() {
        this.paused = (Input.lIlIIllIIlIIlI[0] != 0);
        this.clearKeyPressedRecord();
        this.clearMousePressedRecord();
        this.clearControlPressedRecord();
    }
    
    public boolean isControllerLeft(final int lllllllllllllIIIllIlIIIIIllIlllI) {
        if (lllIIllllIIIlII(lllllllllllllIIIllIlIIIIIllIlllI, this.getControllerCount())) {
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        if (lllIIllllIIIlIl(lllllllllllllIIIllIlIIIIIllIlllI, Input.lIlIIllIIlIIlI[7])) {
            int lllllllllllllIIIllIlIIIIIlllIIlI = Input.lIlIIllIIlIIlI[5];
            while (lllIIllllIIIIlI(lllllllllllllIIIllIlIIIIIlllIIlI, Input.controllers.size())) {
                if (lllIIllllIIIIII(this.isControllerLeft(lllllllllllllIIIllIlIIIIIlllIIlI) ? 1 : 0)) {
                    return Input.lIlIIllIIlIIlI[0] != 0;
                }
                ++lllllllllllllIIIllIlIIIIIlllIIlI;
                "".length();
                if (((0x1E ^ 0x3A ^ (0x40 ^ 0x58)) & (49 + 83 - 41 + 46 ^ 156 + 29 - 123 + 119 ^ -" ".length())) == (0x6F ^ 0x3C ^ (0x27 ^ 0x70))) {
                    return ((0xC8 ^ 0xAC ^ (0x79 ^ 0x25)) & (28 + 25 - 14 + 143 ^ 135 + 17 - 110 + 100 ^ -" ".length())) != 0x0;
                }
            }
            return Input.lIlIIllIIlIIlI[5] != 0;
        }
        int n;
        if (!lllIIllllIIIllI(lllIIllllIIIIll(Input.controllers.get(lllllllllllllIIIllIlIIIIIllIlllI).getXAxisValue(), -0.5f)) || lllIIllllIIIlll(lllIIllllIIIIll(Input.controllers.get(lllllllllllllIIIllIlIIIIIllIlllI).getPovX(), -0.5f))) {
            n = Input.lIlIIllIIlIIlI[0];
            "".length();
            if (-(0x13 ^ 0x52 ^ (0xC5 ^ 0x80)) > 0) {
                return ((0x8 ^ 0x59 ^ (0x48 ^ 0x3)) & (0x45 ^ 0x36 ^ (0x2A ^ 0x43) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Input.lIlIIllIIlIIlI[5];
        }
        return n != 0;
    }
    
    public float getAxisValue(final int lllllllllllllIIIllIlIIIIIllllllI, final int lllllllllllllIIIllIlIIIIIlllllIl) {
        return Input.controllers.get(lllllllllllllIIIllIlIIIIIllllllI).getAxisValue(lllllllllllllIIIllIlIIIIIlllllIl);
    }
    
    public int getControllerCount() {
        try {
            this.initControllers();
            "".length();
            if (-"  ".length() >= 0) {
                return (0x21 ^ 0xC) & ~(0xEA ^ 0xC7);
            }
        }
        catch (SlickException lllllllllllllIIIllIlIIIIlIIIlIll) {
            throw new RuntimeException(Input.lIlIIllIIIlllI[Input.lIlIIllIIlIIlI[5]]);
        }
        return Input.controllers.size();
    }
    
    private static boolean lllIIllllIlIIII(final int lllllllllllllIIIllIIllllIIIllIlI, final int lllllllllllllIIIllIIllllIIIlIlll) {
        return lllllllllllllIIIllIIllllIIIllIlI <= lllllllllllllIIIllIIllllIIIlIlll;
    }
    
    public void removeListener(final InputListener lllllllllllllIIIllIlIIIIlllIlIII) {
        this.removeKeyListener(lllllllllllllIIIllIlIIIIlllIlIII);
        this.removeMouseListener(lllllllllllllIIIllIlIIIIlllIlIII);
        this.removeControllerListener(lllllllllllllIIIllIlIIIIlllIlIII);
    }
    
    public boolean isControlPressed(final int lllllllllllllIIIllIlIIIIlIllIlII, final int lllllllllllllIIIllIlIIIIlIllIIII) {
        if (lllIIllllIIIIII(this.controllerPressed[lllllllllllllIIIllIlIIIIlIllIIII][lllllllllllllIIIllIlIIIIlIllIlII] ? 1 : 0)) {
            this.controllerPressed[lllllllllllllIIIllIlIIIIlIllIIII][lllllllllllllIIIllIlIIIIlIllIlII] = (Input.lIlIIllIIlIIlI[5] != 0);
            return Input.lIlIIllIIlIIlI[0] != 0;
        }
        return Input.lIlIIllIIlIIlI[5] != 0;
    }
    
    private static int lllIIllllIIlIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lllIIllllIIIIIl(final int lllllllllllllIIIllIIllllIIIIllIl) {
        return lllllllllllllIIIllIIllllIIIIllIl == 0;
    }
    
    public void removeControllerListener(final ControllerListener lllllllllllllIIIllIlIIIIllIlllII) {
        this.controllerListeners.remove(lllllllllllllIIIllIlIIIIllIlllII);
        "".length();
        if (lllIIllllIIIIIl(this.mouseListeners.contains(lllllllllllllIIIllIlIIIIllIlllII) ? 1 : 0) && lllIIllllIIIIIl(this.keyListeners.contains(lllllllllllllIIIllIlIIIIllIlllII) ? 1 : 0)) {
            this.allListeners.remove(lllllllllllllIIIllIlIIIIllIlllII);
            "".length();
        }
    }
    
    private static int lllIIllllIIlllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lllIIllllIIIlII(final int lllllllllllllIIIllIIllllIIlIllII, final int lllllllllllllIIIllIIllllIIlIlIlI) {
        return lllllllllllllIIIllIIllllIIlIllII >= lllllllllllllIIIllIIllllIIlIlIlI;
    }
    
    public boolean isKeyDown(final int lllllllllllllIIIllIlIIIIlIlIIIIl) {
        return Keyboard.isKeyDown(lllllllllllllIIIllIlIIIIlIlIIIIl);
    }
    
    public void addControllerListener(final ControllerListener lllllllllllllIIIllIlIIIlIIIIIIII) {
        if (lllIIllllIIIIII(this.controllerListeners.contains(lllllllllllllIIIllIlIIIlIIIIIIII) ? 1 : 0)) {
            return;
        }
        this.controllerListeners.add(lllllllllllllIIIllIlIIIlIIIIIIII);
        "".length();
        this.allListeners.add(lllllllllllllIIIllIlIIIlIIIIIIII);
        "".length();
    }
    
    public void clearMousePressedRecord() {
        Arrays.fill(this.mousePressed, (boolean)(Input.lIlIIllIIlIIlI[5] != 0));
    }
    
    public void removeKeyListener(final KeyListener lllllllllllllIIIllIlIIIIlllIIIII) {
        this.keyListeners.remove(lllllllllllllIIIllIlIIIIlllIIIII);
        "".length();
        if (lllIIllllIIIIIl(this.mouseListeners.contains(lllllllllllllIIIllIlIIIIlllIIIII) ? 1 : 0) && lllIIllllIIIIIl(this.controllerListeners.contains(lllllllllllllIIIllIlIIIIlllIIIII) ? 1 : 0)) {
            this.allListeners.remove(lllllllllllllIIIllIlIIIIlllIIIII);
            "".length();
        }
    }
    
    private static boolean lllIIllllIIlIIl(final int lllllllllllllIIIllIIllllIIIIIIll) {
        return lllllllllllllIIIllIIllllIIIIIIll <= 0;
    }
    
    public void removeMouseListener(final MouseListener lllllllllllllIIIllIlIIIIllIlIlII) {
        this.mouseListeners.remove(lllllllllllllIIIllIlIIIIllIlIlII);
        "".length();
        if (lllIIllllIIIIIl(this.controllerListeners.contains(lllllllllllllIIIllIlIIIIllIlIlII) ? 1 : 0) && lllIIllllIIIIIl(this.keyListeners.contains(lllllllllllllIIIllIlIIIIllIlIlII) ? 1 : 0)) {
            this.allListeners.remove(lllllllllllllIIIllIlIIIIllIlIlII);
            "".length();
        }
    }
    
    public boolean isControlPressed(final int lllllllllllllIIIllIlIIIIlIlllIll) {
        return this.isControlPressed(lllllllllllllIIIllIlIIIIlIlllIll, Input.lIlIIllIIlIIlI[5]);
    }
    
    public void clearKeyPressedRecord() {
        Arrays.fill(this.pressed, (boolean)(Input.lIlIIllIIlIIlI[5] != 0));
    }
    
    public boolean isButton1Pressed(final int lllllllllllllIIIllIlIIIIIlIIIIII) {
        return this.isButtonPressed(Input.lIlIIllIIlIIlI[5], lllllllllllllIIIllIlIIIIIlIIIIII);
    }
    
    public void addListener(final InputListener lllllllllllllIIIllIlIIIlIIIllllI) {
        this.addKeyListener(lllllllllllllIIIllIlIIIlIIIllllI);
        this.addMouseListener(lllllllllllllIIIllIlIIIlIIIllllI);
        this.addControllerListener(lllllllllllllIIIllIlIIIlIIIllllI);
    }
    
    private static int lllIIllllIIIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void removeAllControllerListeners() {
        this.allListeners.removeAll(this.controllerListeners);
        "".length();
        this.controllerListeners.clear();
    }
    
    public void setMouseClickTolerance(final int lllllllllllllIIIllIlIIIlIIlllIIl) {
        this.mouseClickTolerance = lllllllllllllIIIllIlIIIlIIlllIIl;
    }
    
    public void setDoubleClickInterval(final int lllllllllllllIIIllIlIIIlIIllllll) {
        this.doubleClickDelay = lllllllllllllIIIllIlIIIlIIllllll;
    }
    
    public void resume() {
        this.paused = (Input.lIlIIllIIlIIlI[5] != 0);
    }
    
    private void fireMouseClicked(final int lllllllllllllIIIllIIlllllIIllllI, final int lllllllllllllIIIllIIlllllIIlllIl, final int lllllllllllllIIIllIIlllllIlIIIIl, final int lllllllllllllIIIllIIlllllIIllIll) {
        this.consumed = (Input.lIlIIllIIlIIlI[5] != 0);
        int lllllllllllllIIIllIIlllllIlIIlIl = Input.lIlIIllIIlIIlI[5];
        while (lllIIllllIIIIlI(lllllllllllllIIIllIIlllllIlIIlIl, this.mouseListeners.size())) {
            final MouseListener lllllllllllllIIIllIIlllllIlIIllI = this.mouseListeners.get(lllllllllllllIIIllIIlllllIlIIlIl);
            if (lllIIllllIIIIII(lllllllllllllIIIllIIlllllIlIIllI.isAcceptingInput() ? 1 : 0)) {
                lllllllllllllIIIllIIlllllIlIIllI.mouseClicked(lllllllllllllIIIllIIlllllIIllllI, lllllllllllllIIIllIIlllllIIlllIl, lllllllllllllIIIllIIlllllIlIIIIl, lllllllllllllIIIllIIlllllIIllIll);
                if (lllIIllllIIIIII(this.consumed ? 1 : 0)) {
                    "".length();
                    if (((0x1D ^ 0x4 ^ (0x64 ^ 0x1D)) & (143 + 125 - 66 + 28 ^ 77 + 54 - 108 + 111 ^ -" ".length())) != 0x0) {
                        return;
                    }
                    break;
                }
            }
            ++lllllllllllllIIIllIIlllllIlIIlIl;
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
    }
    
    private static boolean lllIIllllIIIlIl(final int lllllllllllllIIIllIIllllIIllIIlI, final int lllllllllllllIIIllIIllllIIllIIIl) {
        return lllllllllllllIIIllIIllllIIllIIlI == lllllllllllllIIIllIIllllIIllIIIl;
    }
    
    private class NullOutputStream extends OutputStream
    {
        @Override
        public void write(final int llllllllllllIlIlllIllIlIIllIlIlI) throws IOException {
        }
    }
}
