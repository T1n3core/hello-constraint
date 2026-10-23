
# HelloConstraint – Interactive Android Layout

## About the Project

This project was developed as part of **Mobile Application Development – Assignment 3**. It builds upon the existing HelloConstraint Android application by introducing a new interactive button, updating click event handlers, and improving the layout using `ConstraintLayout`.

The application demonstrates basic Android UI interaction, dynamic button colors, counter management, and responsive layouts for different screen sizes and device orientations.

The project is developed in **Java** using **Android Studio**.

## Features

- **Toast Button:** Displays a short Toast message when clicked.
- **Count Button:** Increases the counter displayed in the `show_count` TextView.
- **Zero Button:** Resets the counter to zero.
- **Dynamic Button Colors:**
  - The Count button changes its background color depending on whether the new counter value is even or odd.
  - The Zero button changes its background color when the Count button is clicked to indicate its active state.
  - The Zero button returns to its default gray background when the counter is reset.
- **ConstraintLayout:** Positions the three buttons vertically to the left of the counter display.
- **Responsive Layouts:** Supports portrait and landscape orientations, as well as larger screens such as tablets.

## Technologies Used

- **Language:** Java
- **IDE:** Android Studio
- **UI Design:** XML
- **Layout:** ConstraintLayout
- **Platform:** Android
- **Components:** Button, TextView, Toast, View, Color

## Application Structure

The application uses XML layout resources and Java event handlers to manage the user interface and application behavior.

Important components include:

- `activity_main.xml` – Defines the main user interface and constraints between the buttons and the counter display.
- `MainActivity.java` – Handles button clicks, updates the counter, and changes button background colors.
- `res/layout-land/` – Contains the layout configuration for landscape orientation.
- `res/layout-xlarge/` – Contains the layout configuration for larger screens, such as tablets, if configured in the project.

## How It Works

1. Launch the application to display the Toast, Zero, and Count buttons alongside the counter.
2. Click **Toast** to display a short message.
3. Click **Count** to increment the counter by one.
4. The Count button changes its background color depending on whether the updated counter value is even or odd.
5. The Zero button changes its background color to indicate that it is active.
6. Click **Zero** to reset the counter to `0`.
7. After resetting, the Zero button returns to its default gray background.

## Layout and Responsiveness

The application uses `ConstraintLayout` to position the buttons relative to the `show_count` TextView.

The three buttons are arranged vertically to the left of the counter display, with their positions constrained between the top and bottom edges of the TextView.

Additional layout resources are provided for:

- Portrait orientation
- Landscape orientation
- Larger screens and tablets

These configurations help maintain a consistent and usable interface across different device sizes.

## Installation and Setup

1. Clone this repository:

   ```bash
   git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
   ```

2. Open **Android Studio**.
3. Select **Open** and choose the cloned project folder.
4. Wait for Gradle to finish syncing.
5. Start an Android emulator or connect an Android device.
6. Click **Run** to build and launch the application.

Replace `YOUR-USERNAME` and `YOUR-REPOSITORY` with your GitHub username and repository name.

## Learning Objectives

This assignment provides practical experience with:

- Designing Android interfaces using `ConstraintLayout`.
- Positioning UI elements using layout constraints.
- Handling button click events with Java.
- Updating a `TextView` dynamically.
- Changing button background colors programmatically.
- Using the `View` parameter in click handler methods.
- Implementing counter increment and reset functionality.
- Creating alternative layouts for different orientations and screen sizes.

## Reference

This assignment is adapted from **Android Developer Fundamentals** learning materials.
