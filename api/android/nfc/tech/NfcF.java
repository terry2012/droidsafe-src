package android.nfc.tech;

// Droidsafe Imports
import droidsafe.annotations.*;
import java.io.IOException;

import android.nfc.ErrorCodes;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.RemoteException;





public final class NfcF extends BasicTagTechnology {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.769 -0400", hash_original_field = "0BF6864C5F4227002F2CA21BE8F000AE", hash_generated_field = "8144AE907BE5B2181516DBD1D62E97D6")

    private byte[] mSystemCode = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.769 -0400", hash_original_field = "1C3CC1076CEE4FEE0EE127964B8977D0", hash_generated_field = "D7A1C8F789011716682DAB2FCD913220")

    private byte[] mManufacturer = null;
    
    @DSModeled(DSC.BAN)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.770 -0400", hash_original_method = "0D9BC91BC56C91CB4B73C77A46406834", hash_generated_method = "D7D19CE68E32AF4015FC4D5E207627BE")
    public  NfcF(Tag tag) throws RemoteException {
        super(tag, TagTechnology.NFC_F);
        addTaint(tag.getTaint());
        Bundle extras = tag.getTechExtras(TagTechnology.NFC_F);
        if(extras != null)        
        {
            mSystemCode = extras.getByteArray(EXTRA_SC);
            mManufacturer = extras.getByteArray(EXTRA_PMM);
        } //End block
        // ---------- Original Method ----------
        //Bundle extras = tag.getTechExtras(TagTechnology.NFC_F);
        //if (extras != null) {
            //mSystemCode = extras.getByteArray(EXTRA_SC);
            //mManufacturer = extras.getByteArray(EXTRA_PMM);
        //}
    }

    
    public static NfcF get(Tag tag) {
        if (!tag.hasTech(TagTechnology.NFC_F)) return null;
        try {
            return new NfcF(tag);
        } catch (RemoteException e) {
            return null;
        }
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.772 -0400", hash_original_method = "5593A08645ACC7B6D3C7AFEF98D893C4", hash_generated_method = "ABEE8AA20D35FA6B4FB4E558F3C8A649")
    public byte[] getSystemCode() {
        byte[] var385E9CF9AAB562794ED9FA72359F5432_1444257932 = (mSystemCode);
                byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1472759277 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1472759277;
        // ---------- Original Method ----------
        //return mSystemCode;
    }

    
        @DSModeled(DSC.SAFE)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.772 -0400", hash_original_method = "674E72909806E7E1411B5B9E47606852", hash_generated_method = "42F548019D1F3CA499AAE0E3B263536D")
    public byte[] getManufacturer() {
        byte[] var6D6C47A5EB4751EE95A0B83ED231F29F_958330908 = (mManufacturer);
                byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_2116406229 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_2116406229;
        // ---------- Original Method ----------
        //return mManufacturer;
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.773 -0400", hash_original_method = "E43990821CE38E04B46B3E901EFDFA24", hash_generated_method = "F6B8B7E714D339ED980509A4850C91AC")
    public byte[] transceive(byte[] data) throws IOException {
        addTaint(data[0]);
        byte[] varEE32C696607EBC614D9A30134ACB1AE3_1634327197 = (transceive(data, true));
                byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1200813470 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1200813470;
        // ---------- Original Method ----------
        //return transceive(data, true);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.774 -0400", hash_original_method = "CF96EF3BF3FCE4DA3D9E7FBB541AEB70", hash_generated_method = "4CCBFE6F1CBE054E5C4E63FC91980AC7")
    public int getMaxTransceiveLength() {
        int var534FE261D7083B235B3B010A14A83EE1_1536423487 = (getMaxTransceiveLengthInternal());
                int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1759272481 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1759272481;
        // ---------- Original Method ----------
        //return getMaxTransceiveLengthInternal();
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.775 -0400", hash_original_method = "D0C1DC7ECC9E082014D504E80FD68DDB", hash_generated_method = "6C81169D81091BE1292D96D45E0442D1")
    public void setTimeout(int timeout) {
        addTaint(timeout);
        try 
        {
            int err = mTag.getTagService().setTimeout(TagTechnology.NFC_F, timeout);
            if(err != ErrorCodes.SUCCESS)            
            {
                IllegalArgumentException varDB68BEF11A046B44BA82450BD6BDD1ED_1516109489 = new IllegalArgumentException("The supplied timeout is not valid");
                varDB68BEF11A046B44BA82450BD6BDD1ED_1516109489.addTaint(taint);
                throw varDB68BEF11A046B44BA82450BD6BDD1ED_1516109489;
            } //End block
        } //End block
        catch (RemoteException e)
        {
        } //End block
        // ---------- Original Method ----------
        //try {
            //int err = mTag.getTagService().setTimeout(TagTechnology.NFC_F, timeout);
            //if (err != ErrorCodes.SUCCESS) {
                //throw new IllegalArgumentException("The supplied timeout is not valid");
            //}
        //} catch (RemoteException e) {
            //Log.e(TAG, "NFC service dead", e);
        //}
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.776 -0400", hash_original_method = "BA26E553829B17341BEC1294BC995A3C", hash_generated_method = "A0EDC32DB4FBDDBC047FCAF4CEBF956B")
    public int getTimeout() {
        try 
        {
            int var670DA357EAA40C500FC6982183E36FEB_600783752 = (mTag.getTagService().getTimeout(TagTechnology.NFC_F));
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1273064698 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1273064698;
        } //End block
        catch (RemoteException e)
        {
            int varCFCD208495D565EF66E7DFF9F98764DA_729186436 = (0);
                        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1133582141 = getTaintInt();
            return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1133582141;
        } //End block
        // ---------- Original Method ----------
        //try {
            //return mTag.getTagService().getTimeout(TagTechnology.NFC_F);
        //} catch (RemoteException e) {
            //Log.e(TAG, "NFC service dead", e);
            //return 0;
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.776 -0400", hash_original_field = "839E89798F641D78E99C5732B39CA844", hash_generated_field = "BC8F11E4AEAD11E0412B7B53DF0CA6C8")

    private static final String TAG = "NFC";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.776 -0400", hash_original_field = "6DC1026D9CF472FF6DEB0FDF35BBF457", hash_generated_field = "5704B992AD33B718B3C71C8EF40A32EC")

    public static final String EXTRA_SC = "systemcode";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:23.776 -0400", hash_original_field = "F07087DA7C73A8E424C9B4A8D43B104D", hash_generated_field = "34E329AB64B6D1770F31F0C3818A0179")

    public static final String EXTRA_PMM = "pmm";
}

