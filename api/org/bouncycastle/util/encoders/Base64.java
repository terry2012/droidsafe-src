package org.bouncycastle.util.encoders;

// Droidsafe Imports
import droidsafe.annotations.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;






public class Base64 {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.234 -0400", hash_original_method = "2DB9D16143059D09A54A3BB31C55E28D", hash_generated_method = "2DB9D16143059D09A54A3BB31C55E28D")
    public Base64 ()
    {
        //Synthesized constructor
    }


    @DSModeled(DSC.SAFE)
    public static byte[] encode(
        byte[]    data) {
        int len = (data.length + 2) / 3 * 4;
        ByteArrayOutputStream bOut = new ByteArrayOutputStream(len);
        try
        {
            encoder.encode(data, 0, data.length, bOut);
        }
        catch (IOException e)
        {
            throw new RuntimeException("exception encoding base64 string: " + e);
        }
        return bOut.toByteArray();
    }

    
    @DSModeled(DSC.SAFE)
    public static int encode(
        byte[]                data,
        OutputStream    out) throws IOException {
        return encoder.encode(data, 0, data.length, out);
    }

    
    @DSModeled(DSC.SAFE)
    public static int encode(
        byte[]                data,
        int                    off,
        int                    length,
        OutputStream    out) throws IOException {
        return encoder.encode(data, off, length, out);
    }

    
    @DSModeled(DSC.SPEC)
    public static byte[] decode(
        byte[]    data) {
        int len = data.length / 4 * 3;
        ByteArrayOutputStream bOut = new ByteArrayOutputStream(len);
        try
        {
            encoder.decode(data, 0, data.length, bOut);
        }
        catch (IOException e)
        {
            throw new RuntimeException("exception decoding base64 string: " + e);
        }
        return bOut.toByteArray();
    }

    
    @DSModeled(DSC.SAFE)
    public static byte[] decode(
        String    data) {
        int len = data.length() / 4 * 3;
        ByteArrayOutputStream bOut = new ByteArrayOutputStream(len);
        try
        {
            encoder.decode(data, bOut);
        }
        catch (IOException e)
        {
            throw new RuntimeException("exception decoding base64 string: " + e);
        }
        return bOut.toByteArray();
    }

    
    public static int decode(
        String                data,
        OutputStream    out) throws IOException {
        return encoder.decode(data, out);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:42.237 -0400", hash_original_field = "A3380BA0564E5EBC4C03422982B036A8", hash_generated_field = "82B3D023B3737398DBE3759E13F6CAAE")

    private static final Encoder encoder = new Base64Encoder();
}

