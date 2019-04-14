[ ![Download](https://api.bintray.com/packages/nikart/maven/FitButton/images/download.svg) ](https://bintray.com/nikart/maven/FitButton/_latestVersion) [![](https://jitpack.io/v/nikartm/FitButton.svg)](https://jitpack.io/#nikartm/FitButton) [![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=17) [![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-FitButton-green.svg?style=flat )]( https://android-arsenal.com/details/1/7620 )

# FitButton
The button which includes features:
* Icon, 
* Text, 
* Divider,
* Corner radius,
* Border of the button,
* Custom ripple effect,
* Custom elements sizes,
* Custom colors of elements,
* Different positions of elements on the button
## Installation
#### Gradle
```
implementation "com.github.nikartm:fit-button:$fb_version"
```

## Screenshots
![FitButton Screenshots](/screenshots/img_gif.gif)

![FitButton Screenshots](/screenshots/img_1.png) ![FitButton Screenshots](/screenshots/img_2.png) ![FitButton Screenshots](/screenshots/img_3.png)
## How to use?
Adjust the XML view: 

[More examples](https://github.com/nikartm/FitButton/tree/master/app/src/main/res/layout)
```
<com.github.nikartm.button.FitButton
    android:id="@+id/fbtn"
    android:layout_width="match_parent"
    android:layout_height="58dp"
    android:layout_margin="32dp"
    android:enabled="true"
    app:fb_cornerRadius="2dp"
    app:fb_shape="rectangle"
    app:fb_divColor="#fff"
    app:fb_divWidth="1dp"
    app:fb_divHeight="40dp"
    app:fb_rippleColor="#FBE9E7"
    app:fb_iconWidth="28dp"
    app:fb_iconHeight="28dp"
    app:fb_iconPosition="left"
    app:fb_iconMarginStart="30dp"
    app:fb_iconMarginEnd="16dp"
    app:fb_icon="@drawable/ic_thumb_up"
    app:fb_iconColor="#FBE9E7"
    app:fb_textPaddingStart="16dp"
    app:fb_textColor="#FFF"
    app:fb_textGravity="start|center"
    app:fb_text="Like Me"
    app:fb_backgroundColor="#FF7043"/>
```
Or programmatically:
```
private fun setupButton() {
    fitButton = findViewById(R.id.fbtn)
    fitButton!!
            .setTextFont(R.font.share_tech_regular)
            .setTextSize(20f)
            .setIconMarginStart(16f)
            .setIconMarginEnd(12f)
            .setTextColor(Color.parseColor("#F5F5F5"))
            .setIconColor(Color.parseColor("#FFE0B2"))
            .setDividerColor(Color.parseColor("#BCAAA4"))
            .setBorderColor(Color.parseColor("#FFF59D"))
            .setButtonColor(Color.parseColor("#FF7043"))
            .setBorderWidth(2f)
            .setRippleEnable(true)
            .setRippleColor(resources.getColor(R.color.colorAccent))
            .setOnClickListener {
                Toast.makeText(this,
                        "Click on ${fitButton?.getText()}",
                        Toast.LENGTH_SHORT).show()
            }
}
```

## Kotlin support
If you got an error
```
Caused by: java.lang.NoClassDefFoundError: Failed resolution of: Lkotlin/jvm/internal/Intrinsics;
```

You may need to add Kotlin support to your project.
```
implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
```
and add to the root build.gradle
```
buildscript {
    ext.kotlin_version = 'X.Y.Z'
    
    ...
}
```

## License
Copyright 2019 Ivan Vodyasov

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
