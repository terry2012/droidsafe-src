package android.database;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

public class DataSetObservable extends Observable<DataSetObserver> {
    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:07.821 -0400", hash_original_method = "272BBF2661CCEF03EAE77BBF3297984E", hash_generated_method = "272BBF2661CCEF03EAE77BBF3297984E")
    public DataSetObservable ()
    {
        //Synthesized constructor
    }


        @DSModeled(DSC.SPEC)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:07.821 -0400", hash_original_method = "FCDAC37DCBE00C8E72E2289D698E0B3F", hash_generated_method = "25C0B16876972A19DFB57BEDFEDCAB50")
    public void notifyChanged() {
        synchronized
(mObservers)        {
for(int i = mObservers.size() - 1;i >= 0;i--)
            {
                mObservers.get(i).onChanged();
            } //End block
        } //End block
        // ---------- Original Method ----------
        //synchronized(mObservers) {
            //for (int i = mObservers.size() - 1; i >= 0; i--) {
                //mObservers.get(i).onChanged();
            //}
        //}
    }

    
        @DSModeled(DSC.SPEC)
@DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:07.822 -0400", hash_original_method = "C67632C7194D1964FA22740DFB1AA62E", hash_generated_method = "45BBBFC5CB1581EF10D6E81F338004FD")
    public void notifyInvalidated() {
        synchronized
(mObservers)        {
for(int i = mObservers.size() - 1;i >= 0;i--)
            {
                mObservers.get(i).onInvalidated();
            } //End block
        } //End block
        // ---------- Original Method ----------
        //synchronized (mObservers) {
            //for (int i = mObservers.size() - 1; i >= 0; i--) {
                //mObservers.get(i).onInvalidated();
            //}
        //}
    }

    
}

