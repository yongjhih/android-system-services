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
    //compile 'com.infstory:android-system-services:4.0.0'
    //compile 'com.infstory:android-system-services:5.0.0'
    // compile 'com.infstory:android-system-services:8.0.0'
    // compile 'com.infstory:android-system-services:10.0.0'
    // compile 'com.infstory:android-system-services:14.0.0'
    // compile 'com.infstory:android-system-services:16.0.0'
    compile 'com.infstory:android-system-services:21.0.0'
    // compile 'com.infstory:android-system-services:22.0.0'
    // compile 'com.infstory:android-system-services:23.0.0'
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
