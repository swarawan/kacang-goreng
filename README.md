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

### Let's use
```xml
    <com.swarawan.lib.TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Sample Noto Sans"
        app:path="@string/zeyada" />
```