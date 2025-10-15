# -MAD204-LAB02-Jennyfer
A simple two-activity Android app built in Kotlin. Users log in with their email and password, and the app displays a personalized “Welcome, [Name]!” message on the next screen with a logout option.
Information
Name: Jennyfer Parmar
Student ID: A00201240
Course Code: MAD204
Lab Number: 2
Date Submitted: 2025-10-14
Project Overview

This Android application demonstrates a simple login and greeting system using two activities.
The user enters their email and password on the first screen.
When they tap the Login button, their username (derived from the email) is sent to the second screen, which displays a personalized message “Welcome, [Name]!”
A Logout button on the second screen returns the user to the login screen.
Features

Two activities:
MainActivity: handles user login.
SecondActivity: displays greeting and logout.
Uses Intents to pass data between activities.
ConstraintLayout for responsive UI.

How It Works
User enters email and password.
When Login is pressed, the app extracts the portion before @ from the email (e.g., alex@gmail.com → “alex”).
That name is sent to SecondActivity using Intent.putExtra("USERNAME", name).
The second screen displays “Welcome, alex!”
Pressing Logout returns the user to the login screen.

Technologies Used
Kotlin
Android Studio Giraffe / Hedgehog or newer
AndroidX / ConstraintLayout
SDK Level ≥ 24

How to Run
Open the project in Android Studio.
Click Build → Rebuild Project to ensure dependencies load.
Run on an emulator or connected device (API 24+).
Enter an email & password → press Login.
Observe the greeting → press Logout to return.

Expected Output

Login Screen: shows app logo, email & password fields, Login button.
Greeting Screen: shows “Welcome, [Name]!” and a Logout button.
Smooth transition between activities.
