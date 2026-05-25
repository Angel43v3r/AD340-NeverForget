# The "Never Forget" Local Task Tracker
![Android Studio](https://github.com/Angel43v3r/AD340-Assignments-TheSkylineMessenger/blob/master/Android_Studio_icon.png)
## Assignment 13 - The "Never Forget" Local Task Tracker | Android
### AD340 - Mobile Application Development
### North Seattle College (Spring 2026)
### Date: May 24, 2026


## Table Of Contents
1. [Objective](#objective)
2. [How to Use](#how-to-use)
3. [Getting Started](#getting-started)
4. [Assignment Instruction](#assignment-instruction)
5. [Version Control](#version-control-github)
6. [Contributing](#contributing)
7. [License](#license)


## Objective
This will move you past simple variables and into the world of persistent data. Build a native Android application that stores a user’s "To-Do" list in a local SQLite database using the Room Persistence Library.
Your tasks won't vanish into the digital void every time you close the app.
- Define a data schema using **Room Entities**.
- Create a **Data Access Object (DAO)** to manage SQL queries without writing actual SQL (mostly).
- Implement a **RoomDatabase** singleton.
- Connect the database to a UI (using either ViewBinding/RecyclerView or Jetpack Compose).


## How to Use
### Prerequisites
Make sure you have the following installed:
- **Visual Studio Code (VS Code)**
    - You can use any editor, VSC is recommended for this project. You can download from [VS Code official website](https://code.visualstudio.com/).

- **Android Studio**
    - **Android Studio** is required to run the app on an Android emulator or a physical device.
    - It provides the Android SDK, emulator, and build tools needed for React Native development.
    - You can download from the [Android Studio official website](https://developer.android.com/studio).

### Installation & Environment Setup
#### 1. Clone the Repository
In the folder you want to save your project in, run:

```bash
git clone git@github.com:Angel43v3r/AD340-NeverForget.git
```

#### 2. Navigate to the app folder:

```
cd AD340-NeverForget
```

#### 3. Navigate to the folder
```
cd <Folder_Name>
```

#### 4. Now, let’s initialize a modern Android project template.


**STEP 1:** Open Android Studio and select `File` -> `New` -> `New Project`.

**STEP 2:** Choose `Empty Activity` (This is crucial!).

**STEP 3:** Configure the project:

```text
Name: NeverForget

Package name: com.example.neverforget

Minimum SDK: API 24 (Android 7.0) or higher.

Build configuration language: Kotlin DSL (build.gradle.kts).
```

**STEP 4:** Click Finish

- Wait for Gradle to finish "syncing" (this may take a few minutes on the first run).


## Getting Started
### STEP 1: Go to `File` -> `New` -> `New Project` -> Select `Empty Activity`

### STEP 2: Go to `Project` -> `AD340-neverForget` folder -> `app` -> `build.gradle.kts`

### STEP 3: In `app/build.gradle.kts` under **dependencies** add
```kotlin
dependencies {
    val room_version = "2.7.1"
    implementation("androidx.room:room-runtime:$room_version")
    ksp("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
}
```

Also add this under **plugins**
```kotlin
plugins {
    alias(libs.plugins.ksp)
}
```

### STEP 4: In `build.gradle.kts` root level add
```kotlin
plugins {
  id("com.google.devtools.ksp") version "2.2.10-2.0.2" apply false
}
```

*NOTE: Check your kotlin version under gradle/libs.version.toml*

### STEP 5: In `libs.versions.toml` gradle folder add
```toml
[versions]
kotlin = "2.2.10"
ksp= "2.2.10-2.0.2"

[plugins]
ksp = { id = "com.google.devtools.ksp", version.ref = "ksp" }
```

### STEP 6: In `gradle.properties` add
```kotlin
android.useAndroidX=true
android.nonTransitiveRClass=true
android.disallowKotlinSourceSets=false
```
### STEP 7: Go to `File` -> `Sync Project with Gradle Files`

### STEP 8: In `app/src/main/java/com.example.ad340_neverforget` folder,
Create the files needed for the assignment. Follow Assignment Instruction.
- MainActivity.kt
- Note.kt
- NoteDao.kt
- NoteDatabase.kt
- NoteViewModel.kt


## Assignment Instruction

![Never Forget App Image 1](https://github.com/Angel43v3r/AD340-neverForget/blob/master/assets/NeverForget00.png)
![Never Forget App Image 2](https://github.com/Angel43v3r/AD340-neverForget/blob/master/assets/NeverForget01.png)

### Technical Requirements
#### 1. The Data Layer
**Entity:** Create a `Task` class. It must include:

- An auto-generated `id` (Primary Key).
- A `title` (String).
- A `isCompleted` status (Boolean).

**DAO:** Define an interface with methods to:

- `insert(task: Task):` Add a new task.
- `getAllTasks():` Return a `Flow<List<Task>>` or `LiveData<List<Task>>`.
- `delete(task: Task):` Remove a specific task.

**Database:** A class extending `RoomDatabase` that provides the DAO.

#### 2. The UI Layer
**Input Field:** An `EditText` (or `TextField`) and a "Save" button to add tasks.

**The List:** A `RecyclerView` (or `LazyColumn`) that updates automatically when the database changes.


## Version Control (GitHub)
### GitHub Initial Setup
#### 1. Open Android Studio
#### 2. Select `File` -> `Git` -> `Share Project On GitHub`

### To Commit:
Select `File` -> `Git` -> `GitHub` -> Commit

### To Push:
Select `File` -> `Git` -> `GitHub` -> Pull

### To Pull:
Select `File` -> `Git` -> `GitHub` -> Pull


## Contributing
Developed By: **Jovy Ann Nelson**

Instructor: **BC Ko**

Course: **AD340 - Mobile Application Development**

College: **North Seattle College**

Term: **Spring 2026**

Date: **May 18, 2026** to **May 24, 2026**


## License

This project is licensed under the MIT License. Please refer to the [LICENSE](https://github.com/Angel43v3r/AD340-neverForget/blob/master/LICENSE) for more details.
