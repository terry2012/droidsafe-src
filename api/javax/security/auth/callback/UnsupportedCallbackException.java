package javax.security.auth.callback;

// Droidsafe Imports
import droidsafe.annotations.*;





public class UnsupportedCallbackException extends Exception {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.874 -0400", hash_original_field = "924A8CEEAC17F54D3BE3F8CDF1C04EB2", hash_generated_field = "1B1600DBF2D274518D5E0379C95B483E")

    private Callback callback;
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.874 -0400", hash_original_method = "6F64A91CCA6DECE8990E118F6F2706F6", hash_generated_method = "D0D2AF18505AA576BB4AA2E2936C7D6B")
    public  UnsupportedCallbackException(Callback callback) {
        this.callback = callback;
        // ---------- Original Method ----------
        //this.callback = callback;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.875 -0400", hash_original_method = "E54A6FA33A5BFCD773DCE92A09F71FE9", hash_generated_method = "F2AB684AD9AA4102D4EEDBE8ED41F564")
    public  UnsupportedCallbackException(Callback callback, String message) {
        super(message);
        addTaint(message.getTaint());
        this.callback = callback;
        // ---------- Original Method ----------
        //this.callback = callback;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.876 -0400", hash_original_method = "C52CB6D8F1111BAF8BAA5D6F66319767", hash_generated_method = "4CDD2F304C7B4494F7545F2D3F7CBABE")
    public Callback getCallback() {
Callback var221B6914C84D3DFBD8B1EDBBC49B8CE3_1806805390 =         callback;
        var221B6914C84D3DFBD8B1EDBBC49B8CE3_1806805390.addTaint(taint);
        return var221B6914C84D3DFBD8B1EDBBC49B8CE3_1806805390;
        // ---------- Original Method ----------
        //return callback;
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:17.876 -0400", hash_original_field = "8EAB790C17550FAD68CD57E527710DAC", hash_generated_field = "FC86D54941A45B4F0C0B942F5184732A")

    private static final long serialVersionUID = -6873556327655666839L;
}

