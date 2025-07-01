# PokeDroid

## Overview
PokeDroid is an Android application developed as a technical test for CODE.id. The app integrates with the [PokeAPI](https://pokeapi.co) to display information about Pokémon, their abilities, types, and other characteristics.

## Technologies Used
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)
- **API Integration**: [PokeAPI](https://pokeapi.co)
- **Dependency Injection**: Koin (planned)
- **Networking**: Retrofit (planned)
- **Asynchronous Programming**: Kotlin Coroutines (planned)
- **Local Database**: SQLite with Room Library (planned)

## Project Structure
The project follows a clean architecture approach with the following components:
- **UI Layer**: Compose UI components and ViewModels
- **Domain Layer**: Use cases and business logic
- **Data Layer**: Repositories, data sources, and models

## Setup Instructions
1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle files
4. Run the app on an emulator or physical device

## Requirements
- Android Studio Hedgehog or later
- Minimum SDK: 24 (Android 7.0)
- Target SDK: 35
- Kotlin 1.9.0 or later

## API Reference
This application uses the [PokeAPI](https://pokeapi.co), a RESTful API providing Pokémon data. The API is free to use and does not require authentication.

## License
This project is created for educational purposes as part of a technical test for CODE.id.

## Contact
For any inquiries about this project, please contact the repository owner.