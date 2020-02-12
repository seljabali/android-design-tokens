# Android Design Value System

Android app that visualizes common design values for both designers & developers.

<img src="https://github.com/seljabali/android-design-value-system/raw/master/screenshots/home.png" alt="" data-canonical-src="" width="400" height="600" />

### Rationale
- **Standardization**: The absolute worst thing one could do is hard code values across their codebase, as it allows for inconsisent experience across the app.
```xml
<GridView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:paddingTop="5dp"
```
- **Flexibility**: You're now referencing from set spacing values. Imagine phones became a lot taller than phones today. Your design team now wants more vertical spacing across the board. This design value system accomodates for such by separating vertical & horizontal paddings allowing that ask be done easily.

- **Collaboration**: Many times design will find mockup mismatches with actual result. It can be extremely difficult finding where the delta in pixels came from. This app clearly displays actual pixel values used, revealing how they differ from phone to phone, thereby aligning expectations.

- **Simplicity**: The less the design value system has values, the easier it is to work with. That's why it's defaulted in using exponential growth in values for spacings. Nathan Curtis does a great job explaining this in this [article](https://medium.com/eightshapes-llc/space-in-design-systems-188bcbae0d62). That said, it's entirely up to you to change the values used here.

# Design Values
### Vertical Spacings
<img src="https://github.com/seljabali/android-design-value-system/raw/master/screenshots/vertical_spacings.png" alt="" data-canonical-src="" width="400" height="400" />

### Horizontal Spacings
<img src="https://github.com/seljabali/android-design-value-system/raw/master/screenshots/horizontal.png" alt="" data-canonical-src="" width="400" height="400" />

### Padding
<img src="https://github.com/seljabali/android-design-value-system/raw/master/screenshots/paddings.png" alt="" data-canonical-src="" width="400" height="400" />

### Text Sizes/Appearances
- Show cases Android Material text appearances.
- Show cases AppCompat text appearances.
<img src="https://github.com/seljabali/android-design-value-system/raw/master/screenshots/text_appearances.png" alt="" data-canonical-src="" width="400" height="400" />

### Corner Radiuses
<img src="https://github.com/seljabali/android-design-value-system/raw/master/screenshots/corner_radiuses.png" alt="" data-canonical-src="" width="400" height="400" />

### Letter Spacings
<img src="https://github.com/seljabali/android-design-value-system/raw/master/screenshots/letter_spacings.png" alt="" data-canonical-src="" width="400" height="400" />

## LICENSE
This is absolutely FREE. Feel free to include and in our own app without credit. If you liked this app however, do give the repo a star please!
