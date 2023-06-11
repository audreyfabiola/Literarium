<h1 align="center">Literarium —— <em>Where Books Come Alive</em>.</h1>

### <div align="center"><img src="/Assets/Logo3.png" alt="Logo3" width="500"/></div>

This is the repository for Clarissa Audrey Fabiola's Object-Oriented Programming final project.

#### Introduction

Literarium is a Java Swing-based desktop application designed to simulate a digital bookstore. It provides a user-friendly graphical interface and supports two roles: Admin and Customer. The Admin role enables book inventory and customer inventory management, while the Customer role allows users to browse books, add them to their bill, and generate it.

#### 🎥 Demo Video

Video demonstration can be accessed .... 

#### 📁 File Directory

- 'Start.java': The start class serves as the entry point of the application and initializes the necessary components for the bookstore management system.
- 'Login.java': The login class handles the user authentication process, allowing authorized users to access the system.
- 'BookStore.java': The BookStore.java interface declares methods for retrieving and setting information used in the bookstore.
- 'BookManagement.java': The BookManagement class implements the BookStore interface and serves as a component responsible for managing books within the system.
- 'CustomerManagement.java': The CustomerManagement class implements the BookStore interface and serves as a component responsible for managing customer within the system.
- 'Store.java': The Store class handle the overall functionality of the bookstore for customer.
- 'Admin.java': The Admin class provides administrative functionalities for the bookstore management system, such as customer and book inventory.
- 'customer.txt': This file contains information about customers in a bookstore. It stores data such as customer IDs, names, passwords, and gender.
- 'book.txt': This file contains information about boooks in the bookstore. It stores data such as book IDs, titles, quantities, prices, and authors.
- 'Books' folder: This folder contains book cover images in JPG format and their corresponding synopsis in TXT files.

#### 📚 Dependencies

- javax.swing: A library for creating graphical user interfaces (GUIs) in Java. It is used in the project for displaying message dialogs, manipulating table models, and creating graphical components for the user interface.
- java.awt: A library for creating GUI components and handling basic graphics operations in Java. It is used in the project for working with fonts, measuring font metrics, and managing images.
- java.io: A library for performing input and output operations in Java. It is used in the project for reading and writing files.
- java.nio.file: A library for performing file-related operations in Java. It is used in the project for copying files with the option to replace existing files.

#### Clone Locally

```
$ git clone https://github.com/audreyfabiola/Literarium
```

#### UML Class Diagram of the Program

![UMLClassDiagram](/Assets/UMLClassDiagram.png)

#### 📷 Screenshots of the Program

Login Page

![loginScreenshot](/Assets/loginScreenshot.png)

Admin Page (Book and Customer Management)

![bookManagementScreenshot](/Assets/bookManagementScreenshot.png)

![customerManagementScreenshot](/Assets/customerManagementScreenshot.png)

Customer Page (Store)

![bookStoreScreenshot](/Assets/bookStoreScreenshot.png)
