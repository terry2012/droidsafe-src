package android.os;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import android.content.res.Resources;
import android.os.storage.IMountService;
import android.os.storage.StorageVolume;
import android.util.Log;
import java.io.File;

public class Environment {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.051 -0400", hash_original_method = "241E3402842314122858FA6ADB8EF111", hash_generated_method = "241E3402842314122858FA6ADB8EF111")
    public Environment ()
    {
        //Synthesized constructor
    }


    private static StorageVolume getPrimaryVolume() {
        if (mPrimaryVolume == null) {
            synchronized (mLock) {
                if (mPrimaryVolume == null) {
                    try {
                        IMountService mountService = IMountService.Stub.asInterface(ServiceManager
                                .getService("mount"));
                        Parcelable[] volumes = mountService.getVolumeList();
                        mPrimaryVolume = (StorageVolume)volumes[0];
                    } catch (Exception e) {
                        Log.e(TAG, "couldn't talk to MountService", e);
                    }
                }
            }
        }
        return mPrimaryVolume;
    }

    
    @DSModeled(DSC.SAFE)
    public static File getRootDirectory() {
        return ROOT_DIRECTORY;
    }

    
    public static File getSystemSecureDirectory() {
        if (isEncryptedFilesystemEnabled()) {
            return new File(SECURE_DATA_DIRECTORY, "system");
        } else {
            return new File(DATA_DIRECTORY, "system");
        }
    }

    
    public static File getSecureDataDirectory() {
        if (isEncryptedFilesystemEnabled()) {
            return SECURE_DATA_DIRECTORY;
        } else {
            return DATA_DIRECTORY;
        }
    }

    
    public static boolean isEncryptedFilesystemEnabled() {
        return SystemProperties.getBoolean(SYSTEM_PROPERTY_EFS_ENABLED, false);
    }

    
    @DSModeled(DSC.SAFE)
    public static File getDataDirectory() {
        return DATA_DIRECTORY;
    }

    
    @DSModeled(DSC.SAFE)
    public static File getExternalStorageDirectory() {
        return EXTERNAL_STORAGE_DIRECTORY;
    }

    
    @DSModeled(DSC.SPEC)
    public static File getExternalStoragePublicDirectory(String type) {
        return new File(getExternalStorageDirectory(), type);
    }

    
    @DSModeled(DSC.SAFE)
    public static File getExternalStorageAndroidDataDir() {
        return EXTERNAL_STORAGE_ANDROID_DATA_DIRECTORY;
    }

    
    public static File getExternalStorageAppDataDirectory(String packageName) {
        return new File(EXTERNAL_STORAGE_ANDROID_DATA_DIRECTORY, packageName);
    }

    
    public static File getExternalStorageAppMediaDirectory(String packageName) {
        return new File(EXTERNAL_STORAGE_ANDROID_MEDIA_DIRECTORY, packageName);
    }

    
    public static File getExternalStorageAppObbDirectory(String packageName) {
        return new File(EXTERNAL_STORAGE_ANDROID_OBB_DIRECTORY, packageName);
    }

    
    public static File getExternalStorageAppFilesDirectory(String packageName) {
        return new File(new File(EXTERNAL_STORAGE_ANDROID_DATA_DIRECTORY,
                packageName), "files");
    }

    
    public static File getExternalStorageAppCacheDirectory(String packageName) {
        return new File(new File(EXTERNAL_STORAGE_ANDROID_DATA_DIRECTORY,
                packageName), "cache");
    }

    
    @DSModeled(DSC.SAFE)
    public static File getDownloadCacheDirectory() {
        return DOWNLOAD_CACHE_DIRECTORY;
    }

    
    public static String getExternalStorageState() {
        try {
            IMountService mountService = IMountService.Stub.asInterface(ServiceManager
                    .getService("mount"));
            return mountService.getVolumeState(getExternalStorageDirectory()
                    .toString());
        } catch (Exception rex) {
            return Environment.MEDIA_REMOVED;
        }
    }

    
    public static boolean isExternalStorageRemovable() {
        StorageVolume volume = getPrimaryVolume();
        return (volume != null && volume.isRemovable());
    }

    
    public static boolean isExternalStorageEmulated() {
        StorageVolume volume = getPrimaryVolume();
        return (volume != null && volume.isEmulated());
    }

    
    static File getDirectory(String variableName, String defaultPath) {
        String path = System.getenv(variableName);
        return path == null ? new File(defaultPath) : new File(path);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.052 -0400", hash_original_field = "750B8CA0E2F92A884F2F67ABA76BB18B", hash_generated_field = "F91F1982BA049077D1EE09AA2045B613")

    private static final String TAG = "Environment";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "DB2844210BB13392DAD1E359626F598C", hash_generated_field = "FE08AA822266DAF98C9F2274AD45AF9E")

    private static final File ROOT_DIRECTORY = getDirectory("ANDROID_ROOT", "/system");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "72216CE61B337846319711F0E84FCC4D", hash_generated_field = "EE3FE0CAF4E93AB133014AF996B70CCE")

    private static final String SYSTEM_PROPERTY_EFS_ENABLED = "persist.security.efs.enabled";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "B89DEBA2CB26B1AC973763E3E152017B", hash_generated_field = "CA3747CC2EC4B1C7DB6ABC7879C88A34")

    private static final Object mLock = new Object();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "31A0CF18C5B97AEB2F1421D4FB0C9784", hash_generated_field = "BE2642BFD28BEEB7B21B6346504CF160")

    private volatile static StorageVolume mPrimaryVolume = null;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "ABD2DC3A68E7E273F00286BB6E564846", hash_generated_field = "4859F8047AF82464AD430C6BD0B6CE29")

    private static final File DATA_DIRECTORY = getDirectory("ANDROID_DATA", "/data");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "3F61A3C438E0DF8566DCC4F749E369A4", hash_generated_field = "C6ADCEB630E1DE7BE8C3111429988817")

    private static final File SECURE_DATA_DIRECTORY = getDirectory("ANDROID_SECURE_DATA", "/data/secure");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "F6750F49ABC2B48E79913450F0FBEB71", hash_generated_field = "265692B8C815542986C5D1C47C8A516C")

    private static final File EXTERNAL_STORAGE_DIRECTORY = getDirectory("EXTERNAL_STORAGE", "/mnt/sdcard");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "CEC4B98703B1F5079D7526CB8C9836A1", hash_generated_field = "43621C6B88A374CEBF6446E7926E8652")

    private static final File EXTERNAL_STORAGE_ANDROID_DATA_DIRECTORY = new File (new File(getDirectory("EXTERNAL_STORAGE", "/mnt/sdcard"),
                    "Android"), "data");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "3BA9A346DFEE82C8778D8240922DE757", hash_generated_field = "AD65A5FB28B34137240B3B2C48DF6C20")

    private static final File EXTERNAL_STORAGE_ANDROID_MEDIA_DIRECTORY = new File (new File(getDirectory("EXTERNAL_STORAGE", "/mnt/sdcard"),
                    "Android"), "media");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "F2DEA7505FDFA748D1FACEDA5EE74EE2", hash_generated_field = "ED045C15D4C606594CB4CE468299A66D")

    private static final File EXTERNAL_STORAGE_ANDROID_OBB_DIRECTORY = new File (new File(getDirectory("EXTERNAL_STORAGE", "/mnt/sdcard"),
                    "Android"), "obb");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "C014CD980A9B8BE92DC94186EA778D96", hash_generated_field = "4667E2C8EB83B2183E1EAA45E9576E1D")

    private static final File DOWNLOAD_CACHE_DIRECTORY = getDirectory("DOWNLOAD_CACHE", "/cache");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "590677122C58F4C2F8A7EC1E2FB64804", hash_generated_field = "EE29BEDB52B1554E0771529A5D3A8E48")

    public static String DIRECTORY_MUSIC = "Music";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "F7B269332FDCB209090D6D1AA76B2379", hash_generated_field = "0685015847EB4A3D4AD8E7993748B6E8")

    public static String DIRECTORY_PODCASTS = "Podcasts";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "D95C3E6C765F70581357086EE2768C26", hash_generated_field = "9CB97771535D9E25A3A0FDA673548158")

    public static String DIRECTORY_RINGTONES = "Ringtones";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "4E34F2CD98A11F415B2704657861F55A", hash_generated_field = "F057EDF5681571C9DBB44E0A0AA83E97")

    public static String DIRECTORY_ALARMS = "Alarms";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "4C5EF634F3EA63CE0648E347952BBB02", hash_generated_field = "19309F433A2615F682F53C35E8A631A5")

    public static String DIRECTORY_NOTIFICATIONS = "Notifications";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "E8F8C59B0E3BBC69B0B29BF43949B082", hash_generated_field = "FFC46A6EB1C0E6B1164AD7F94DB895B8")

    public static String DIRECTORY_PICTURES = "Pictures";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "9DE022718853EB7B4E629F3E7BBB340E", hash_generated_field = "8F92BD677CADD21CFD388A2803DB452F")

    public static String DIRECTORY_MOVIES = "Movies";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "9E45CB9E3DE2500F39D5A4FF923C18C6", hash_generated_field = "C8759A2F9F0F9F8FCC08291D89701E33")

    public static String DIRECTORY_DOWNLOADS = "Download";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "7E426D6F145C658DA3CC96C740355F41", hash_generated_field = "206F92563619BD2D186D2544136D04C8")

    public static String DIRECTORY_DCIM = "DCIM";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "8644C5A28B24B22784836A6D0C47ACA8", hash_generated_field = "37113F74E8E054A63E405E0ADA834CEB")

    public static final String MEDIA_REMOVED = "removed";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.053 -0400", hash_original_field = "29396BCA33E149B9E897E6FB278B934F", hash_generated_field = "E9FAA44C9791BA7D741A575FFB45F032")

    public static final String MEDIA_UNMOUNTED = "unmounted";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.054 -0400", hash_original_field = "57799F3D96C63B8769CC11F2C5A3D71A", hash_generated_field = "042438C52ECFA2824AAF3CA9CDE37D50")

    public static final String MEDIA_CHECKING = "checking";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.054 -0400", hash_original_field = "FCC4E486F9D8E36FE364B76891FEAD1E", hash_generated_field = "38AA20E914B9AAD98CFC8C46F05BA2A5")

    public static final String MEDIA_NOFS = "nofs";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.054 -0400", hash_original_field = "D56F346E769AC45FE0657572A31C0C29", hash_generated_field = "1F6D368F0292E0B8A9F91D45F8D566B0")

    public static final String MEDIA_MOUNTED = "mounted";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.054 -0400", hash_original_field = "384509D583A40A22D3B700FB3FA661B4", hash_generated_field = "8CB035758AAC9D9B4FFDCDA773CC93F5")

    public static final String MEDIA_MOUNTED_READ_ONLY = "mounted_ro";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.054 -0400", hash_original_field = "FCD9C03168EC90F94117F7446A1D75B4", hash_generated_field = "13A8DF508A9AA9E8BC667C5B778EBDE8")

    public static final String MEDIA_SHARED = "shared";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.054 -0400", hash_original_field = "7AEC83EC632C0899FE9CFCA4AE887AAE", hash_generated_field = "31324D4BCFDD7B522D73E10831EBFFC7")

    public static final String MEDIA_BAD_REMOVAL = "bad_removal";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:23:26.054 -0400", hash_original_field = "F62409139F4F7D014CD33A495E259D92", hash_generated_field = "00F588D9D8843A2FCFEE67842241EF18")

    public static final String MEDIA_UNMOUNTABLE = "unmountable";
}

