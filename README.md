# Android Design Tokens

Android app that visualizes design tokens for both designers & developers.

<img src="https://github.com/seljabali/android-design-tokens/raw/master/screenshots/home.png" alt="" data-canonical-src="" width="500" height="800" />

### Rationale
- **Standardization**: The absolute worst thing one could do is hard code values across their codebase, as it allows for inconsisent experience across the app.
```xml
<GridView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:paddingTop="5dp"
```
- **Flexibility**: You're now referencing from set spacing values. Imagine phones became a lot taller than phones today. Your design team now wants more vertical spacing across the board. These tokens accomodate for such by separating vertical & horizontal paddings allowing that ask be done easily.

- **Collaboration**: Many times design will find mockup mismatches with actual result. It can be extremely difficult finding where the delta in pixels came from. This app clearly displays actual pixel values used, revealing how they differ from phone to phone, thereby aligning expectations.

- **Simplicity**: The less the design tokens, the easier it is to work with. That's why it's defaulted in using exponential growth in values for spacings. That said, it's entirely up to you to change the values used here.

# Design Tokens
### Vertical Spacings
<img src="https://github.com/seljabali/android-design-tokens/raw/master/screenshots/vertical_spacings.png" alt="" data-canonical-src="" width="500" height="800" />

### Horizontal Spacings
<img src="https://github.com/seljabali/android-design-value-system/raw/master/screenshots/horizontal.png" alt="" data-canonical-src="" width="500" height="800" />

### Padding
<img src="https://github.com/seljabali/android-design-tokens/raw/master/screenshots/paddings.png" alt="" data-canonical-src="" width="500" height="800" />

### Text Sizes/Appearances
- Show cases Android Material text appearances.
- Show cases AppCompat text appearances.
<img src="https://github.com/seljabali/android-design-tokens/raw/master/screenshots/text_appearances.png" alt="" data-canonical-src="" width="500" height="800" />

### Corner Radiuses
<img src="https://github.com/seljabali/android-design-tokens/raw/master/screenshots/corner_radiuses.png" alt="" data-canonical-src="" width="500" height="800" />

### Letter Spacings
<img src="https://github.com/seljabali/android-design-tokens/raw/master/screenshots/letter_spacings.png" alt="" data-canonical-src="" width="500" height="800" />

### Colors
<img src="https://github.com/seljabali/android-design-tokens/raw/master/screenshots/colors.png" alt="" data-canonical-src="" width="500" height="800" />

### Transparencies
<img src="https://github.com/seljabali/android-design-tokens/raw/master/screenshots/transparencies.png" alt="" data-canonical-src="" width="500" height="800" />

## LICENSE
This is free and unencumbered software released into the public domain.
