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
import android.app.usage.NetworkStatsManager;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.pm.LauncherApps;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.midi.MidiManager;
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
import android.print.PrintManager;
import android.service.wallpaper.WallpaperService;
import android.telecom.TelecomManager;
import android.telephony.CarrierConfigManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;

import android.annotation.TargetApi;

/**
 *
 */
public class SystemServices {

    Context context;

    private SystemServices(Context context) {
        this.context = context;
    }

    public static SystemServices from(Context context) {
        return new SystemServices(context);
    }

    public ActivityManager getActivityManager() { return getActivityManager(context); }
    public AlarmManager getAlarmManager() { return getAlarmManager(context); }
    public AudioManager getAudioManager() { return getAudioManager(context); }
    public ClipboardManager getClipboardManager() { return getClipboardManager(context); }
    public ConnectivityManager getConnectivityManager() { return getConnectivityManager(context); }
    public KeyguardManager getKeyguardManager() { return getKeyguardManager(context); }
    public LayoutInflater getLayoutInflater() { return getLayoutInflater(context); }
    public LocationManager getLocationManager() { return getLocationManager(context); }
    public NotificationManager getNotificationManager() { return getNotificationManager(context); }
    public PowerManager getPowerManager() { return getPowerManager(context); }
    public SearchManager getSearchManager() { return getSearchManager(context); }
    public SensorManager getSensorManager() { return getSensorManager(context); }
    public TelephonyManager getTelephonyManager() { return getTelephonyManager(context); }
    public Vibrator getVibrator() { return getVibrator(context); }
    public WallpaperService getWallpaperService() { return getWallpaperService(context); }
    public WifiManager getWifiManager() { return getWifiManager(context); }
    public WindowManager getWindowManager() { return getWindowManager(context); }
    public InputMethodManager getInputMethodManager() { return getInputMethodManager(context); }
    public AccessibilityManager getAccessibilityManager() { return getAccessibilityManager(context); }
    public AccountManager getAccountManager() { return getAccountManager(context); }
    public DevicePolicyManager getDevicePolicyManager() { return getDevicePolicyManager(context); }
    public DropBoxManager getDropBoxManager() { return getDropBoxManager(context); }
    public UiModeManager getUiModeManager() { return getUiModeManager(context); }
    public DownloadManager getDownloadManager() { return getDownloadManager(context); }
    public StorageManager getStorageManager() { return getStorageManager(context); }
    public NfcManager getNfcManager() { return getNfcManager(context); }
    public UsbManager getUsbManager() { return getUsbManager(context); }
    public TextServicesManager getTextServicesManager() { return getTextServicesManager(context); }
    public WifiP2pManager getWifiP2pManager() { return getWifiP2pManager(context); }
    public InputManager getInputManager() { return getInputManager(context); }
    public MediaRouter getMediaRouter() { return getMediaRouter(context); }
    public NsdManager getNsdManager() { return getNsdManager(context); }
    public DisplayManager getDisplayManager() { return getDisplayManager(context); }
    public UserManager getUserManager() { return getUserManager(context); }
    public BluetoothManager getBluetoothManager() { return getBluetoothManager(context); }
    public AppOpsManager getAppOpsManager() { return getAppOpsManager(context); }
    public CaptioningManager getCaptioningManager() { return getCaptioningManager(context); }
    public ConsumerIrManager getConsumerIrManager() { return getConsumerIrManager(context); }
    public PrintManager getPrintManager() { return getPrintManager(context); }
    public AppWidgetManager getAppWidgetManager() { return getAppWidgetManager(context); }
    public BatteryManager getBatteryManager() { return getBatteryManager(context); }
    public CameraManager getCameraManager() { return getCameraManager(context); }
    public JobScheduler getJobScheduler() { return getJobScheduler(context); }
    public LauncherApps getLauncherApps() { return getLauncherApps(context); }
    public MediaProjectionManager getMediaProjectionManager() { return getMediaProjectionManager(context); }
    public MediaSessionManager getMediaSessionManager() { return getMediaSessionManager(context); }
    public RestrictionsManager getRestrictionsManager() { return getRestrictionsManager(context); }
    public TelecomManager getTelecomManager() { return getTelecomManager(context); }
    public TvInputManager getTvInputManager() { return getTvInputManager(context); }
    public SubscriptionManager getSubscriptionManager() { return getSubscriptionManager(context); }
    public UsageStatsManager getUsageStatsManager() { return getUsageStatsManager(context); }
    public CarrierConfigManager getCarrierConfigManager() { return getCarrierConfigManager(context); }
    public FingerprintManager getFingerprintManager() { return getFingerprintManager(context); }
    public MidiManager getMidiManager() { return getMidiManager(context); }
    public NetworkStatsManager getNetworkStatsManager() { return getNetworkStatsManager(context); }

    public static ActivityManager getActivityManager(Context context) { return context.getSystemService(ActivityManager.class); }
    public static AlarmManager getAlarmManager(Context context) { return context.getSystemService(AlarmManager.class); }
    public static AudioManager getAudioManager(Context context) { return context.getSystemService(AudioManager.class); }
    public static ClipboardManager getClipboardManager(Context context) { return context.getSystemService(ClipboardManager.class); }
    public static ConnectivityManager getConnectivityManager(Context context) { return context.getSystemService(ConnectivityManager.class); }
    public static KeyguardManager getKeyguardManager(Context context) { return context.getSystemService(KeyguardManager.class); }
    public static LayoutInflater getLayoutInflater(Context context) { return context.getSystemService(LayoutInflater.class); }
    public static LocationManager getLocationManager(Context context) { return context.getSystemService(LocationManager.class); }
    public static NotificationManager getNotificationManager(Context context) { return context.getSystemService(NotificationManager.class); }
    public static PowerManager getPowerManager(Context context) { return context.getSystemService(PowerManager.class); }
    public static SearchManager getSearchManager(Context context) { return context.getSystemService(SearchManager.class); }
    public static SensorManager getSensorManager(Context context) { return context.getSystemService(SensorManager.class); }
    public static TelephonyManager getTelephonyManager(Context context) { return context.getSystemService(TelephonyManager.class); }
    public static Vibrator getVibrator(Context context) { return context.getSystemService(Vibrator.class); }
    public static WallpaperService getWallpaperService(Context context) { return context.getSystemService(WallpaperService.class); }
    public static WifiManager getWifiManager(Context context) { return context.getSystemService(WifiManager.class); }
    public static WindowManager getWindowManager(Context context) { return context.getSystemService(WindowManager.class); }
    public static InputMethodManager getInputMethodManager(Context context) { return context.getSystemService(InputMethodManager.class); }
    public static AccessibilityManager getAccessibilityManager(Context context) { return context.getSystemService(AccessibilityManager.class); }
    public static AccountManager getAccountManager(Context context) { return context.getSystemService(AccountManager.class); }
    public static DevicePolicyManager getDevicePolicyManager(Context context) { return context.getSystemService(DevicePolicyManager.class); }
    public static DropBoxManager getDropBoxManager(Context context) { return context.getSystemService(DropBoxManager.class); }
    public static UiModeManager getUiModeManager(Context context) { return context.getSystemService(UiModeManager.class); }
    public static DownloadManager getDownloadManager(Context context) { return context.getSystemService(DownloadManager.class); }
    public static StorageManager getStorageManager(Context context) { return context.getSystemService(StorageManager.class); }
    public static NfcManager getNfcManager(Context context) { return context.getSystemService(NfcManager.class); }
    public static UsbManager getUsbManager(Context context) { return context.getSystemService(UsbManager.class); }
    public static TextServicesManager getTextServicesManager(Context context) { return context.getSystemService(TextServicesManager.class); }
    public static WifiP2pManager getWifiP2pManager(Context context) { return context.getSystemService(WifiP2pManager.class); }
    public static InputManager getInputManager(Context context) { return context.getSystemService(InputManager.class); }
    public static MediaRouter getMediaRouter(Context context) { return context.getSystemService(MediaRouter.class); }
    public static NsdManager getNsdManager(Context context) { return context.getSystemService(NsdManager.class); }
    public static DisplayManager getDisplayManager(Context context) { return context.getSystemService(DisplayManager.class); }
    public static UserManager getUserManager(Context context) { return context.getSystemService(UserManager.class); }
    public static BluetoothManager getBluetoothManager(Context context) { return context.getSystemService(BluetoothManager.class); }
    public static AppOpsManager getAppOpsManager(Context context) { return context.getSystemService(AppOpsManager.class); }
    public static CaptioningManager getCaptioningManager(Context context) { return context.getSystemService(CaptioningManager.class); }
    public static ConsumerIrManager getConsumerIrManager(Context context) { return context.getSystemService(ConsumerIrManager.class); }
    public static PrintManager getPrintManager(Context context) { return context.getSystemService(PrintManager.class); }
    public static AppWidgetManager getAppWidgetManager(Context context) { return context.getSystemService(AppWidgetManager.class); }
    public static BatteryManager getBatteryManager(Context context) { return context.getSystemService(BatteryManager.class); }
    public static CameraManager getCameraManager(Context context) { return context.getSystemService(CameraManager.class); }
    public static JobScheduler getJobScheduler(Context context) { return context.getSystemService(JobScheduler.class); }
    public static LauncherApps getLauncherApps(Context context) { return context.getSystemService(LauncherApps.class); }
    public static MediaProjectionManager getMediaProjectionManager(Context context) { return context.getSystemService(MediaProjectionManager.class); }
    public static MediaSessionManager getMediaSessionManager(Context context) { return context.getSystemService(MediaSessionManager.class); }
    public static RestrictionsManager getRestrictionsManager(Context context) { return context.getSystemService(RestrictionsManager.class); }
    public static TelecomManager getTelecomManager(Context context) { return context.getSystemService(TelecomManager.class); }
    public static TvInputManager getTvInputManager(Context context) { return context.getSystemService(TvInputManager.class); }
    public static SubscriptionManager getSubscriptionManager(Context context) { return context.getSystemService(SubscriptionManager.class); }
    public static UsageStatsManager getUsageStatsManager(Context context) { return context.getSystemService(UsageStatsManager.class); }
    public static CarrierConfigManager getCarrierConfigManager(Context context) { return context.getSystemService(CarrierConfigManager.class); }
    public static FingerprintManager getFingerprintManager(Context context) { return context.getSystemService(FingerprintManager.class); }
    public static MidiManager getMidiManager(Context context) { return context.getSystemService(MidiManager.class); }
    public static NetworkStatsManager getNetworkStatsManager(Context context) { return context.getSystemService(NetworkStatsManager.class); }

/*
1 ACTIVITY_SERVICE   Use with getSystemService(Class) to retrieve a ActivityManager for interacting with the global system state
1 ALARM_SERVICE   Use with getSystemService(Class) to retrieve a AlarmManager for receiving intents at a time of your choosing
1 AUDIO_SERVICE   Use with getSystemService(Class) to retrieve a AudioManager for handling management of volume, ringer modes and audio routing
1 CLIPBOARD_SERVICE   Use with getSystemService(Class) to retrieve a ClipboardManager for accessing and modifying ClipboardManager for accessing and modifying the contents of the global clipboard
1 CONNECTIVITY_SERVICE   Use with getSystemService(Class) to retrieve a ConnectivityManager for handling management of network connections
1 KEYGUARD_SERVICE   Use with getSystemService(Class) to retrieve a KeyguardManager for controlling keyguard
1 LAYOUT_INFLATER_SERVICE   Use with getSystemService(Class) to retrieve a LayoutInflater for inflating layout resources in this context
1 LOCATION_SERVICE   Use with getSystemService(Class) to retrieve a LocationManager for controlling location updates
1 NOTIFICATION_SERVICE   Use with getSystemService(Class) to retrieve a NotificationManager for informing the user of background events
1 POWER_SERVICE   Use with getSystemService(Class) to retrieve a PowerManager for controlling power management, including "wake locks," which let you keep the device on while you're running long tasks
1 SEARCH_SERVICE   Use with getSystemService(Class) to retrieve a SearchManager for handling searches
1 SENSOR_SERVICE   Use with getSystemService(Class) to retrieve a SensorManager for accessing sensors
1 TELEPHONY_SERVICE   Use with getSystemService(Class) to retrieve a TelephonyManager for handling management the telephony features of the device
1 VIBRATOR_SERVICE   Use with getSystemService(Class) to retrieve a Vibrator for interacting with the vibration hardware
1 WALLPAPER_SERVICE   Use with getSystemService(Class) to retrieve a WallpaperService
1 WIFI_SERVICE   Use with getSystemService(Class) to retrieve a WifiManager for handling management of Wi-Fi access
1 WINDOW_SERVICE   Use with getSystemService(Class) to retrieve a WindowManager for accessing the system's window manager
3 INPUT_METHOD_SERVICE   Use with getSystemService(Class) to retrieve a InputMethodManager for accessing input methods
4 ACCESSIBILITY_SERVICE   Use with getSystemService(Class) to retrieve a AccessibilityManager for giving the user feedback for UI events through the registered event listeners
5 ACCOUNT_SERVICE   Use with getSystemService(Class) to retrieve a AccountManager for receiving intents at a time of your choosing
8 DEVICE_POLICY_SERVICE   Use with getSystemService(Class) to retrieve a DevicePolicyManager for working with global device policy management
8 DROPBOX_SERVICE   Use with getSystemService(Class) to retrieve a DropBoxManager instance for recording diagnostic logs
8 UI_MODE_SERVICE   Use with getSystemService(Class) to retrieve a UiModeManager for controlling UI modes
9 DOWNLOAD_SERVICE   Use with getSystemService(Class) to retrieve a DownloadManager for requesting HTTP downloads
9 STORAGE_SERVICE   Use with getSystemService(Class) to retrieve a StorageManager for accessing system storage functions
10 NFC_SERVICE   Use with getSystemService(Class) to retrieve a NfcManager for using NFC
12 USB_SERVICE   Use with getSystemService(Class) to retrieve a UsbManager for access to USB devices (as a USB host) and for controlling this device's behavior as a USB device
14 TEXT_SERVICES_MANAGER_SERVICE   Use with getSystemService(Class) to retrieve a TextServicesManager for accessing text services
14 WIFI_P2P_SERVICE   Use with getSystemService(Class) to retrieve a WifiP2pManager for handling management of Wi-Fi peer-to-peer connections
16 INPUT_SERVICE   Use with getSystemService(Class) to retrieve a InputManager for interacting with input devices
16 MEDIA_ROUTER_SERVICE   Use with getSystemService(Class) to retrieve a MediaRouter for controlling and managing routing of media
16 NSD_SERVICE   Use with getSystemService(Class) to retrieve a NsdManager for handling management of network service discovery See Also getSystemService(Class) NsdManager Constant Value: "servicediscovery" 
17 DISPLAY_SERVICE   Use with getSystemService(Class) to retrieve a DisplayManager for interacting with display devices
17 USER_SERVICE   Use with getSystemService(Class) to retrieve a UserManager for managing users on devices that support multiple users
18 BLUETOOTH_SERVICE   Use with getSystemService(Class) to retrieve a BluetoothManager for using Bluetooth
19 APP_OPS_SERVICE   Use with getSystemService(Class) to retrieve a AppOpsManager for tracking application operations on the device
19 CAPTIONING_SERVICE   Use with getSystemService(Class) to retrieve a CaptioningManager for obtaining captioning properties and listening for changes in captioning preferences
19 CONSUMER_IR_SERVICE   Use with getSystemService(Class) to retrieve a ConsumerIrManager for transmitting infrared signals from the device
19 PRINT_SERVICE   retrieve a PrintManager for printing and managing printers and print tasks
21 APPWIDGET_SERVICE   Use with getSystemService(Class) to retrieve a AppWidgetManager for accessing AppWidgets
21 BATTERY_SERVICE   Use with getSystemService(Class) to retrieve a BatteryManager for managing battery state
21 CAMERA_SERVICE   Use with getSystemService(Class) to retrieve a CameraManager for interacting with camera devices
21 JOB_SCHEDULER_SERVICE   Use with getSystemService(Class) to retrieve a JobScheduler instance for managing occasional background tasks
21 LAUNCHER_APPS_SERVICE   Use with getSystemService(Class) to retrieve a LauncherApps for querying and monitoring launchable apps across profiles of a user
21 MEDIA_PROJECTION_SERVICE   Use with getSystemService(Class) to retrieve a MediaProjectionManager instance for managing media projection sessions
21 MEDIA_SESSION_SERVICE   Use with getSystemService(Class) to retrieve a MediaSessionManager for managing media Sessions
21 RESTRICTIONS_SERVICE   Use with getSystemService(Class) to retrieve a RestrictionsManager for retrieving application restrictions and requesting permissions for restricted operations
21 TELECOM_SERVICE   Use with getSystemService(Class) to retrieve a TelecomManager to manage telecom-related features of the device
21 TV_INPUT_SERVICE   Use with getSystemService(Class) to retrieve a TvInputManager for interacting with TV inputs on the device
22 TELEPHONY_SUBSCRIPTION_SERVICE   Use with getSystemService(Class) to retrieve a SubscriptionManager for handling management the telephony subscriptions of the device
22 USAGE_STATS_SERVICE   Use with getSystemService(Class) to retrieve a UsageStatsManager for querying device usage stats
23 CARRIER_CONFIG_SERVICE   Use with getSystemService(Class) to retrieve a CarrierConfigManager for reading carrier configuration values
23 FINGERPRINT_SERVICE   Use with getSystemService(Class) to retrieve a FingerprintManager for handling management of fingerprints
23 MIDI_SERVICE   Use with getSystemService(Class) to retrieve a MidiManager for accessing the MIDI service
23 NETWORK_STATS_SERVICE   Use with getSystemService(Class) to retrieve a NetworkStatsManager for querying network usage stats
*/
}
