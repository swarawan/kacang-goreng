Simple library for managing font of TextView, Button, and EditText

## How to use
### Add font on assets folder
Here is my hierarchy of my asset folder
```
- app
    - java
    - assets
        - font
            - lato
                - Lato-Bold.ttf
                - Lato-Italic.ttf
                - Lato-Regular.ttf
            - notosans
                - NotoSans-Bold.ttf
                - NotoSans-Italic.ttf
                - NotoSans-Regular.ttf
            - roboto
                - Roboto-Bold.ttf
                - Roboto-Italic.ttf
                - Roboto-Regular.ttf
            - zeyada
                - Zeyada.ttf
    - res
```

### String value
Add strings to store font path from assets
```xml
<resources>
    <string name="app_name" translatable="false">Kacang Goreng</string>

    <!-- Font path. -->
    <string name="roboto_bold" translatable="false">font/roboto/Roboto-Bold.ttf</string>
    <string name="roboto_italic" translatable="false">font/roboto/Roboto-Italic.ttf</string>
    <string name="roboto_regular" translatable="false">font/roboto/Roboto-Regular.ttf</string>

    <string name="lato_bold" translatable="false">font/lato/Lato-Bold.ttf</string>
    <string name="lato_italic" translatable="false">font/lato/Lato-Italic.ttf</string>
    <string name="lato_regular" translatable="false">font/lato/Lato-Regular.ttf</string>

    <string name="notosans_bold" translatable="false">font/notosans/NotoSans-Bold.ttf</string>
    <string name="notosans_italic" translatable="false">font/notosans/NotoSans-Italic.ttf</string>
    <string name="notosans_regular" translatable="false">font/notosans/NotoSans-Regular.ttf</string>

    <string name="zeyada" translatable="false">font/zeyada/Zeyada.ttf</string>
</resources>

```

### Let's use
```xml
    <com.swarawan.lib.TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Sample Noto Sans"
        app:path="@string/zeyada" />
```