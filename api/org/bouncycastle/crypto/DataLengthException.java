package org.bouncycastle.crypto;

// Droidsafe Imports
import droidsafe.annotations.*;


public class DataLengthException extends RuntimeCryptoException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:40.439 -0400", hash_original_method = "FC0834C19CF17037D683010F152D90BB", hash_generated_method = "A3B22023B871FEE196A5F978F598E189")
    public  DataLengthException() {
        // ---------- Original Method ----------
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:40.440 -0400", hash_original_method = "DC74BD7370354E956783B762D3A498AE", hash_generated_method = "8825DFBF11F788E13B04C37E19C59FC9")
    public  DataLengthException(
        String  message) {
        super(message);
        addTaint(message.getTaint());
        // ---------- Original Method ----------
    }

    
}

