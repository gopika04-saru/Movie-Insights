# 🎬 Movie API Backend

A Spring Boot application that provides RESTful APIs for managing movies and user reviews. The backend connects to a MongoDB Atlas database and is integrated with a React-based frontend.

---

## 📦 Features

- 📽️ Fetch all movies and single movie details
- ✍️ Post reviews for movies
- 🧩 CORS enabled for frontend communication
- 🌱 Uses MongoDB Atlas for data persistence

---

## 🚀 Tech Stack

- **Backend:** Java 21, Spring Boot
- **Database:** MongoDB Atlas
- **Frontend:** React (assumed on `http://localhost:3000`)
- **Other Libraries:** spring-dotenv, dotenv-java

---

## 🔐 Environment Setup

Configure your `.env` file with the following:

```env
MONGO_USER=yourMongoUser
MONGO_PASSWORD=yourMongoPassword
MONGO_CLUSTER=yourClusterUrl
MONGO_DATABASE=movie-api-db
```
---

## 📦 Dependencies for pom.xml (Spring Boot Backend)

```xml
<dependencies>
    <!-- Spring Boot Web Starter -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot MongoDB Starter -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-mongodb</artifactId>
    </dependency>

    <!-- Spring Boot DevTools -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Spring Boot Starter Test -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>

    <!-- dotenv-java for loading .env files -->
    <dependency>
        <groupId>io.github.cdimascio</groupId>
        <artifactId>dotenv-java</artifactId>
        <version>3.0.0</version>
    </dependency>
</dependencies>
```


---

## 🌐 API Endpoints

### 🎥 Movie Endpoints

| Method | Endpoint                  | Description                    |
|--------|---------------------------|--------------------------------|
| GET    | `/api/v1/movies`          | Get all movies                 |
| GET    | `/api/v1/movies/{imdbId}` | Get a single movie by IMDb ID |

### 📝 Review Endpoints

| Method | Endpoint         | Description             |
|--------|------------------|-------------------------|
| POST   | `/api/v1/reviews`| Create a new review     |

**Payload (for review):**
```json
{
  "reviewBody": "Amazing cinematography!",
  "imdbId": "tt0111161"
}

```

---

## 🔧 Backend Configuration (`application.properties`)

```properties
spring.application.name=Movie
spring.data.mongodb.uri=mongodb+srv://${MONGO_USER}:${MONGO_PASSWORD}@${MONGO_CLUSTER}/${MONGO_DATABASE}?retryWrites=true&w=majority&appName=Cluster0
dotenv.enabled=true
logging.level.org.springframework.data.mongodb.core.MongoTemplate=DEBUG
server.port=8080
```

---
## .env
```
MONGO_USER=your_username
MONGO_PASSWORD=your_password
MONGO_CLUSTER=your_cluster_url
MONGO_DATABASE=movie-api-db
```
___

# Movie App - Frontend

This is the frontend of a Movie web application built using React. It interacts with a backend API to display a list of movies, trailers, and reviews.

---
## Features

- **Movie Carousel**: Displays a carousel of movies.
- **Movie Details**: View movie details including trailers and reviews.
- **Watchlist**: Manage and view a personalized watchlist.
- **404 Page**: Custom page for invalid routes.

---
## Installation

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:   
    ```bash
    cd movie-app-frontend
    ```
3. Install dependencies:   
    ```bash
    npm install
    ```
4. Start the app: 
    ```bash
    npm start
    ```
**.** The app will run on http://localhost:3000.

___

## Technologies Used

- **React**: A JavaScript library for building user interfaces.
- **React Router**: A library for handling routing and navigation in React applications.
- **Axios**: A promise-based HTTP client for making API requests.
- **React-Bootstrap**: A library that provides Bootstrap components as React components for styling.
- **FontAwesome**: A popular icon set used for adding icons to the app.
- **Material UI Carousel**: A carousel component from Material UI for displaying movies in a sliding carousel.

---

## Project Structure
```bash
src/
├── api/             # Axios API configuration
├── components/      # UI components (Header, Hero, NotFound, etc.)
├── App.js           # Main app component
├── index.js         # App entry point
└── App.css          # Custom styles
```
---

## API Integration

The frontend interacts with the following API endpoints:

- `GET /api/v1/movies`: Fetch all movies.
- `GET /api/v1/movies/{imdbId}`: Fetch a single movie's details by IMDb ID.
- `POST /api/v1/reviews`: Submit a new review for a movie.

Ensure the backend API is running and integrated with this frontend.

---
## 📸 Output Screenshots

### 🏠 Homepage
![Homepage](ScreenShots/HomePage.bmp)

### 🎬 Trailer Video Page
![Movie Detail Page](ScreenShots/TrailerVideo.bmp)

### 📝 Review Submission Page
![Review Submission](ScreenShots/review-submission.bmp)

---
## Contact

- **Email**: [kotakalagopika@gmail.com]
- **GitHub**: [https://github.com/gopika04-saru]

---





