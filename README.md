# 📐 Area Calculator – Android App

A simple Android application that calculates the area of **Square, Rectangle, and Circle** using separate activities.  
The app demonstrates **multi-activity navigation**, **Intent-based data passing**, and **basic UI interactions** with Toast messages.

---

## 🚀 Features

- Calculate area of:
  - Square
  - Rectangle
  - Circle
- Separate activity for each shape
- Result displayed in a dedicated Result screen
- Data transfer using Android `Intent` extras
- Toast messages for user feedback
- Clean and minimal UI

---

## 🧱 Tech Stack

- **Language:** Java  
- **UI:** XML  
- **Platform:** Android  
- **IDE:** Android Studio  
- **Minimum SDK:** As configured in the project

---

## 🗂️ Project Structure

app/
├── src/main/java/com/example/square/
│ ├── MainActivity.java
│ ├── SquareActivity.java
│ ├── RectangleActivity.java
│ ├── CircleActivity.java
│ └── ResultActivity.java
│
└── src/main/res/layout/
├── activity_main.xml
├── android_square.xml
├── android_rectangle.xml
├── android_circle.xml
└── android_result.xml


---

## ▶️ How It Works

1. The app starts on the **Home screen** with shape options.
2. Selecting a shape opens its corresponding activity.
3. User enters required values.
4. On calculation:
   - Area is computed.
   - Data is passed to `ResultActivity` using `Intent`.
5. Result is displayed on a separate screen.

---

## 🧪 Example Calculations

| Shape      | Input                     | Output |
|------------|---------------------------|--------|
| Square     | Side = 5                  | 25     |
| Rectangle  | Length = 4, Breadth = 6   | 24     |
| Circle     | Radius = 7                | 153.94 |

---

## 📸 Screenshots

> Screenshots are placed inside a `screenshots/` directory.

| Screen | Preview |
|------|--------|
| Home | `screenshots/home.png` |
| Square | `screenshots/square.png` |
| Rectangle | `screenshots/rectangle.png` |
| Circle | `screenshots/circle.png` |
| Result | `screenshots/result.png` |

---

## 🧠 Key Concepts Used

- Android Activities
- Intent & `putExtra()`
- Toast messages
- XML layout design
- Basic input validation

---

## 🛠️ Setup & Run

1. Clone the repository
2. Open the project in **Android Studio**
3. Sync Gradle
4. Run on emulator or physical device

---

## 📌 Notes

- Layout file names must exactly match the names used in `setContentView()`.
- All numeric inputs are validated before calculation.
- Toasts are used for non-blocking user feedback.

---

## 📄 License

This project is for learning and demonstration purposes.
