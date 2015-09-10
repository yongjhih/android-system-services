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

    @TargetApi(1) public ActivityManager getActivityManager() { return getActivityManager(context); }
    @TargetApi(1) public AlarmManager getAlarmManager() { return getAlarmManager(context); }
    @TargetApi(1) public AudioManager getAudioManager() { return getAudioManager(context); }
    @TargetApi(1) public ClipboardManager getClipboardManager() { return getClipboardManager(context); }
    @TargetApi(1) public ConnectivityManager getConnectivityManager() { return getConnectivityManager(context); }
    @TargetApi(1) public KeyguardManager getKeyguardManager() { return getKeyguardManager(context); }
    @TargetApi(1) public LayoutInflater getLayoutInflater() { return getLayoutInflater(context); }
    @TargetApi(1) public LocationManager getLocationManager() { return getLocationManager(context); }
    @TargetApi(1) public NotificationManager getNotificationManager() { return getNotificationManager(context); }
    @TargetApi(1) public PowerManager getPowerManager() { return getPowerManager(context); }
    @TargetApi(1) public SearchManager getSearchManager() { return getSearchManager(context); }
    @TargetApi(1) public SensorManager getSensorManager() { return getSensorManager(context); }
    @TargetApi(1) public TelephonyManager getTelephonyManager() { return getTelephonyManager(context); }
    @TargetApi(1) public Vibrator getVibrator() { return getVibrator(context); }
    @TargetApi(1) public WallpaperService getWallpaperService() { return getWallpaperService(context); }
    @TargetApi(1) public WifiManager getWifiManager() { return getWifiManager(context); }
    @TargetApi(1) public WindowManager getWindowManager() { return getWindowManager(context); }
    @TargetApi(3) public InputMethodManager getInputMethodManager() { return getInputMethodManager(context); }
    @TargetApi(4) public AccessibilityManager getAccessibilityManager() { return getAccessibilityManager(context); }
    @TargetApi(5) public AccountManager getAccountManager() { return getAccountManager(context); }
    @TargetApi(8) public DevicePolicyManager getDevicePolicyManager() { return getDevicePolicyManager(context); }
    @TargetApi(8) public DropBoxManager getDropBoxManager() { return getDropBoxManager(context); }
    @TargetApi(8) public UiModeManager getUiModeManager() { return getUiModeManager(context); }
    @TargetApi(9) public DownloadManager getDownloadManager() { return getDownloadManager(context); }
    @TargetApi(9) public StorageManager getStorageManager() { return getStorageManager(context); }
    @TargetApi(10) public NfcManager getNfcManager() { return getNfcManager(context); }
    @TargetApi(12) public UsbManager getUsbManager() { return getUsbManager(context); }
    @TargetApi(14) public TextServicesManager getTextServicesManager() { return getTextServicesManager(context); }
    @TargetApi(14) public WifiP2pManager getWifiP2pManager() { return getWifiP2pManager(context); }
    @TargetApi(16) public InputManager getInputManager() { return getInputManager(context); }
    @TargetApi(16) public MediaRouter getMediaRouter() { return getMediaRouter(context); }
    @TargetApi(16) public NsdManager getNsdManager() { return getNsdManager(context); }
    @TargetApi(17) public DisplayManager getDisplayManager() { return getDisplayManager(context); }
    @TargetApi(17) public UserManager getUserManager() { return getUserManager(context); }
    @TargetApi(18) public BluetoothManager getBluetoothManager() { return getBluetoothManager(context); }
    @TargetApi(19) public AppOpsManager getAppOpsManager() { return getAppOpsManager(context); }
    @TargetApi(19) public CaptioningManager getCaptioningManager() { return getCaptioningManager(context); }
    @TargetApi(19) public ConsumerIrManager getConsumerIrManager() { return getConsumerIrManager(context); }
    @TargetApi(19) public PrintManager getPrintManager() { return getPrintManager(context); }
    @TargetApi(21) public AppWidgetManager getAppWidgetManager() { return getAppWidgetManager(context); }
    @TargetApi(21) public BatteryManager getBatteryManager() { return getBatteryManager(context); }
    @TargetApi(21) public CameraManager getCameraManager() { return getCameraManager(context); }
    @TargetApi(21) public JobScheduler getJobScheduler() { return getJobScheduler(context); }
    @TargetApi(21) public LauncherApps getLauncherApps() { return getLauncherApps(context); }
    @TargetApi(21) public MediaProjectionManager getMediaProjectionManager() { return getMediaProjectionManager(context); }
    @TargetApi(21) public MediaSessionManager getMediaSessionManager() { return getMediaSessionManager(context); }
    @TargetApi(21) public RestrictionsManager getRestrictionsManager() { return getRestrictionsManager(context); }
    @TargetApi(21) public TelecomManager getTelecomManager() { return getTelecomManager(context); }
    @TargetApi(21) public TvInputManager getTvInputManager() { return getTvInputManager(context); }
    @TargetApi(22) public SubscriptionManager getSubscriptionManager() { return getSubscriptionManager(context); }
    @TargetApi(22) public UsageStatsManager getUsageStatsManager() { return getUsageStatsManager(context); }
    @TargetApi(23) public CarrierConfigManager getCarrierConfigManager() { return getCarrierConfigManager(context); }
    @TargetApi(23) public FingerprintManager getFingerprintManager() { return getFingerprintManager(context); }
    @TargetApi(23) public MidiManager getMidiManager() { return getMidiManager(context); }
    @TargetApi(23) public NetworkStatsManager getNetworkStatsManager() { return getNetworkStatsManager(context); }

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object object) {
        return (T) object;
    }

    @TargetApi(1) public static ActivityManager getActivityManager(Context context) { return cast(context.getSystemService(Context.ACTIVITY_SERVICE)); }
    @TargetApi(1) public static AlarmManager getAlarmManager(Context context) { return cast(context.getSystemService(Context.ALARM_SERVICE)); }
    @TargetApi(1) public static AudioManager getAudioManager(Context context) { return cast(context.getSystemService(Context.AUDIO_SERVICE)); }
    @TargetApi(1) public static ClipboardManager getClipboardManager(Context context) { return cast(context.getSystemService(Context.CLIPBOARD_SERVICE)); }
    @TargetApi(1) public static ConnectivityManager getConnectivityManager(Context context) { return cast(context.getSystemService(Context.CONNECTIVITY_SERVICE)); }
    @TargetApi(1) public static KeyguardManager getKeyguardManager(Context context) { return cast(context.getSystemService(Context.KEYGUARD_SERVICE)); }
    @TargetApi(1) public static LayoutInflater getLayoutInflater(Context context) { return cast(context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)); }
    @TargetApi(1) public static LocationManager getLocationManager(Context context) { return cast(context.getSystemService(Context.LOCATION_SERVICE)); }
    @TargetApi(1) public static NotificationManager getNotificationManager(Context context) { return cast(context.getSystemService(Context.NOTIFICATION_SERVICE)); }
    @TargetApi(1) public static PowerManager getPowerManager(Context context) { return cast(context.getSystemService(Context.POWER_SERVICE)); }
    @TargetApi(1) public static SearchManager getSearchManager(Context context) { return cast(context.getSystemService(Context.SEARCH_SERVICE)); }
    @TargetApi(1) public static SensorManager getSensorManager(Context context) { return cast(context.getSystemService(Context.SENSOR_SERVICE)); }
    @TargetApi(1) public static TelephonyManager getTelephonyManager(Context context) { return cast(context.getSystemService(Context.TELEPHONY_SERVICE)); }
    @TargetApi(1) public static Vibrator getVibrator(Context context) { return cast(context.getSystemService(Context.VIBRATOR_SERVICE)); }
    @TargetApi(1) public static WallpaperService getWallpaperService(Context context) { return cast(context.getSystemService(Context.WALLPAPER_SERVICE)); }
    @TargetApi(1) public static WifiManager getWifiManager(Context context) { return cast(context.getSystemService(Context.WIFI_SERVICE)); }
    @TargetApi(1) public static WindowManager getWindowManager(Context context) { return cast(context.getSystemService(Context.WINDOW_SERVICE)); }
    @TargetApi(3) public static InputMethodManager getInputMethodManager(Context context) { return cast(context.getSystemService(Context.INPUT_METHOD_SERVICE)); }
    @TargetApi(4) public static AccessibilityManager getAccessibilityManager(Context context) { return cast(context.getSystemService(Context.ACCESSIBILITY_SERVICE)); }
    @TargetApi(5) public static AccountManager getAccountManager(Context context) { return cast(context.getSystemService(Context.ACCOUNT_SERVICE)); }
    @TargetApi(8) public static DevicePolicyManager getDevicePolicyManager(Context context) { return cast(context.getSystemService(Context.DEVICE_POLICY_SERVICE)); }
    @TargetApi(8) public static DropBoxManager getDropBoxManager(Context context) { return cast(context.getSystemService(Context.DROPBOX_SERVICE)); }
    @TargetApi(8) public static UiModeManager getUiModeManager(Context context) { return cast(context.getSystemService(Context.UI_MODE_SERVICE)); }
    @TargetApi(9) public static DownloadManager getDownloadManager(Context context) { return cast(context.getSystemService(Context.DOWNLOAD_SERVICE)); }
    @TargetApi(9) public static StorageManager getStorageManager(Context context) { return cast(context.getSystemService(Context.STORAGE_SERVICE)); }
    @TargetApi(10) public static NfcManager getNfcManager(Context context) { return cast(context.getSystemService(Context.NFC_SERVICE)); }
    @TargetApi(12) public static UsbManager getUsbManager(Context context) { return cast(context.getSystemService(Context.USB_SERVICE)); }
    @TargetApi(14) public static TextServicesManager getTextServicesManager(Context context) { return cast(context.getSystemService(Context.TEXT_SERVICES_MANAGER_SERVICE)); }
    @TargetApi(14) public static WifiP2pManager getWifiP2pManager(Context context) { return cast(context.getSystemService(Context.WIFI_P2P_SERVICE)); }
    @TargetApi(16) public static InputManager getInputManager(Context context) { return cast(context.getSystemService(Context.INPUT_SERVICE)); }
    @TargetApi(16) public static MediaRouter getMediaRouter(Context context) { return cast(context.getSystemService(Context.MEDIA_ROUTER_SERVICE)); }
    @TargetApi(16) public static NsdManager getNsdManager(Context context) { return cast(context.getSystemService(Context.NSD_SERVICE)); }
    @TargetApi(17) public static DisplayManager getDisplayManager(Context context) { return cast(context.getSystemService(Context.DISPLAY_SERVICE)); }
    @TargetApi(17) public static UserManager getUserManager(Context context) { return cast(context.getSystemService(Context.USER_SERVICE)); }
    @TargetApi(18) public static BluetoothManager getBluetoothManager(Context context) { return cast(context.getSystemService(Context.BLUETOOTH_SERVICE)); }
    @TargetApi(19) public static AppOpsManager getAppOpsManager(Context context) { return cast(context.getSystemService(Context.APP_OPS_SERVICE)); }
    @TargetApi(19) public static CaptioningManager getCaptioningManager(Context context) { return cast(context.getSystemService(Context.CAPTIONING_SERVICE)); }
    @TargetApi(19) public static ConsumerIrManager getConsumerIrManager(Context context) { return cast(context.getSystemService(Context.CONSUMER_IR_SERVICE)); }
    @TargetApi(19) public static PrintManager getPrintManager(Context context) { return cast(context.getSystemService(Context.PRINT_SERVICE)); }
    @TargetApi(21) public static AppWidgetManager getAppWidgetManager(Context context) { return cast(context.getSystemService(Context.APPWIDGET_SERVICE)); }
    @TargetApi(21) public static BatteryManager getBatteryManager(Context context) { return cast(context.getSystemService(Context.BATTERY_SERVICE)); }
    @TargetApi(21) public static CameraManager getCameraManager(Context context) { return cast(context.getSystemService(Context.CAMERA_SERVICE)); }
    @TargetApi(21) public static JobScheduler getJobScheduler(Context context) { return cast(context.getSystemService(Context.JOB_SCHEDULER_SERVICE)); }
    @TargetApi(21) public static LauncherApps getLauncherApps(Context context) { return cast(context.getSystemService(Context.LAUNCHER_APPS_SERVICE)); }
    @TargetApi(21) public static MediaProjectionManager getMediaProjectionManager(Context context) { return cast(context.getSystemService(Context.MEDIA_PROJECTION_SERVICE)); }
    @TargetApi(21) public static MediaSessionManager getMediaSessionManager(Context context) { return cast(context.getSystemService(Context.MEDIA_SESSION_SERVICE)); }
    @TargetApi(21) public static RestrictionsManager getRestrictionsManager(Context context) { return cast(context.getSystemService(Context.RESTRICTIONS_SERVICE)); }
    @TargetApi(21) public static TelecomManager getTelecomManager(Context context) { return cast(context.getSystemService(Context.TELECOM_SERVICE)); }
    @TargetApi(21) public static TvInputManager getTvInputManager(Context context) { return cast(context.getSystemService(Context.TV_INPUT_SERVICE)); }
    @TargetApi(22) public static SubscriptionManager getSubscriptionManager(Context context) { return cast(context.getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE)); }
    @TargetApi(22) public static UsageStatsManager getUsageStatsManager(Context context) { return cast(context.getSystemService(Context.USAGE_STATS_SERVICE)); }
    @TargetApi(23) public static CarrierConfigManager getCarrierConfigManager(Context context) { return cast(context.getSystemService(Context.CARRIER_CONFIG_SERVICE)); }
    @TargetApi(23) public static FingerprintManager getFingerprintManager(Context context) { return cast(context.getSystemService(Context.FINGERPRINT_SERVICE)); }
    @TargetApi(23) public static MidiManager getMidiManager(Context context) { return cast(context.getSystemService(Context.MIDI_SERVICE)); }
    @TargetApi(23) public static NetworkStatsManager getNetworkStatsManager(Context context) { return cast(context.getSystemService(Context.NETWORK_STATS_SERVICE)); }

    /*
    @TargetApi(23) public static ActivityManager getActivityManager(Context context) { return context.getSystemService(ActivityManager.class); }
    @TargetApi(23) public static AlarmManager getAlarmManager(Context context) { return context.getSystemService(AlarmManager.class); }
    @TargetApi(23) public static AudioManager getAudioManager(Context context) { return context.getSystemService(AudioManager.class); }
    @TargetApi(23) public static ClipboardManager getClipboardManager(Context context) { return context.getSystemService(ClipboardManager.class); }
    @TargetApi(23) public static ConnectivityManager getConnectivityManager(Context context) { return context.getSystemService(ConnectivityManager.class); }
    @TargetApi(23) public static KeyguardManager getKeyguardManager(Context context) { return context.getSystemService(KeyguardManager.class); }
    @TargetApi(23) public static LayoutInflater getLayoutInflater(Context context) { return context.getSystemService(LayoutInflater.class); }
    @TargetApi(23) public static LocationManager getLocationManager(Context context) { return context.getSystemService(LocationManager.class); }
    @TargetApi(23) public static NotificationManager getNotificationManager(Context context) { return context.getSystemService(NotificationManager.class); }
    @TargetApi(23) public static PowerManager getPowerManager(Context context) { return context.getSystemService(PowerManager.class); }
    @TargetApi(23) public static SearchManager getSearchManager(Context context) { return context.getSystemService(SearchManager.class); }
    @TargetApi(23) public static SensorManager getSensorManager(Context context) { return context.getSystemService(SensorManager.class); }
    @TargetApi(23) public static TelephonyManager getTelephonyManager(Context context) { return context.getSystemService(TelephonyManager.class); }
    @TargetApi(23) public static Vibrator getVibrator(Context context) { return context.getSystemService(Vibrator.class); }
    @TargetApi(23) public static WallpaperService getWallpaperService(Context context) { return context.getSystemService(WallpaperService.class); }
    @TargetApi(23) public static WifiManager getWifiManager(Context context) { return context.getSystemService(WifiManager.class); }
    @TargetApi(23) public static WindowManager getWindowManager(Context context) { return context.getSystemService(WindowManager.class); }
    @TargetApi(23) public static InputMethodManager getInputMethodManager(Context context) { return context.getSystemService(InputMethodManager.class); }
    @TargetApi(23) public static AccessibilityManager getAccessibilityManager(Context context) { return context.getSystemService(AccessibilityManager.class); }
    @TargetApi(23) public static AccountManager getAccountManager(Context context) { return context.getSystemService(AccountManager.class); }
    @TargetApi(23) public static DevicePolicyManager getDevicePolicyManager(Context context) { return context.getSystemService(DevicePolicyManager.class); }
    @TargetApi(23) public static DropBoxManager getDropBoxManager(Context context) { return context.getSystemService(DropBoxManager.class); }
    @TargetApi(23) public static UiModeManager getUiModeManager(Context context) { return context.getSystemService(UiModeManager.class); }
    @TargetApi(23) public static DownloadManager getDownloadManager(Context context) { return context.getSystemService(DownloadManager.class); }
    @TargetApi(23) public static StorageManager getStorageManager(Context context) { return context.getSystemService(StorageManager.class); }
    @TargetApi(23) public static NfcManager getNfcManager(Context context) { return context.getSystemService(NfcManager.class); }
    @TargetApi(23) public static UsbManager getUsbManager(Context context) { return context.getSystemService(UsbManager.class); }
    @TargetApi(23) public static TextServicesManager getTextServicesManager(Context context) { return context.getSystemService(TextServicesManager.class); }
    @TargetApi(23) public static WifiP2pManager getWifiP2pManager(Context context) { return context.getSystemService(WifiP2pManager.class); }
    @TargetApi(23) public static InputManager getInputManager(Context context) { return context.getSystemService(InputManager.class); }
    @TargetApi(23) public static MediaRouter getMediaRouter(Context context) { return context.getSystemService(MediaRouter.class); }
    @TargetApi(23) public static NsdManager getNsdManager(Context context) { return context.getSystemService(NsdManager.class); }
    @TargetApi(23) public static DisplayManager getDisplayManager(Context context) { return context.getSystemService(DisplayManager.class); }
    @TargetApi(23) public static UserManager getUserManager(Context context) { return context.getSystemService(UserManager.class); }
    @TargetApi(23) public static BluetoothManager getBluetoothManager(Context context) { return context.getSystemService(BluetoothManager.class); }
    @TargetApi(23) public static AppOpsManager getAppOpsManager(Context context) { return context.getSystemService(AppOpsManager.class); }
    @TargetApi(23) public static CaptioningManager getCaptioningManager(Context context) { return context.getSystemService(CaptioningManager.class); }
    @TargetApi(23) public static ConsumerIrManager getConsumerIrManager(Context context) { return context.getSystemService(ConsumerIrManager.class); }
    @TargetApi(23) public static PrintManager getPrintManager(Context context) { return context.getSystemService(PrintManager.class); }
    @TargetApi(23) public static AppWidgetManager getAppWidgetManager(Context context) { return context.getSystemService(AppWidgetManager.class); }
    @TargetApi(23) public static BatteryManager getBatteryManager(Context context) { return context.getSystemService(BatteryManager.class); }
    @TargetApi(23) public static CameraManager getCameraManager(Context context) { return context.getSystemService(CameraManager.class); }
    @TargetApi(23) public static JobScheduler getJobScheduler(Context context) { return context.getSystemService(JobScheduler.class); }
    @TargetApi(23) public static LauncherApps getLauncherApps(Context context) { return context.getSystemService(LauncherApps.class); }
    @TargetApi(23) public static MediaProjectionManager getMediaProjectionManager(Context context) { return context.getSystemService(MediaProjectionManager.class); }
    @TargetApi(23) public static MediaSessionManager getMediaSessionManager(Context context) { return context.getSystemService(MediaSessionManager.class); }
    @TargetApi(23) public static RestrictionsManager getRestrictionsManager(Context context) { return context.getSystemService(RestrictionsManager.class); }
    @TargetApi(23) public static TelecomManager getTelecomManager(Context context) { return context.getSystemService(TelecomManager.class); }
    @TargetApi(23) public static TvInputManager getTvInputManager(Context context) { return context.getSystemService(TvInputManager.class); }
    @TargetApi(23) public static SubscriptionManager getSubscriptionManager(Context context) { return context.getSystemService(SubscriptionManager.class); }
    @TargetApi(23) public static UsageStatsManager getUsageStatsManager(Context context) { return context.getSystemService(UsageStatsManager.class); }
    @TargetApi(23) public static CarrierConfigManager getCarrierConfigManager(Context context) { return context.getSystemService(CarrierConfigManager.class); }
    @TargetApi(23) public static FingerprintManager getFingerprintManager(Context context) { return context.getSystemService(FingerprintManager.class); }
    @TargetApi(23) public static MidiManager getMidiManager(Context context) { return context.getSystemService(MidiManager.class); }
    @TargetApi(23) public static NetworkStatsManager getNetworkStatsManager(Context context) { return context.getSystemService(NetworkStatsManager.class); }
    */

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
