
# 🔊 Multi-User Chat System

A lightweight, real-time multi-user chat application built with **Java (Jetty WebSockets)** and a simple **HTML/CSS frontend**. Designed for scalability, concurrency, and clarity — ideal for learning socket programming, WebSocket-based communication, or deploying lightweight real-time apps.

---

## ⚙️ Tech Stack

- **Backend**: Java 17, Jetty WebSocket Server
- **Frontend**: HTML + Vanilla JS
- **Build Tool**: Apache Maven

---

## 📁 Project Structure

```

multi-user-chat/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── harshitha/
│       │           ├── Main.java                  # Launches Jetty server
│       │           ├── ChatWebSocket.java         # WebSocket logic
│       │           └── ChatWebSocketHandler.java  # Session routing
│       └── resources/
│           └── static/
│               └── index.html                     # Frontend chat UI

````

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/multi-user-chat.git
cd multi-user-chat
````

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Server

```bash
mvn exec:java
```

Server runs on: [http://localhost:8080](http://localhost:8080)

---

## 💬 Features

* Real-time messaging with WebSockets
* Supports multiple users simultaneously
* Clean disconnection handling
* Lightweight frontend with minimal dependencies
* Java 17 compatible

---

## 🧪 Example Use Case

1. Run the server
2. Open multiple browser tabs or devices on `localhost:8080`
3. Chat messages broadcast to all connected clients in real time

---

## 📌 Troubleshooting

* ❌ `Source option 7 is no longer supported`
  ✅ Use Java 8+ and set `<maven.compiler.source>` and `<target>` to `17` in `pom.xml`.

* ❌ `No main class defined`
  ✅ Ensure `exec-maven-plugin` points to `com.harshitha.Main`.

* ❌ Port 8080 not working?
  ✅ Run `netstat -ano | findstr :8080` to check if it’s already in use.

---

## 🙌 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

---

## 📄 License

This project is open-source and free to use under the MIT License.

```

