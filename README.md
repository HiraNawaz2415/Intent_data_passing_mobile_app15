# 🔄 Intent Data Passing App

This Android app demonstrates how to **pass data from one activity to another** using **Intents** in Java. It takes a user's name in the first screen and displays a personalized message on the second screen.

---

## What is an Intent?

In Android, an **Intent** is a messaging object used to **request an action from another component** of the app (like starting another activity, service, or sending data). Intents allow communication between different parts of your app and even between apps.

There are two types of Intents:
- **Explicit Intent**: Directs to a specific component (like launching `SecondActivity`)
- **Implicit Intent**: Requests an action without specifying the component (like opening a browser)

In this app, we use an **Explicit Intent** to send data from `MainActivity` to `SecondActivity`.

---

## Features

- Enter your name on the first screen.
- Send the input to the second activity.
- Display a greeting message using the passed data.

---


