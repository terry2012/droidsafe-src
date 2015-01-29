package android.database;

import droidsafe.annotations.DSC;
import droidsafe.annotations.DSModeled;

public class DataSetObservable extends Observable<DataSetObserver> {
	@DSModeled(DSC.SAFE)
	public DataSetObservable() {
		super();
		//Does not exist in original model
	}
	
	public void notifyChanged() {
        synchronized(mObservers) {
        	for (int i = mObservers.size() - 1; i >= 0; i--) {
                mObservers.get(i).onChanged();
            }
        }
	}
	
	public void notifyInvalidated() {
        synchronized (mObservers) {
            for (int i = mObservers.size() - 1; i >= 0; i--) {
                mObservers.get(i).onInvalidated();
            }
        }
    }
	
	@Override
	public void registerObserver(DataSetObserver observer) {
		observer.onChanged();
		observer.onInvalidated();
        mObservers.add(0, observer);
    }
}