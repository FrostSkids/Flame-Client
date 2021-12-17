// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.util.CharsetUtil;
import java.util.Arrays;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class HttpResponseStatus implements Comparable<HttpResponseStatus>
{
    public static final /* synthetic */ HttpResponseStatus GONE;
    public static final /* synthetic */ HttpResponseStatus REQUEST_URI_TOO_LONG;
    public static final /* synthetic */ HttpResponseStatus CONFLICT;
    public static final /* synthetic */ HttpResponseStatus FORBIDDEN;
    public static final /* synthetic */ HttpResponseStatus BAD_GATEWAY;
    public static final /* synthetic */ HttpResponseStatus MULTIPLE_CHOICES;
    public static final /* synthetic */ HttpResponseStatus MULTI_STATUS;
    public static final /* synthetic */ HttpResponseStatus NOT_IMPLEMENTED;
    public static final /* synthetic */ HttpResponseStatus INSUFFICIENT_STORAGE;
    public static final /* synthetic */ HttpResponseStatus SERVICE_UNAVAILABLE;
    public static final /* synthetic */ HttpResponseStatus NON_AUTHORITATIVE_INFORMATION;
    public static final /* synthetic */ HttpResponseStatus UNAUTHORIZED;
    public static final /* synthetic */ HttpResponseStatus CONTINUE;
    public static final /* synthetic */ HttpResponseStatus NOT_ACCEPTABLE;
    public static final /* synthetic */ HttpResponseStatus UPGRADE_REQUIRED;
    public static final /* synthetic */ HttpResponseStatus PROXY_AUTHENTICATION_REQUIRED;
    public static final /* synthetic */ HttpResponseStatus BAD_REQUEST;
    public static final /* synthetic */ HttpResponseStatus VARIANT_ALSO_NEGOTIATES;
    public static final /* synthetic */ HttpResponseStatus REQUEST_ENTITY_TOO_LARGE;
    public static final /* synthetic */ HttpResponseStatus PRECONDITION_REQUIRED;
    public static final /* synthetic */ HttpResponseStatus CREATED;
    public static final /* synthetic */ HttpResponseStatus NETWORK_AUTHENTICATION_REQUIRED;
    public static final /* synthetic */ HttpResponseStatus LENGTH_REQUIRED;
    private static final /* synthetic */ int[] lIllIllIIllllI;
    public static final /* synthetic */ HttpResponseStatus UNORDERED_COLLECTION;
    public static final /* synthetic */ HttpResponseStatus HTTP_VERSION_NOT_SUPPORTED;
    public static final /* synthetic */ HttpResponseStatus MOVED_PERMANENTLY;
    public static final /* synthetic */ HttpResponseStatus USE_PROXY;
    public static final /* synthetic */ HttpResponseStatus SEE_OTHER;
    private static final /* synthetic */ String[] lIllIllIIlllII;
    public static final /* synthetic */ HttpResponseStatus METHOD_NOT_ALLOWED;
    public static final /* synthetic */ HttpResponseStatus GATEWAY_TIMEOUT;
    public static final /* synthetic */ HttpResponseStatus FAILED_DEPENDENCY;
    private final /* synthetic */ String reasonPhrase;
    public static final /* synthetic */ HttpResponseStatus SWITCHING_PROTOCOLS;
    public static final /* synthetic */ HttpResponseStatus NOT_FOUND;
    public static final /* synthetic */ HttpResponseStatus ACCEPTED;
    public static final /* synthetic */ HttpResponseStatus NOT_EXTENDED;
    public static final /* synthetic */ HttpResponseStatus PRECONDITION_FAILED;
    public static final /* synthetic */ HttpResponseStatus UNSUPPORTED_MEDIA_TYPE;
    public static final /* synthetic */ HttpResponseStatus FOUND;
    public static final /* synthetic */ HttpResponseStatus NO_CONTENT;
    public static final /* synthetic */ HttpResponseStatus REQUEST_HEADER_FIELDS_TOO_LARGE;
    public static final /* synthetic */ HttpResponseStatus REQUEST_TIMEOUT;
    public static final /* synthetic */ HttpResponseStatus REQUESTED_RANGE_NOT_SATISFIABLE;
    public static final /* synthetic */ HttpResponseStatus PARTIAL_CONTENT;
    public static final /* synthetic */ HttpResponseStatus UNPROCESSABLE_ENTITY;
    public static final /* synthetic */ HttpResponseStatus TEMPORARY_REDIRECT;
    private final /* synthetic */ int code;
    private final /* synthetic */ byte[] bytes;
    public static final /* synthetic */ HttpResponseStatus LOCKED;
    public static final /* synthetic */ HttpResponseStatus OK;
    public static final /* synthetic */ HttpResponseStatus INTERNAL_SERVER_ERROR;
    public static final /* synthetic */ HttpResponseStatus EXPECTATION_FAILED;
    public static final /* synthetic */ HttpResponseStatus PAYMENT_REQUIRED;
    public static final /* synthetic */ HttpResponseStatus PROCESSING;
    public static final /* synthetic */ HttpResponseStatus TOO_MANY_REQUESTS;
    public static final /* synthetic */ HttpResponseStatus NOT_MODIFIED;
    public static final /* synthetic */ HttpResponseStatus RESET_CONTENT;
    
    static {
        llllllllIIIlllI();
        llllllllIIIlIlI();
        CONTINUE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[0], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[21]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        SWITCHING_PROTOCOLS = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[22], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[23]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        PROCESSING = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[24], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[25]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        OK = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[2], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[26]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        CREATED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[27], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[28]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        ACCEPTED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[29], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[30]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        NON_AUTHORITATIVE_INFORMATION = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[31], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[32]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        NO_CONTENT = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[33], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[34]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        RESET_CONTENT = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[35], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[36]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        PARTIAL_CONTENT = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[37], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[38]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        MULTI_STATUS = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[39], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[40]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        MULTIPLE_CHOICES = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[4], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[41]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        MOVED_PERMANENTLY = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[42], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[43]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        FOUND = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[44], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[45]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        SEE_OTHER = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[46], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[47]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        NOT_MODIFIED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[48], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[49]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        USE_PROXY = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[50], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[51]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        TEMPORARY_REDIRECT = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[52], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[53]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        BAD_REQUEST = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[6], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[54]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        UNAUTHORIZED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[55], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[20]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        PAYMENT_REQUIRED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[56], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[57]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        FORBIDDEN = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[58], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[59]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        NOT_FOUND = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[60], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[61]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        METHOD_NOT_ALLOWED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[62], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[63]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        NOT_ACCEPTABLE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[64], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[65]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        PROXY_AUTHENTICATION_REQUIRED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[66], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[67]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        REQUEST_TIMEOUT = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[68], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[69]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        CONFLICT = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[70], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[71]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        GONE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[72], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[14]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        LENGTH_REQUIRED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[73], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[74]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        PRECONDITION_FAILED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[75], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[76]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        REQUEST_ENTITY_TOO_LARGE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[77], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[78]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        REQUEST_URI_TOO_LONG = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[79], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[80]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        UNSUPPORTED_MEDIA_TYPE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[81], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[82]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        REQUESTED_RANGE_NOT_SATISFIABLE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[83], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[84]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        EXPECTATION_FAILED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[85], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[86]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        UNPROCESSABLE_ENTITY = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[87], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[88]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        LOCKED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[89], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[90]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        FAILED_DEPENDENCY = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[91], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[92]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        UNORDERED_COLLECTION = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[93], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[94]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        UPGRADE_REQUIRED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[95], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[96]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        PRECONDITION_REQUIRED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[97], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[98]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        TOO_MANY_REQUESTS = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[99], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[100]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        REQUEST_HEADER_FIELDS_TOO_LARGE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[101], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[102]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        INTERNAL_SERVER_ERROR = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[8], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[103]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        NOT_IMPLEMENTED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[104], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[105]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        BAD_GATEWAY = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[106], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[107]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        SERVICE_UNAVAILABLE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[108], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[109]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        GATEWAY_TIMEOUT = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[110], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[111]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        HTTP_VERSION_NOT_SUPPORTED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[112], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[113]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        VARIANT_ALSO_NEGOTIATES = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[114], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[115]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        INSUFFICIENT_STORAGE = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[116], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[117]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        NOT_EXTENDED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[118], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[119]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
        NETWORK_AUTHENTICATION_REQUIRED = new HttpResponseStatus(HttpResponseStatus.lIllIllIIllllI[120], HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[121]], (boolean)(HttpResponseStatus.lIllIllIIllllI[3] != 0));
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlllllllIIIlIlllIlIl) {
        if (llllllllIIlIIll((llllllllllllIlllllllIIIlIlllIlIl instanceof HttpResponseStatus) ? 1 : 0)) {
            return HttpResponseStatus.lIllIllIIllllI[1] != 0;
        }
        int n;
        if (llllllllIIlIlII(this.code(), ((HttpResponseStatus)llllllllllllIlllllllIIIlIlllIlIl).code())) {
            n = HttpResponseStatus.lIllIllIIllllI[3];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x9D ^ 0x99) & ~(0x8B ^ 0x8F)) != 0x0;
            }
        }
        else {
            n = HttpResponseStatus.lIllIllIIllllI[1];
        }
        return n != 0;
    }
    
    private static String llllllllIIIlIII(final String llllllllllllIlllllllIIIlIIlllIIl, final String llllllllllllIlllllllIIIlIIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIlllllllIIIlIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIIlIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllllIIIlIIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllllIIIlIIllllIl.init(HttpResponseStatus.lIllIllIIllllI[5], llllllllllllIlllllllIIIlIIlllllI);
            return new String(llllllllllllIlllllllIIIlIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIIIlIIllllII) {
            llllllllllllIlllllllIIIlIIllllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllllllIIlIIll(final int llllllllllllIlllllllIIIlIIIllIll) {
        return llllllllllllIlllllllIIIlIIIllIll == 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlllllllIIIlIllIlIIl = new StringBuilder(this.reasonPhrase.length() + HttpResponseStatus.lIllIllIIllllI[11]);
        llllllllllllIlllllllIIIlIllIlIIl.append(this.code);
        "".length();
        llllllllllllIlllllllIIIlIllIlIIl.append((char)HttpResponseStatus.lIllIllIIllllI[20]);
        "".length();
        llllllllllllIlllllllIIIlIllIlIIl.append(this.reasonPhrase);
        "".length();
        return String.valueOf(llllllllllllIlllllllIIIlIllIlIIl);
    }
    
    private static void llllllllIIIlllI() {
        (lIllIllIIllllI = new int[123])[0] = (0xC3 ^ 0xA7);
        HttpResponseStatus.lIllIllIIllllI[1] = ((0x17 ^ 0x2B) & ~(0x80 ^ 0xBC));
        HttpResponseStatus.lIllIllIIllllI[2] = (0x4A ^ 0x19) + (0x0 ^ 0x1E) - (0x40 ^ 0x58) + (0x7 ^ 0x68);
        HttpResponseStatus.lIllIllIIllllI[3] = " ".length();
        HttpResponseStatus.lIllIllIIllllI[4] = (0xFFFF9B6E & 0x65BD);
        HttpResponseStatus.lIllIllIIllllI[5] = "  ".length();
        HttpResponseStatus.lIllIllIIllllI[6] = (0xFFFFB9B7 & 0x47D8);
        HttpResponseStatus.lIllIllIIllllI[7] = "   ".length();
        HttpResponseStatus.lIllIllIIllllI[8] = (-(0xFFFFFE1D & 0x19EB) & (0xFFFFDBFC & 0x3DFF));
        HttpResponseStatus.lIllIllIIllllI[9] = (5 + 97 - 56 + 82 ^ 71 + 66 - 10 + 5);
        HttpResponseStatus.lIllIllIIllllI[10] = (0xFFFFAEDB & 0x537C);
        HttpResponseStatus.lIllIllIIllllI[11] = (0x8A ^ 0x8F);
        HttpResponseStatus.lIllIllIIllllI[12] = (0xE0 ^ 0xAE ^ (0xF9 ^ 0xB1));
        HttpResponseStatus.lIllIllIIllllI[13] = (0x8A ^ 0x8D);
        HttpResponseStatus.lIllIllIIllllI[14] = (0x87 ^ 0xAE);
        HttpResponseStatus.lIllIllIIllllI[15] = (0x22 ^ 0x2A);
        HttpResponseStatus.lIllIllIIllllI[16] = (144 + 151 - 287 + 144 ^ 67 + 138 - 137 + 77);
        HttpResponseStatus.lIllIllIIllllI[17] = (0x58 ^ 0x52);
        HttpResponseStatus.lIllIllIIllllI[18] = (0x1F ^ 0x14);
        HttpResponseStatus.lIllIllIIllllI[19] = (102 + 51 - 40 + 45 ^ 86 + 23 - 24 + 61);
        HttpResponseStatus.lIllIllIIllllI[20] = (127 + 30 - 43 + 40 ^ 112 + 111 - 136 + 99);
        HttpResponseStatus.lIllIllIIllllI[21] = (0x7A ^ 0x6 ^ (0x66 ^ 0x17));
        HttpResponseStatus.lIllIllIIllllI[22] = (0xC1 ^ 0xA4);
        HttpResponseStatus.lIllIllIIllllI[23] = (0x40 ^ 0x4E);
        HttpResponseStatus.lIllIllIIllllI[24] = (0x21 ^ 0x7F ^ (0x4A ^ 0x72));
        HttpResponseStatus.lIllIllIIllllI[25] = (0x20 ^ 0x2F ^ ((0x3A ^ 0x62) & ~(0x7B ^ 0x23)));
        HttpResponseStatus.lIllIllIIllllI[26] = (0x1 ^ 0x11);
        HttpResponseStatus.lIllIllIIllllI[27] = 2 + 188 - 62 + 73;
        HttpResponseStatus.lIllIllIIllllI[28] = (0x30 ^ 0x3A ^ (0x10 ^ 0xB));
        HttpResponseStatus.lIllIllIIllllI[29] = 105 + 130 - 125 + 92;
        HttpResponseStatus.lIllIllIIllllI[30] = (0xA2 ^ 0xBD ^ (0x92 ^ 0x9F));
        HttpResponseStatus.lIllIllIIllllI[31] = 78 + 102 - 26 + 39 + (0xAF ^ 0x8A) - (0xA2 ^ 0x97) + (0x68 ^ 0x72);
        HttpResponseStatus.lIllIllIIllllI[32] = (0x9B ^ 0x88);
        HttpResponseStatus.lIllIllIIllllI[33] = 57 + 99 - 55 + 79 + (0x52 ^ 0x1) - (0x2 ^ 0x58) + (0x54 ^ 0x4B);
        HttpResponseStatus.lIllIllIIllllI[34] = (0x52 ^ 0x46);
        HttpResponseStatus.lIllIllIIllllI[35] = 53 + 187 - 72 + 37;
        HttpResponseStatus.lIllIllIIllllI[36] = (0x22 ^ 0x37);
        HttpResponseStatus.lIllIllIIllllI[37] = 17 + 68 + 61 + 60;
        HttpResponseStatus.lIllIllIIllllI[38] = (0x45 ^ 0x53);
        HttpResponseStatus.lIllIllIIllllI[39] = (0xDB ^ 0x9D) + (0x7D ^ 0x75) - -(0x6 ^ 0x7A) + (0x77 ^ 0x72);
        HttpResponseStatus.lIllIllIIllllI[40] = (121 + 103 - 214 + 121 ^ 115 + 45 - 29 + 17);
        HttpResponseStatus.lIllIllIIllllI[41] = (183 + 176 - 265 + 90 ^ 132 + 37 - 69 + 60);
        HttpResponseStatus.lIllIllIIllllI[42] = (-(0xFFFFFADD & 0x3FF3) & (0xFFFFBBFF & 0x7FFD));
        HttpResponseStatus.lIllIllIIllllI[43] = (0x4 ^ 0x1D);
        HttpResponseStatus.lIllIllIIllllI[44] = (0xFFFFEB3E & 0x15EF);
        HttpResponseStatus.lIllIllIIllllI[45] = (0x7E ^ 0x11 ^ (0x37 ^ 0x42));
        HttpResponseStatus.lIllIllIIllllI[46] = (-(0xFFFFFFDB & 0x3C75) & (0xFFFFBFFF & 0x7D7F));
        HttpResponseStatus.lIllIllIIllllI[47] = (48 + 142 - 80 + 49 ^ 125 + 88 - 158 + 77);
        HttpResponseStatus.lIllIllIIllllI[48] = (0xFFFF8FF3 & 0x713C);
        HttpResponseStatus.lIllIllIIllllI[49] = (0xD ^ 0x25 ^ (0xE ^ 0x3A));
        HttpResponseStatus.lIllIllIIllllI[50] = (0xFFFF95BB & 0x6B75);
        HttpResponseStatus.lIllIllIIllllI[51] = (3 + 124 - 90 + 153 ^ 14 + 63 + 60 + 26);
        HttpResponseStatus.lIllIllIIllllI[52] = (0xFFFFD5BF & 0x2B73);
        HttpResponseStatus.lIllIllIIllllI[53] = (0x22 ^ 0x3C);
        HttpResponseStatus.lIllIllIIllllI[54] = (0xA0 ^ 0xB9 ^ (0xAA ^ 0xAC));
        HttpResponseStatus.lIllIllIIllllI[55] = (-(0xFFFFEE3F & 0x5BE5) & (0xFFFFDBBD & 0x6FF7));
        HttpResponseStatus.lIllIllIIllllI[56] = (-(0xFFFFBF6E & 0x44F3) & (0xFFFF9FFF & 0x65F3));
        HttpResponseStatus.lIllIllIIllllI[57] = (0x5B ^ 0x7D ^ (0xC0 ^ 0xC7));
        HttpResponseStatus.lIllIllIIllllI[58] = (0xFFFFF3B7 & 0xDDB);
        HttpResponseStatus.lIllIllIIllllI[59] = (113 + 197 - 203 + 117 ^ 105 + 39 + 48 + 2);
        HttpResponseStatus.lIllIllIIllllI[60] = (-(-1 & 0x4829) & (0xFFFFCBFE & 0x7DBD));
        HttpResponseStatus.lIllIllIIllllI[61] = (127 + 159 - 237 + 132 ^ 82 + 70 - 39 + 37);
        HttpResponseStatus.lIllIllIIllllI[62] = (-(0xFFFFE2FB & 0x5F6F) & (0xFFFFD7FF & 0x6BFF));
        HttpResponseStatus.lIllIllIIllllI[63] = (59 + 134 - 186 + 183 ^ 115 + 41 - 144 + 142);
        HttpResponseStatus.lIllIllIIllllI[64] = (-(0xFFFFF771 & 0x6ECF) & (0xFFFFF7D7 & 0x6FFE));
        HttpResponseStatus.lIllIllIIllllI[65] = (0x16 ^ 0x4F ^ (0xED ^ 0x91));
        HttpResponseStatus.lIllIllIIllllI[66] = (0xFFFFADDF & 0x53B7);
        HttpResponseStatus.lIllIllIIllllI[67] = (0x61 ^ 0x47);
        HttpResponseStatus.lIllIllIIllllI[68] = (0xFFFFFDB8 & 0x3DF);
        HttpResponseStatus.lIllIllIIllllI[69] = (139 + 7 - 143 + 154 ^ 74 + 79 - 21 + 54);
        HttpResponseStatus.lIllIllIIllllI[70] = (0xFFFFF9FD & 0x79B);
        HttpResponseStatus.lIllIllIIllllI[71] = (0x23 ^ 0xB);
        HttpResponseStatus.lIllIllIIllllI[72] = (0xFFFFFFDF & 0x1BA);
        HttpResponseStatus.lIllIllIIllllI[73] = (0xFFFFA9DF & 0x57BB);
        HttpResponseStatus.lIllIllIIllllI[74] = (0x4A ^ 0x6D ^ (0x30 ^ 0x3D));
        HttpResponseStatus.lIllIllIIllllI[75] = (0xFFFFF9BD & 0x7DE);
        HttpResponseStatus.lIllIllIIllllI[76] = (0x25 ^ 0xE);
        HttpResponseStatus.lIllIllIIllllI[77] = (-(0xFFFFF733 & 0x6EEF) & (0xFFFFFFBF & 0x67FF));
        HttpResponseStatus.lIllIllIIllllI[78] = (0x14 ^ 0x38);
        HttpResponseStatus.lIllIllIIllllI[79] = (-(0xFFFFDAF7 & 0x7F49) & (0xFFFFFFDF & 0x5BFE));
        HttpResponseStatus.lIllIllIIllllI[80] = (0x88 ^ 0xA5);
        HttpResponseStatus.lIllIllIIllllI[81] = (-(0xFFFFBFF7 & 0x6669) & (0xFFFFA7FF & 0x7FFF));
        HttpResponseStatus.lIllIllIIllllI[82] = (0x81 ^ 0x96 ^ (0x65 ^ 0x5C));
        HttpResponseStatus.lIllIllIIllllI[83] = (-(0xFFFFFDE7 & 0x4A5B) & (0xFFFFDDE2 & 0x6BFF));
        HttpResponseStatus.lIllIllIIllllI[84] = (45 + 88 + 70 + 30 ^ 197 + 58 - 211 + 154);
        HttpResponseStatus.lIllIllIIllllI[85] = (0xFFFFAFBF & 0x51E1);
        HttpResponseStatus.lIllIllIIllllI[86] = (0x7B ^ 0x75 ^ (0x4C ^ 0x72));
        HttpResponseStatus.lIllIllIIllllI[87] = (0xFFFFCFEF & 0x31B6);
        HttpResponseStatus.lIllIllIIllllI[88] = (0x73 ^ 0x42);
        HttpResponseStatus.lIllIllIIllllI[89] = (-(0xFFFFE45D & 0x7FAB) & (0xFFFFEFAF & 0x75FF));
        HttpResponseStatus.lIllIllIIllllI[90] = (0xFB ^ 0xC4 ^ (0x9C ^ 0x91));
        HttpResponseStatus.lIllIllIIllllI[91] = (0xFFFF8BAF & 0x75F8);
        HttpResponseStatus.lIllIllIIllllI[92] = (23 + 100 - 1 + 6 ^ 36 + 109 - 116 + 150);
        HttpResponseStatus.lIllIllIIllllI[93] = (0xFFFFA9AB & 0x57FD);
        HttpResponseStatus.lIllIllIIllllI[94] = (0x12 ^ 0x26);
        HttpResponseStatus.lIllIllIIllllI[95] = (0xFFFF89FB & 0x77AE);
        HttpResponseStatus.lIllIllIIllllI[96] = (0xA8 ^ 0x9D);
        HttpResponseStatus.lIllIllIIllllI[97] = (-(0xFFFFB7F7 & 0x7E5B) & (0xFFFFFFFE & 0x37FF));
        HttpResponseStatus.lIllIllIIllllI[98] = (0xEF ^ 0xB2 ^ (0xC9 ^ 0xA2));
        HttpResponseStatus.lIllIllIIllllI[99] = (-(0xFFFFFEFF & 0x7951) & (0xFFFFF9FF & 0x7FFD));
        HttpResponseStatus.lIllIllIIllllI[100] = (0x34 ^ 0x3);
        HttpResponseStatus.lIllIllIIllllI[101] = (-(0xFFFFFE45 & 0x73BB) & (0xFFFFF3BF & 0x7FEF));
        HttpResponseStatus.lIllIllIIllllI[102] = (0x1F ^ 0x27);
        HttpResponseStatus.lIllIllIIllllI[103] = (0x2F ^ 0x16);
        HttpResponseStatus.lIllIllIIllllI[104] = (-(0xFFFF92F9 & 0x7D0F) & (0xFFFFB3FF & 0x5DFD));
        HttpResponseStatus.lIllIllIIllllI[105] = (0x99 ^ 0xA3);
        HttpResponseStatus.lIllIllIIllllI[106] = (-(0xFFFFFF5A & 0x2CAF) & (0xFFFFBDFF & 0x6FFF));
        HttpResponseStatus.lIllIllIIllllI[107] = (0x44 ^ 0x7F);
        HttpResponseStatus.lIllIllIIllllI[108] = (0xFFFFB9F7 & 0x47FF);
        HttpResponseStatus.lIllIllIIllllI[109] = (0xBA ^ 0x88 ^ (0xB0 ^ 0xBE));
        HttpResponseStatus.lIllIllIIllllI[110] = (0xFFFFA3FD & 0x5DFA);
        HttpResponseStatus.lIllIllIIllllI[111] = (0x49 ^ 0x29 ^ (0xF6 ^ 0xAB));
        HttpResponseStatus.lIllIllIIllllI[112] = (-(0xFFFF9BEF & 0x7613) & (0xFFFF9BFF & 0x77FB));
        HttpResponseStatus.lIllIllIIllllI[113] = (0x51 ^ 0x6F);
        HttpResponseStatus.lIllIllIIllllI[114] = (0xFFFFE5FB & 0x1BFE);
        HttpResponseStatus.lIllIllIIllllI[115] = (0x5E ^ 0x61);
        HttpResponseStatus.lIllIllIIllllI[116] = (-(0xFFFFF639 & 0x7DC7) & (0xFFFFFDFB & 0x77FF));
        HttpResponseStatus.lIllIllIIllllI[117] = (0x28 ^ 0x68);
        HttpResponseStatus.lIllIllIIllllI[118] = (-(0xFFFFBE9E & 0x7D63) & (0xFFFFBDFF & 0x7FFF));
        HttpResponseStatus.lIllIllIIllllI[119] = (0xC9 ^ 0x88);
        HttpResponseStatus.lIllIllIIllllI[120] = (-(0xFFFFE24D & 0x1FB3) & (0xFFFFF7FF & 0xBFF));
        HttpResponseStatus.lIllIllIIllllI[121] = (0x21 ^ 0x49 ^ (0x55 ^ 0x7F));
        HttpResponseStatus.lIllIllIIllllI[122] = (192 + 19 - 92 + 80 ^ 28 + 0 - 4 + 108);
    }
    
    private static String llllllllIIIIlll(String llllllllllllIlllllllIIIlIlIIlIll, final String llllllllllllIlllllllIIIlIlIIllll) {
        llllllllllllIlllllllIIIlIlIIlIll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllllIIIlIlIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllIIIlIlIIlllI = new StringBuilder();
        final char[] llllllllllllIlllllllIIIlIlIIllIl = llllllllllllIlllllllIIIlIlIIllll.toCharArray();
        int llllllllllllIlllllllIIIlIlIIllII = HttpResponseStatus.lIllIllIIllllI[1];
        final long llllllllllllIlllllllIIIlIlIIIllI = (Object)((String)llllllllllllIlllllllIIIlIlIIlIll).toCharArray();
        final boolean llllllllllllIlllllllIIIlIlIIIlIl = llllllllllllIlllllllIIIlIlIIIllI.length != 0;
        String llllllllllllIlllllllIIIlIlIIIlII = (String)HttpResponseStatus.lIllIllIIllllI[1];
        while (llllllllIIIllll((int)llllllllllllIlllllllIIIlIlIIIlII, llllllllllllIlllllllIIIlIlIIIlIl ? 1 : 0)) {
            final char llllllllllllIlllllllIIIlIlIlIIIl = llllllllllllIlllllllIIIlIlIIIllI[llllllllllllIlllllllIIIlIlIIIlII];
            llllllllllllIlllllllIIIlIlIIlllI.append((char)(llllllllllllIlllllllIIIlIlIlIIIl ^ llllllllllllIlllllllIIIlIlIIllIl[llllllllllllIlllllllIIIlIlIIllII % llllllllllllIlllllllIIIlIlIIllIl.length]));
            "".length();
            ++llllllllllllIlllllllIIIlIlIIllII;
            ++llllllllllllIlllllllIIIlIlIIIlII;
            "".length();
            if ("  ".length() < ((0x6B ^ 0x73) & ~(0x19 ^ 0x1))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllIIIlIlIIlllI);
    }
    
    void encode(final ByteBuf llllllllllllIlllllllIIIlIllIIIll) {
        if (llllllllIIlIIIl(this.bytes)) {
            HttpHeaders.encodeAscii0(String.valueOf(this.code()), llllllllllllIlllllllIIIlIllIIIll);
            llllllllllllIlllllllIIIlIllIIIll.writeByte(HttpResponseStatus.lIllIllIIllllI[20]);
            "".length();
            HttpHeaders.encodeAscii0(String.valueOf(this.reasonPhrase()), llllllllllllIlllllllIIIlIllIIIll);
            "".length();
            if ("  ".length() > "   ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlllllllIIIlIllIIIll.writeBytes(this.bytes);
            "".length();
        }
    }
    
    private static boolean llllllllIIIllll(final int llllllllllllIlllllllIIIlIIlIIIlI, final int llllllllllllIlllllllIIIlIIlIIIIl) {
        return llllllllllllIlllllllIIIlIIlIIIlI < llllllllllllIlllllllIIIlIIlIIIIl;
    }
    
    @Override
    public int compareTo(final HttpResponseStatus llllllllllllIlllllllIIIlIllIllIl) {
        return this.code() - llllllllllllIlllllllIIIlIllIllIl.code();
    }
    
    public static HttpResponseStatus valueOf(final int llllllllllllIlllllllIIIllIIllllI) {
        switch (llllllllllllIlllllllIIIllIIllllI) {
            case 100: {
                return HttpResponseStatus.CONTINUE;
            }
            case 101: {
                return HttpResponseStatus.SWITCHING_PROTOCOLS;
            }
            case 102: {
                return HttpResponseStatus.PROCESSING;
            }
            case 200: {
                return HttpResponseStatus.OK;
            }
            case 201: {
                return HttpResponseStatus.CREATED;
            }
            case 202: {
                return HttpResponseStatus.ACCEPTED;
            }
            case 203: {
                return HttpResponseStatus.NON_AUTHORITATIVE_INFORMATION;
            }
            case 204: {
                return HttpResponseStatus.NO_CONTENT;
            }
            case 205: {
                return HttpResponseStatus.RESET_CONTENT;
            }
            case 206: {
                return HttpResponseStatus.PARTIAL_CONTENT;
            }
            case 207: {
                return HttpResponseStatus.MULTI_STATUS;
            }
            case 300: {
                return HttpResponseStatus.MULTIPLE_CHOICES;
            }
            case 301: {
                return HttpResponseStatus.MOVED_PERMANENTLY;
            }
            case 302: {
                return HttpResponseStatus.FOUND;
            }
            case 303: {
                return HttpResponseStatus.SEE_OTHER;
            }
            case 304: {
                return HttpResponseStatus.NOT_MODIFIED;
            }
            case 305: {
                return HttpResponseStatus.USE_PROXY;
            }
            case 307: {
                return HttpResponseStatus.TEMPORARY_REDIRECT;
            }
            case 400: {
                return HttpResponseStatus.BAD_REQUEST;
            }
            case 401: {
                return HttpResponseStatus.UNAUTHORIZED;
            }
            case 402: {
                return HttpResponseStatus.PAYMENT_REQUIRED;
            }
            case 403: {
                return HttpResponseStatus.FORBIDDEN;
            }
            case 404: {
                return HttpResponseStatus.NOT_FOUND;
            }
            case 405: {
                return HttpResponseStatus.METHOD_NOT_ALLOWED;
            }
            case 406: {
                return HttpResponseStatus.NOT_ACCEPTABLE;
            }
            case 407: {
                return HttpResponseStatus.PROXY_AUTHENTICATION_REQUIRED;
            }
            case 408: {
                return HttpResponseStatus.REQUEST_TIMEOUT;
            }
            case 409: {
                return HttpResponseStatus.CONFLICT;
            }
            case 410: {
                return HttpResponseStatus.GONE;
            }
            case 411: {
                return HttpResponseStatus.LENGTH_REQUIRED;
            }
            case 412: {
                return HttpResponseStatus.PRECONDITION_FAILED;
            }
            case 413: {
                return HttpResponseStatus.REQUEST_ENTITY_TOO_LARGE;
            }
            case 414: {
                return HttpResponseStatus.REQUEST_URI_TOO_LONG;
            }
            case 415: {
                return HttpResponseStatus.UNSUPPORTED_MEDIA_TYPE;
            }
            case 416: {
                return HttpResponseStatus.REQUESTED_RANGE_NOT_SATISFIABLE;
            }
            case 417: {
                return HttpResponseStatus.EXPECTATION_FAILED;
            }
            case 422: {
                return HttpResponseStatus.UNPROCESSABLE_ENTITY;
            }
            case 423: {
                return HttpResponseStatus.LOCKED;
            }
            case 424: {
                return HttpResponseStatus.FAILED_DEPENDENCY;
            }
            case 425: {
                return HttpResponseStatus.UNORDERED_COLLECTION;
            }
            case 426: {
                return HttpResponseStatus.UPGRADE_REQUIRED;
            }
            case 428: {
                return HttpResponseStatus.PRECONDITION_REQUIRED;
            }
            case 429: {
                return HttpResponseStatus.TOO_MANY_REQUESTS;
            }
            case 431: {
                return HttpResponseStatus.REQUEST_HEADER_FIELDS_TOO_LARGE;
            }
            case 500: {
                return HttpResponseStatus.INTERNAL_SERVER_ERROR;
            }
            case 501: {
                return HttpResponseStatus.NOT_IMPLEMENTED;
            }
            case 502: {
                return HttpResponseStatus.BAD_GATEWAY;
            }
            case 503: {
                return HttpResponseStatus.SERVICE_UNAVAILABLE;
            }
            case 504: {
                return HttpResponseStatus.GATEWAY_TIMEOUT;
            }
            case 505: {
                return HttpResponseStatus.HTTP_VERSION_NOT_SUPPORTED;
            }
            case 506: {
                return HttpResponseStatus.VARIANT_ALSO_NEGOTIATES;
            }
            case 507: {
                return HttpResponseStatus.INSUFFICIENT_STORAGE;
            }
            case 510: {
                return HttpResponseStatus.NOT_EXTENDED;
            }
            case 511: {
                return HttpResponseStatus.NETWORK_AUTHENTICATION_REQUIRED;
            }
            default: {
                String llllllllllllIlllllllIIIllIIlllll = null;
                if (llllllllIIIllll(llllllllllllIlllllllIIIllIIllllI, HttpResponseStatus.lIllIllIIllllI[0])) {
                    final String llllllllllllIlllllllIIIllIlIIllI = HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[1]];
                    "".length();
                    if (-(0x3E ^ 0x9 ^ (0x75 ^ 0x47)) >= 0) {
                        return null;
                    }
                }
                else if (llllllllIIIllll(llllllllllllIlllllllIIIllIIllllI, HttpResponseStatus.lIllIllIIllllI[2])) {
                    final String llllllllllllIlllllllIIIllIlIIlIl = HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[3]];
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return null;
                    }
                }
                else if (llllllllIIIllll(llllllllllllIlllllllIIIllIIllllI, HttpResponseStatus.lIllIllIIllllI[4])) {
                    final String llllllllllllIlllllllIIIllIlIIlII = HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[5]];
                    "".length();
                    if ("  ".length() == ((0x2B ^ 0x3C ^ (0x4A ^ 0xD)) & (0xD8 ^ 0xA3 ^ (0x31 ^ 0x1A) ^ -" ".length()))) {
                        return null;
                    }
                }
                else if (llllllllIIIllll(llllllllllllIlllllllIIIllIIllllI, HttpResponseStatus.lIllIllIIllllI[6])) {
                    final String llllllllllllIlllllllIIIllIlIIIll = HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[7]];
                    "".length();
                    if (((0xEA ^ 0x85 ^ (0x15 ^ 0x5B)) & ("  ".length() ^ (0x45 ^ 0x66) ^ -" ".length())) != 0x0) {
                        return null;
                    }
                }
                else if (llllllllIIIllll(llllllllllllIlllllllIIIllIIllllI, HttpResponseStatus.lIllIllIIllllI[8])) {
                    final String llllllllllllIlllllllIIIllIlIIIlI = HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[9]];
                    "".length();
                    if ((0xA9 ^ 0xAC) == 0x0) {
                        return null;
                    }
                }
                else if (llllllllIIIllll(llllllllllllIlllllllIIIllIIllllI, HttpResponseStatus.lIllIllIIllllI[10])) {
                    final String llllllllllllIlllllllIIIllIlIIIIl = HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[11]];
                    "".length();
                    if (((120 + 20 + 12 + 98 ^ 178 + 98 - 164 + 67) & (20 + 141 - 27 + 61 ^ 43 + 67 - 79 + 107 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                }
                else {
                    llllllllllllIlllllllIIIllIIlllll = HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[12]];
                }
                return new HttpResponseStatus(llllllllllllIlllllllIIIllIIllllI, String.valueOf(new StringBuilder().append(llllllllllllIlllllllIIIllIIlllll).append(HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[13]]).append(llllllllllllIlllllllIIIllIIllllI).append((char)HttpResponseStatus.lIllIllIIllllI[14])));
            }
        }
    }
    
    private static boolean llllllllIIlIIIl(final Object llllllllllllIlllllllIIIlIIIlllll) {
        return llllllllllllIlllllllIIIlIIIlllll == null;
    }
    
    private static String llllllllIIIIIll(final String llllllllllllIlllllllIIIlIIlIllII, final String llllllllllllIlllllllIIIlIIlIlIll) {
        try {
            final SecretKeySpec llllllllllllIlllllllIIIlIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIIIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), HttpResponseStatus.lIllIllIIllllI[15]), "DES");
            final Cipher llllllllllllIlllllllIIIlIIllIIII = Cipher.getInstance("DES");
            llllllllllllIlllllllIIIlIIllIIII.init(HttpResponseStatus.lIllIllIIllllI[5], llllllllllllIlllllllIIIlIIllIIIl);
            return new String(llllllllllllIlllllllIIIlIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIIIlIIlIllll) {
            llllllllllllIlllllllIIIlIIlIllll.printStackTrace();
            return null;
        }
    }
    
    public String reasonPhrase() {
        return this.reasonPhrase;
    }
    
    @Override
    public int hashCode() {
        return this.code();
    }
    
    public int code() {
        return this.code;
    }
    
    private static void llllllllIIIlIlI() {
        (lIllIllIIlllII = new String[HttpResponseStatus.lIllIllIIllllI[122]])[HttpResponseStatus.lIllIllIIllllI[1]] = llllllllIIIIIll("M8CDREJinpo5aSuKY41b9w==", "ljBdv");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[3]] = llllllllIIIIIll("f7T6wYqyhiGFplHqQsulgQ==", "GxSOD");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[5]] = llllllllIIIIlll("FQ0NKBc1Cwg+Hg==", "FxnKr");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[7]] = llllllllIIIIIll("ARmje14a0tV/NPIUL3w9eA==", "aitdZ");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[9]] = llllllllIIIIIll("i1x86xdT90uCz2Wdc+xeUg==", "enItM");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[11]] = llllllllIIIIIll("7NR3MQUjtp1mQ/Giup7uXg==", "BgoIt");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[12]] = llllllllIIIIlll("LBgiOSMOGGkEOBgCPCQ=", "yvIWL");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[13]] = llllllllIIIlIII("yxa5Di0le5s=", "iRvcC");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[15]] = llllllllIIIIIll("LjWmRlh0hYQ=", "XfPyN");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[16]] = llllllllIIIlIII("xYzY4CIjgwEkj+wXOpec1Q==", "SKors");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[17]] = llllllllIIIIlll("Ng02MCoqOD8xJDcN", "DhWCE");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[18]] = llllllllIIIIIll("gMshe18COXSwvZg5RhHBhhjxqCsqBE2GAjcmgh4g2JweyReBrmkW5NrioYAjgITNltuq4Kka2bDeRBem6Hs58PZYVm7HzMLgyCeSH8fyltE=", "AGicp");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[19]] = llllllllIIIIIll("xFTJDNfpbmc=", "GLkYo");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[21]] = llllllllIIIIIll("PFmIBdZAv5YTVIo8LdqPeg==", "WcCfd");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[23]] = llllllllIIIIIll("Xsvyn4fFW+aTIKMPOgL+dke4xyTaHuAL", "aUfWq");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[25]] = llllllllIIIIlll("CTslBQwqOiMIDg==", "YIJfi");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[26]] = llllllllIIIIIll("a7UqF38MfUo=", "QWKaX");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[28]] = llllllllIIIlIII("0oK+wjJLXKQ=", "hdHRk");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[30]] = llllllllIIIIlll("OwUNHwIOAwo=", "zfnzr");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[32]] = llllllllIIIlIII("vn8RT5V8F9W6UMX/J6P8oUSqORW4ukKaGvocg/XKRdo=", "Uqbmt");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[34]] = llllllllIIIlIII("ANbY3wlCUqh03mG4oERPvw==", "pJyNd");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[36]] = llllllllIIIIIll("cteBBxRoip5SPhrhQET4fA==", "MWEgm");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[38]] = llllllllIIIIIll("+WrvY7PvxU9fnxyzBBTvxw==", "cPUzn");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[40]] = llllllllIIIlIII("UKKyQ+om5B+hTsh8g+Swiw==", "XiXRD");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[41]] = llllllllIIIIIll("qX+/uiy076+b54tNJ9TWw+baOs86dWae", "QmkTb");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[43]] = llllllllIIIlIII("J79xyXJ1FSrXIpDhI+j45zamGWIVExVl", "XOhZC");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[45]] = llllllllIIIlIII("jd3zHFl4MgI=", "LuCPF");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[47]] = llllllllIIIIIll("5apHK46dDh/LKrIHDuAIiw==", "KGbSl");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[49]] = llllllllIIIlIII("rj0g1N/zjd/8SrW3KXbtIQ==", "BGkdX");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[51]] = llllllllIIIlIII("OatNsEZ4KO9Ezll1VgivFQ==", "EdlnK");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[53]] = llllllllIIIIIll("5jO1yR6X9mLy1k2CrbAfsEmqXHIcwx6u", "WtXYw");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[54]] = llllllllIIIIlll("EDclaCU3JzQtBCY=", "RVAHw");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[20]] = llllllllIIIIIll("7feQ8rW7XTM7FQncuFvIhg==", "WWsNE");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[57]] = llllllllIIIIIll("hawf1ZrM93MSma1oxvj/xW86O+XpCmlT", "jpBRR");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[59]] = llllllllIIIIIll("8UeH/Uja7BDFSjsim5NagA==", "zIzdT");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[61]] = llllllllIIIIIll("qfBs5bodLNyJer75TkF1Mw==", "DSEdL");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[63]] = llllllllIIIIIll("3Nb1JLp3emyFZA12gYQTUT7u/zAULqbj", "HInrn");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[65]] = llllllllIIIlIII("s0dcosQtv7YIa//ebJN0tw==", "GTUDy");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[67]] = llllllllIIIIIll("b/5HGj30f6AAFFkAWdaAcEiU2gFk0ihcRn5O3gmvDy4=", "xxAXw");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[69]] = llllllllIIIIlll("HhQ7PDE/BWodPSEUJTwg", "LqJIT");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[71]] = llllllllIIIIIll("TaRIFWyd4cDhAWMWyfOipQ==", "DFcsN");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[14]] = llllllllIIIlIII("xmuO31mu3Vc=", "HNZMX");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[74]] = llllllllIIIlIII("MaeleYvFJTTBkvtxLllEkw==", "Xqcec");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[76]] = llllllllIIIIlll("EwQ/LggtEjM5DiwYegsGKho/KQ==", "CvZMg");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[78]] = llllllllIIIIlll("NQY/DQ8UF249BBMKOgFKMwwhWCYGESkd", "gcNxj");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[80]] = llllllllIIIlIII("Yv6Z8aRcd71U4phr34pfoZDRGf3op1ST", "lUYLI");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[82]] = llllllllIIIlIII("KsKZFxEw13eaCPSPD+EaRadAYKFU7eP0", "MtOTO");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[84]] = llllllllIIIIlll("IBUlDyYBBDEeYyAROh0mUj47DmMhESATMBQZNRgvFw==", "rpTzC");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[86]] = llllllllIIIlIII("+hvMjVv3CCMkgMQN9TyK7Z8FpBT/LQ0G", "eWrVH");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[88]] = llllllllIIIlIII("+xTSKYiV6VQdcwxqYWNeIrQcvz/zANkz", "cWnYo");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[90]] = llllllllIIIIIll("1Bb7pPfiHac=", "EjDAx");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[92]] = llllllllIIIIIll("iCixPLUsqp2uaqf6KDzLVIcT5NX9e9l/", "mYBcv");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[94]] = llllllllIIIIlll("ABYnKBwwCi0+WBYXJDYdNgwhNRY=", "UxHZx");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[96]] = llllllllIIIIIll("QrHvqPuw3qhQFpcQywSSlxJuFsp5sOQ8", "AVdFq");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[98]] = llllllllIIIIIll("ebRJ1r8rkgy3ruzC4/sR8CuJLbX0swOn", "bMnoc");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[100]] = llllllllIIIIlll("LCMDQhwZIhVCAx09GQciDD8=", "xLlbQ");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[102]] = llllllllIIIIlll("GDQXHCo5JUYhKis1AxtvDDgDBSs5cTIGIGodBxsoLw==", "JQfiO");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[103]] = llllllllIIIlIII("hU2FldPoJ93fXuMSZgPA0EqTy4iHOp2N", "AvJey");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[105]] = llllllllIIIIlll("CzUjUxAoKjsWNCA0IxY9", "EZWsY");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[107]] = llllllllIIIIlll("ACsCUwsjPgMELTs=", "BJfsL");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[109]] = llllllllIIIlIII("+pwyKqU2hyqL/Vvax/XF3ILv+o837/9d", "LMPOX");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[111]] = llllllllIIIIIll("kemmGqYRnm2TDLueEitBsw==", "xamqn");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[113]] = llllllllIIIlIII("oz9uI6YHax+OXIKWuJHxd8ofKLgEY04rwNzdOZvihkk=", "JDeLA");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[115]] = llllllllIIIlIII("kvwEHTLTpoTQLj6u4xUxDxSYlBZe6wnE", "fLNOX");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[117]] = llllllllIIIIIll("ffm6wBqXHPrZKZVxkThAOZ94ajPXtmTF", "esDFD");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[119]] = llllllllIIIIlll("BCs4YjIyMCksEy8g", "JDLBw");
        HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[121]] = llllllllIIIlIII("9HUVX831odxMrf5IiDYmP33NmutMK9NsPzOe5qlHUsA=", "UUtZG");
    }
    
    private static boolean llllllllIIlIIlI(final int llllllllllllIlllllllIIIlIIIlllIl) {
        return llllllllllllIlllllllIIIlIIIlllIl != 0;
    }
    
    private static boolean llllllllIIlIlII(final int llllllllllllIlllllllIIIlIIlIIllI, final int llllllllllllIlllllllIIIlIIlIIlIl) {
        return llllllllllllIlllllllIIIlIIlIIllI == llllllllllllIlllllllIIIlIIlIIlIl;
    }
    
    private static boolean llllllllIIlIIII(final int llllllllllllIlllllllIIIlIIIllIIl) {
        return llllllllllllIlllllllIIIlIIIllIIl < 0;
    }
    
    private HttpResponseStatus(final int llllllllllllIlllllllIIIllIIIIllI, final String llllllllllllIlllllllIIIllIIIIlIl, final boolean llllllllllllIlllllllIIIllIIIlIII) {
        if (llllllllIIlIIII(llllllllllllIlllllllIIIllIIIIllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[15]]).append(llllllllllllIlllllllIIIllIIIIllI).append(HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[16]])));
        }
        if (llllllllIIlIIIl(llllllllllllIlllllllIIIllIIIIlIl)) {
            throw new NullPointerException(HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[17]]);
        }
        int llllllllllllIlllllllIIIllIIIllII = HttpResponseStatus.lIllIllIIllllI[1];
        while (llllllllIIIllll(llllllllllllIlllllllIIIllIIIllII, llllllllllllIlllllllIIIllIIIIlIl.length())) {
            final char llllllllllllIlllllllIIIllIIIllIl = llllllllllllIlllllllIIIllIIIIlIl.charAt(llllllllllllIlllllllIIIllIIIllII);
            switch (llllllllllllIlllllllIIIllIIIllIl) {
                case '\n':
                case '\r': {
                    throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[18]]).append(llllllllllllIlllllllIIIllIIIIlIl)));
                }
                default: {
                    ++llllllllllllIlllllllIIIllIIIllII;
                    "".length();
                    if ((0x9B ^ 0x9F) == "   ".length()) {
                        throw null;
                    }
                    continue;
                }
            }
        }
        this.code = llllllllllllIlllllllIIIllIIIIllI;
        this.reasonPhrase = llllllllllllIlllllllIIIllIIIIlIl;
        if (llllllllIIlIIlI(llllllllllllIlllllllIIIllIIIlIII ? 1 : 0)) {
            this.bytes = String.valueOf(new StringBuilder().append(llllllllllllIlllllllIIIllIIIIllI).append(HttpResponseStatus.lIllIllIIlllII[HttpResponseStatus.lIllIllIIllllI[19]]).append(llllllllllllIlllllllIIIllIIIIlIl)).getBytes(CharsetUtil.US_ASCII);
            "".length();
            if ((0x55 ^ 0x51) < "   ".length()) {
                throw null;
            }
        }
        else {
            this.bytes = null;
        }
    }
    
    public HttpResponseStatus(final int llllllllllllIlllllllIIIllIIllIII, final String llllllllllllIlllllllIIIllIIlIlll) {
        this(llllllllllllIlllllllIIIllIIllIII, llllllllllllIlllllllIIIllIIlIlll, (boolean)(HttpResponseStatus.lIllIllIIllllI[1] != 0));
    }
}
