# 📌 TODO Application (JavaFX + Scene Builder + SQL)

A simple, clean, and modern **JavaFX TODO Application** built with **Scene Builder** and connected to a **MySQL database**. This app helps users manage daily tasks by adding, completing, and deleting completed tasks with smooth UI/UX.

---

## 🚀 Features

* ✔ Attractive & user-friendly JavaFX interface
* ✔ Add new tasks
* ✔ Mark tasks as complete
* ✔ Delete completed tasks
* ✔ SQL database integration
* ✔ Organized MVC-style structure

---

## 🛠️ Tech Stack

* **Java** (JDK 17 or higher)
* **JavaFX**
* **Scene Builder**
* **MySQL / SQL Database**
* **JDBC**

---

## 📂 Project Structure

```
src/
 ├── controller/
 ├── dto/
 ├── model/
 ├── util/
 ├── view/
 └── Main.java
```

---

## 🗃️ Database Schema

### **Table: task**

```
CREATE TABLE task (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    date DATE NOT NULL,
    description TEXT,
    status VARCHAR(20) DEFAULT 'Pending'
);
```

---

## 🔌 Database Connection (JDBC)

```java
Connection connection = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/todoapp", "root", "password");
```

---

## 🎨 UI / UX

All UI layouts are built using **Scene Builder**, including:

* Task list view
* Add task popup
* Complete task UI
* Delete confirmation dialog

---

## ▶️ How to Run the Project

1. Install **JDK 17+**
2. Install **Scene Builder**
3. Set up **JavaFX SDK**
4. Import project into IntelliJ / Eclipse / NetBeans
5. Update DB credentials in the config file
6. Run the project from the Main class

---

## 📷 Screenshots (Optional)

*Add your UI images here*

---

## 🧪 Future Improvements

* 🔹 Task categories
* 🔹 Drag & Drop sorting
* 🔹 Dark mode UI
* 🔹 User login system

---

## 🧑‍💻 Author

**Pasindu Bandara**

---

## 📄 License

This project is open-source and free to use.
