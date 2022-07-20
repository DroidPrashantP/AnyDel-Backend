# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
-renamesourcefileattribute SourceFile

-keep class * extends androidx.fragment.app.Fragment{}
-keep class com.quadvision.anydel.backend.data.model.*
-keepnames class * extends android.os.Parcelable
-keepnames class * extends java.io.Serializable

-keep class com.quadvision.anydel.backend.data.model.** { *; }

-keepclasseswithmembers class * {
    @retrofit.http.* <methods>;
}

-keepclasseswithmembers class * {
    @com.quadvision.anydel.backend.data.model.* <methods>;
}
-keepclasseswithmembers class * {
    @com.quadvision.anydel.backend.data.model.* <fields>;
}
-keep class com.quadvision.anydel.*

# ProGuard rules for Retrofit

# Platform calls Class.forName on types which do not exist on Android to determine platform.
-dontnote retrofit2.Platform
# Platform used when running on Java 8 VMs. Will not be used at runtime.
-dontwarn retrofit2.Platform.Java8
# Retain generic type information for use by reflection by converters and adapters.
-keepattributes Signature
# Retain declared checked exceptions for use by a Proxy instance.
-keepattributes Exceptions



# ProGuard rules for Glide

-keep public class * implements com.bumptech.glide.module.GlideModule
-keep class * extends com.bumptech.glide.module.AppGlideModule {
 <init>(...);
}
-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}
-keep class com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder {
  *** rewind();
}

# ProGuard rules for GMS
-keepnames class com.google.android.gms.** {*;}

# ProGuard rules for Timber
-dontwarn org.jetbrains.annotations.**

# ProGuard rules for Butterknife
# Retain generated class which implement Unbinder.
-keep public class * implements butterknife.Unbinder { public <init>(**, android.view.View); }

# Prevent obfuscation of types which use ButterKnife annotations since the simple name
# is used to reflectively look up the generated ViewBinding.
-keep class butterknife.*
-keepclasseswithmembernames class * { @butterknife.* <methods>; }
-keepclasseswithmembernames class * { @butterknife.* <fields>; }

# ProGuard rules for lifecycle View Model
-keep class * extends androidx.lifecycle.ViewModel {
    <init>();
}
-keep class * extends androidx.lifecycle.AndroidViewModel {
    <init>(android.app.Application);
}

# ProGuard rules for Event bus
-keepattributes *Annotation*
-keepclassmembers class * {
    @de.greenrobot.event.Subscription <methods>;
}
-keep enum de.greenrobot.event.ThreadMode { *; }

-keepclassmembers class ** {
    public void onEvent*(**);
}

# ProGuard rules for Google Map
-keep class android.location.** { *; }

-keepnames class com.google.android.gms.maps.** {*;}
-keep public class com.google.android.gms.maps.** {*;}

#-dontwarn com.google.android.gms.maps.GeoPoint
#-dontwarn com.google.android.gms.maps.MapActivity
#-dontwarn com.google.android.gms.maps.GoogleMap
#-dontwarn com.google.android.gms.maps.MapController
#-dontwarn com.google.android.gms.maps.Overlay
-keep class com.google.android.gms.maps.** { *; }
-keep interface com.google.android.gms.maps.** { *; }
-keep class com.google.android.libraries.places.** { *; }
-keep interface com.google.android.libraries.places.** { *; }

-keep class com.google.android.material.snackbar.** { *; }