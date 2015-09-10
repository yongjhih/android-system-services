# SystemServices

Easy to retrieve system service.

## Usage

Before:

```java
NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
```

After:

```java
NotificationManager notificationManager = SystemServices.from(context).getNotificationManager();
```

## Installation

```gradle
depedencies {
    // compile 'com.github.yongjhih:android-system-services:1'
    // compile 'com.github.yongjhih:android-system-services:3'
    // compile 'com.github.yongjhih:android-system-services:4'
    // compile 'com.github.yongjhih:android-system-services:5'
    // compile 'com.github.yongjhih:android-system-services:8'
    // compile 'com.github.yongjhih:android-system-services:9'
    // compile 'com.github.yongjhih:android-system-services:10'
    // compile 'com.github.yongjhih:android-system-services:12'
    // compile 'com.github.yongjhih:android-system-services:14'
    // compile 'com.github.yongjhih:android-system-services:16'
    // compile 'com.github.yongjhih:android-system-services:17'
    // compile 'com.github.yongjhih:android-system-services:18'
    // compile 'com.github.yongjhih:android-system-services:19'
    compile 'com.github.yongjhih:android-system-services:21'
    // compile 'com.github.yongjhih:android-system-services:22'
    // compile 'com.github.yongjhih:android-system-services:23'
}
```

## TODO

* Support various sdk version


## LICENSE

```
Copyright 2015 8tory, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
