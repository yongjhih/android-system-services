/*
 * Copyright (C) 2015 8tory, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.content;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.service.wallpaper.WallpaperService;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;

/**
 * By the way, v23 supports:
 *
 * <pre>
 * <T> Context.getSystemService(Class)
 * </pre>
 *
 */
public class SystemServices {

    Context context;

    public SystemServices(Context context) {
        this.context = context;
    }

    public static SystemServices from(Context context) {
        return new SystemServices(context);
    }

    public AccessibilityManager getAccessibilityManager() { return getAccessibilityManager(context); }
    public AccountManager getAccountManager() { return getAccountManager(context); }
    public ActivityManager getActivityManager() { return getActivityManager(context); }
    public AlarmManager getAlarmManager() { return getAlarmManager(context); }
    public AppWidgetManager getAppWidgetManager() { return getAppWidgetManager(context); }
    public AppOpsManager getAppOpsManager() { return getAppOpsManager(context); }
    public AudioManager getAudioManager() { return getAudioManager(context); }
    public BatteryManager getBatteryManager() { return getBatteryManager(context); }
    public BluetoothManager getBluetoothManager() { return getBluetoothManager(context); }
    public CameraManager getCameraManager() { return getCameraManager(context); }
    public CaptioningManager getCaptioningManager() { return getCaptioningManager(context); }
    // v23 public CarrierConfigManager getCarrierConfigManager() { return getCarrierConfigManager(context); }
    public ClipboardManager getClipboardManager() { return getClipboardManager(context); }
    public ConnectivityManager getConnectivityManager() { return getConnectivityManager(context); }
    public ConsumerIrManager getConsumerIrManager() { return getConsumerIrManager(context); }
    public DevicePolicyManager getDevicePolicyManager() { return getDevicePolicyManager(context); }
    public DisplayManager getDisplayManager() { return getDisplayManager(context); }
    public DownloadManager getDownloadManager() { return getDownloadManager(context); }
    public DropBoxManager getDropBoxManager() { return getDropBoxManager(context); }
    // v23 public FingerprintManager getFingerprintManager() { return getFingerprintManager(context); }
    public InputMethodManager getInputMethodManager() { return getInputMethodManager(context); }
    public InputManager getInputManager() { return getInputManager(context); }
    public JobScheduler getJobScheduler() { return getJobScheduler(context); }
    public KeyguardManager getKeyguardManager() { return getKeyguardManager(context); }
    public LauncherApps getLauncherApps() { return getLauncherApps(context); }
    public LayoutInflater getLayoutInflater() { return getLayoutInflater(context); }
    public LocationManager getLocationManager() { return getLocationManager(context); }
    public MediaProjectionManager getMediaProjectionManager() { return getMediaProjectionManager(context); }
    public MediaRouter getMediaRouter() { return getMediaRouter(context); }
    public MediaSessionManager getMediaSessionManager() { return getMediaSessionManager(context); }
    // v23 public MidiManager getMidiManager() { return getMidiManager(context); }
    // v23 public NetworkStatsManager getNetworkStatsManager() { return getNetworkStatsManager(context); }
    public NfcManager getNfcManager() { return getNfcManager(context); }
    public NotificationManager getNotificationManager() { return getNotificationManager(context); }
    public NsdManager getNsdManager() { return getNsdManager(context); }
    public PowerManager getPowerManager() { return getPowerManager(context); }
    public RestrictionsManager getRestrictionsManager() { return getRestrictionsManager(context); }
    public SearchManager getSearchManager() { return getSearchManager(context); }
    public SensorManager getSensorManager() { return getSensorManager(context); }
    public StorageManager getStorageManager() { return getStorageManager(context); }
    public TelecomManager getTelecomManager() { return getTelecomManager(context); }
    public TelephonyManager getTelephonyManager() { return getTelephonyManager(context); }
    // v22 public SubscriptionManager getSubscriptionManager() { return getSubscriptionManager(context); }
    public TextServicesManager getTextServicesManager() { return getTextServicesManager(context); }
    public TvInputManager getTvInputManager() { return getTvInputManager(context); }
    public UiModeManager getUiModeManager() { return getUiModeManager(context); }
    // v22 public UsageStatsManager getUsageStatsManager() { return getUsageStatsManager(context); }
    public UsbManager getUsbManager() { return getUsbManager(context); }
    public UserManager getUserManager() { return getUserManager(context); }
    public Vibrator getVibrator() { return getVibrator(context); }
    public WallpaperService getWallpaperService() { return getWallpaperService(context); }
    public WifiP2pManager getWifiP2pManager() { return getWifiP2pManager(context); }
    public WifiManager getWifiManager() { return getWifiManager(context); }
    public WindowManager getWindowManager() { return getWindowManager(context); }

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object object) {
        return (T) object;
    }

    public static AccessibilityManager getAccessibilityManager(Context context) { return cast(context.getSystemService(Context.ACCESSIBILITY_SERVICE)); }
    public static AccountManager getAccountManager(Context context) { return cast(context.getSystemService(Context.ACCOUNT_SERVICE)); }
    public static ActivityManager getActivityManager(Context context) { return cast(context.getSystemService(Context.ACTIVITY_SERVICE)); }
    public static AlarmManager getAlarmManager(Context context) { return cast(context.getSystemService(Context.ALARM_SERVICE)); }
    public static AppWidgetManager getAppWidgetManager(Context context) { return cast(context.getSystemService(Context.APPWIDGET_SERVICE)); }
    public static AppOpsManager getAppOpsManager(Context context) { return cast(context.getSystemService(Context.APP_OPS_SERVICE)); }
    public static AudioManager getAudioManager(Context context) { return cast(context.getSystemService(Context.AUDIO_SERVICE)); }
    public static BatteryManager getBatteryManager(Context context) { return cast(context.getSystemService(Context.BATTERY_SERVICE)); }
    public static BluetoothManager getBluetoothManager(Context context) { return cast(context.getSystemService(Context.BLUETOOTH_SERVICE)); }
    public static CameraManager getCameraManager(Context context) { return cast(context.getSystemService(Context.CAMERA_SERVICE)); }
    public static CaptioningManager getCaptioningManager(Context context) { return cast(context.getSystemService(Context.CAPTIONING_SERVICE)); }
    // public static CarrierConfigManager getCarrierConfigManager(Context context) { return cast(context.getSystemService(Context.CARRIER_CONFIG_SERVICE)); }
    public static ClipboardManager getClipboardManager(Context context) { return cast(context.getSystemService(Context.CLIPBOARD_SERVICE)); }
    public static ConnectivityManager getConnectivityManager(Context context) { return cast(context.getSystemService(Context.CONNECTIVITY_SERVICE)); }
    public static ConsumerIrManager getConsumerIrManager(Context context) { return cast(context.getSystemService(Context.CONSUMER_IR_SERVICE)); }
    public static DevicePolicyManager getDevicePolicyManager(Context context) { return cast(context.getSystemService(Context.DEVICE_POLICY_SERVICE)); }
    public static DisplayManager getDisplayManager(Context context) { return cast(context.getSystemService(Context.DISPLAY_SERVICE)); }
    public static DownloadManager getDownloadManager(Context context) { return cast(context.getSystemService(Context.DOWNLOAD_SERVICE)); }
    public static DropBoxManager getDropBoxManager(Context context) { return cast(context.getSystemService(Context.DROPBOX_SERVICE)); }
    // public static FingerprintManager getFingerprintManager(Context context) { return cast(context.getSystemService(Context.FINGERPRINT_SERVICE)); }
    public static InputMethodManager getInputMethodManager(Context context) { return cast(context.getSystemService(Context.INPUT_METHOD_SERVICE)); }
    public static InputManager getInputManager(Context context) { return cast(context.getSystemService(Context.INPUT_SERVICE)); }
    public static JobScheduler getJobScheduler(Context context) { return cast(context.getSystemService(Context.JOB_SCHEDULER_SERVICE)); }
    public static KeyguardManager getKeyguardManager(Context context) { return cast(context.getSystemService(Context.KEYGUARD_SERVICE)); }
    public static LauncherApps getLauncherApps(Context context) { return cast(context.getSystemService(Context.LAUNCHER_APPS_SERVICE)); }
    public static LayoutInflater getLayoutInflater(Context context) { return cast(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)); }
    public static LocationManager getLocationManager(Context context) { return cast(context.getSystemService(Context.LOCATION_SERVICE)); }
    public static MediaProjectionManager getMediaProjectionManager(Context context) { return cast(context.getSystemService(Context.MEDIA_PROJECTION_SERVICE)); }
    public static MediaRouter getMediaRouter(Context context) { return cast(context.getSystemService(Context.MEDIA_ROUTER_SERVICE)); }
    public static MediaSessionManager getMediaSessionManager(Context context) { return cast(context.getSystemService(Context.MEDIA_SESSION_SERVICE)); }
    // public static MidiManager getMidiManager(Context context) { return cast(context.getSystemService(Context.MIDI_SERVICE)); }
    // public static NetworkStatsManager getNetworkStatsManager(Context context) { return cast(context.getSystemService(Context.NETWORK_STATS_SERVICE)); }
    public static NfcManager getNfcManager(Context context) { return cast(context.getSystemService(Context.NFC_SERVICE)); }
    public static NotificationManager getNotificationManager(Context context) { return cast(context.getSystemService(Context.NOTIFICATION_SERVICE)); }
    public static NsdManager getNsdManager(Context context) { return cast(context.getSystemService(Context.NSD_SERVICE)); }
    public static PowerManager getPowerManager(Context context) { return cast(context.getSystemService(Context.POWER_SERVICE)); }
    public static RestrictionsManager getRestrictionsManager(Context context) { return cast(context.getSystemService(Context.RESTRICTIONS_SERVICE)); }
    public static SearchManager getSearchManager(Context context) { return cast(context.getSystemService(Context.SEARCH_SERVICE)); }
    public static SensorManager getSensorManager(Context context) { return cast(context.getSystemService(Context.SENSOR_SERVICE)); }
    public static StorageManager getStorageManager(Context context) { return cast(context.getSystemService(Context.STORAGE_SERVICE)); }
    public static TelecomManager getTelecomManager(Context context) { return cast(context.getSystemService(Context.TELECOM_SERVICE)); }
    public static TelephonyManager getTelephonyManager(Context context) { return cast(context.getSystemService(Context.TELEPHONY_SERVICE)); }
    // public static SubscriptionManager getSubscriptionManager(Context context) { return cast(context.getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE)); }
    public static TextServicesManager getTextServicesManager(Context context) { return cast(context.getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE)); }
    public static TvInputManager getTvInputManager(Context context) { return cast(context.getSystemService(Context.TV_INPUT_SERVICE)); }
    public static UiModeManager getUiModeManager(Context context) { return cast(context.getSystemService(Context.UI_MODE_SERVICE)); }
    // v22 public static UsageStatsManager getUsageStatsManager(Context context) { return cast(context.getSystemService(Context.USAGE_STATS_SERVICE)); }
    public static UsbManager getUsbManager(Context context) { return cast(context.getSystemService(Context.USB_SERVICE)); }
    public static UserManager getUserManager(Context context) { return cast(context.getSystemService(Context.USER_SERVICE)); }
    public static Vibrator getVibrator(Context context) { return cast(context.getSystemService(Context.VIBRATOR_SERVICE)); }
    public static WallpaperService getWallpaperService(Context context) { return cast(context.getSystemService(Context.WALLPAPER_SERVICE)); }
    public static WifiP2pManager getWifiP2pManager(Context context) { return cast(context.getSystemService(Context.WIFI_P2P_SERVICE)); }
    public static WifiManager getWifiManager(Context context) { return cast(context.getSystemService(Context.WIFI_SERVICE)); }
    public static WindowManager getWindowManager(Context context) { return cast(context.getSystemService(Context.WINDOW_SERVICE)); }

    /*
ACCESSIBILITY_SERVICE   Use with getSystemService(Class) to retrieve a AccessibilityManager for giving the user feedback for UI events through the registered event listeners.
ACCOUNT_SERVICE Use with getSystemService(Class) to retrieve a AccountManager for receiving intents at a time of your choosing.
ACTIVITY_SERVICE        Use with getSystemService(Class) to retrieve a ActivityManager for interacting with the global system state.
ALARM_SERVICE   Use with getSystemService(Class) to retrieve a AlarmManager for receiving intents at a time of your choosing.
APPWIDGET_SERVICE       Use with getSystemService(Class) to retrieve a AppWidgetManager for accessing AppWidgets.
APP_OPS_SERVICE Use with getSystemService(Class) to retrieve a AppOpsManager for tracking application operations on the device.
AUDIO_SERVICE   Use with getSystemService(Class) to retrieve a AudioManager for handling management of volume, ringer modes and audio routing.
BATTERY_SERVICE Use with getSystemService(Class) to retrieve a BatteryManager for managing battery state.
BLUETOOTH_SERVICE       Use with getSystemService(Class) to retrieve a BluetoothManager for using Bluetooth.
CAMERA_SERVICE  Use with getSystemService(Class) to retrieve a CameraManager for interacting with camera devices.
CAPTIONING_SERVICE      Use with getSystemService(Class) to retrieve a CaptioningManager for obtaining captioning properties and listening for changes in captioning preferences.
CARRIER_CONFIG_SERVICE  Use with getSystemService(Class) to retrieve a CarrierConfigManager for reading carrier configuration values.
CLIPBOARD_SERVICE       Use with getSystemService(Class) to retrieve a ClipboardManager for accessing and modifying ClipboardManager for accessing and modifying the contents of the global clipboard.
CONNECTIVITY_SERVICE    Use with getSystemService(Class) to retrieve a ConnectivityManager for handling management of network connections.
CONSUMER_IR_SERVICE     Use with getSystemService(Class) to retrieve a ConsumerIrManager for transmitting infrared signals from the device.
DEVICE_POLICY_SERVICE   Use with getSystemService(Class) to retrieve a DevicePolicyManager for working with global device policy management.
DISPLAY_SERVICE Use with getSystemService(Class) to retrieve a DisplayManager for interacting with display devices.
DOWNLOAD_SERVICE        Use with getSystemService(Class) to retrieve a DownloadManager for requesting HTTP downloads.
DROPBOX_SERVICE Use with getSystemService(Class) to retrieve a DropBoxManager instance for recording diagnostic logs.
FINGERPRINT_SERVICE     Use with getSystemService(Class) to retrieve a FingerprintManager for handling management of fingerprints.
INPUT_METHOD_SERVICE    Use with getSystemService(Class) to retrieve a InputMethodManager for accessing input methods.
INPUT_SERVICE   Use with getSystemService(Class) to retrieve a InputManager for interacting with input devices.
JOB_SCHEDULER_SERVICE   Use with getSystemService(Class) to retrieve a JobScheduler instance for managing occasional background tasks.
KEYGUARD_SERVICE        Use with getSystemService(Class) to retrieve a NotificationManager for controlling keyguard.
LAUNCHER_APPS_SERVICE   Use with getSystemService(Class) to retrieve a LauncherApps for querying and monitoring launchable apps across profiles of a user.
LAYOUT_INFLATER_SERVICE Use with getSystemService(Class) to retrieve a LayoutInflater for inflating layout resources in this context.
LOCATION_SERVICE        Use with getSystemService(Class) to retrieve a LocationManager for controlling location updates.
MEDIA_PROJECTION_SERVICE        Use with getSystemService(Class) to retrieve a MediaProjectionManager instance for managing media projection sessions.
MEDIA_ROUTER_SERVICE    Use with getSystemService(Class) to retrieve a MediaRouter for controlling and managing routing of media.
MEDIA_SESSION_SERVICE   Use with getSystemService(Class) to retrieve a MediaSessionManager for managing media Sessions.
MIDI_SERVICE    Use with getSystemService(Class) to retrieve a MidiManager for accessing the MIDI service.
NETWORK_STATS_SERVICE   Use with getSystemService(Class) to retrieve a NetworkStatsManager for querying network usage stats.
NFC_SERVICE     Use with getSystemService(Class) to retrieve a NfcManager for using NFC.
NOTIFICATION_SERVICE    Use with getSystemService(Class) to retrieve a NotificationManager for informing the user of background events.
NSD_SERVICE     Use with getSystemService(Class) to retrieve a NsdManager for handling management of network service discovery
POWER_SERVICE   Use with getSystemService(Class) to retrieve a PowerManager for controlling power management, including "wake locks," which let you keep the device on while you're running long tasks.
RESTRICTIONS_SERVICE    Use with getSystemService(Class) to retrieve a RestrictionsManager for retrieving application restrictions and requesting permissions for restricted operations.
SEARCH_SERVICE  Use with getSystemService(Class) to retrieve a SearchManager for handling searches.
SENSOR_SERVICE  Use with getSystemService(Class) to retrieve a SensorManager for accessing sensors.
STORAGE_SERVICE Use with getSystemService(Class) to retrieve a StorageManager for accessing system storage functions.
TELECOM_SERVICE Use with getSystemService(Class) to retrieve a TelecomManager to manage telecom-related features of the device.
TELEPHONY_SERVICE       Use with getSystemService(Class) to retrieve a TelephonyManager for handling management the telephony features of the device.
TELEPHONY_SUBSCRIPTION_SERVICE  Use with getSystemService(Class) to retrieve a SubscriptionManager for handling management the telephony subscriptions of the device.
TEXT_SERVICES_MANAGER_SERVICE   Use with getSystemService(Class) to retrieve a TextServicesManager for accessing text services.
TV_INPUT_SERVICE        Use with getSystemService(Class) to retrieve a TvInputManager for interacting with TV inputs on the device.
UI_MODE_SERVICE Use with getSystemService(Class) to retrieve a UiModeManager for controlling UI modes.
USAGE_STATS_SERVICE     Use with getSystemService(Class) to retrieve a UsageStatsManager for querying device usage stats.
USB_SERVICE     Use with getSystemService(Class) to retrieve a UsbManager for access to USB devices (as a USB host) and for controlling this device's behavior as a USB device.
USER_SERVICE    Use with getSystemService(Class) to retrieve a UserManager for managing users on devices that support multiple users.
VIBRATOR_SERVICE        Use with getSystemService(Class) to retrieve a Vibrator for interacting with the vibration hardware.
WALLPAPER_SERVICE       Use with getSystemService(Class) to retrieve a WallpaperService for accessing wallpapers.
WIFI_P2P_SERVICE        Use with getSystemService(Class) to retrieve a WifiP2pManager for handling management of Wi-Fi peer-to-peer connections.
WIFI_SERVICE    Use with getSystemService(Class) to retrieve a WifiManager for handling management of Wi-Fi access.
WINDOW_SERVICE  Use with getSystemService(Class) to retrieve a WindowManager for accessing the system's window manager.
    */
}
