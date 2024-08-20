# react-native-installed-app-checker

`react-native-installed-app-checker` is a React Native module that allows you to check if a specific application is installed on the device. This module supports Android platform.

## Installation

Use the package manager [npm](https://www.npmjs.com/package/react-native-installed-app-checker) to install react-native-installed-app-checker.

```bash
npm install react-native-installed-app-checker@1.0.3
```
## Android Specific Setup

Permissions
In order to check if an app is installed, you'll need to request the QUERY_ALL_PACKAGES permission. Add the following permission to your AndroidManifest.xml:

```bash
<uses-permission android:name="android.permission.QUERY_ALL_PACKAGES" />
```
This permission allows the app to query the list of all installed apps on the device. Note that using this permission requires justification, and you should check the Google Play policies if you plan to distribute your app through the Play Store.

Android 11 and Above
Starting with Android 11 (API level 30), Google has introduced additional restrictions for accessing installed apps. To handle this properly, you may need to provide a rationale for why your app requires the QUERY_ALL_PACKAGES permission. For more information, see the [Google Play policies](https://play.google/developer-content-policy/).
## Usage

```javascript
import React from 'react';
import { View, Button, Alert } from 'react-native';
import RNInstalledAppChecker from 'react-native-installed-app-checker';

const App = () => {
  const checkAppInstalled = (packageName) => {
    RNInstalledAppChecker.isAppInstalled(packageName, (isInstalled) => {
      if (isInstalled) {
        Alert.alert('App Installed', `${packageName} is installed.`);
      } else {
        Alert.alert('App Not Found', `${packageName} is not installed.`);
      }
    });
  };

  return (
    <View style={{ padding: 20 }}>
      <Button title="Check App Installation" onPress={() => checkAppInstalled('com.example.otherapp')} />
    </View>
  );
};

export default App;


```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)

## Contact

For any inquiries or further assistance, please reach out to the author:

- **Author:** Harun Selçuk Çetin  
- **Instagram:** [https://instagram.com/selcukctn](https://instagram.com/selcukctn)  
- **GitHub:** [https://github.com/selcukctn](https://github.com/selcukctn)
- **Linkedin:** [https://www.linkedin.com/in/harun-selcuk-cetin-375b03a0/](https://www.linkedin.com/in/harun-selcuk-cetin-375b03a0/)