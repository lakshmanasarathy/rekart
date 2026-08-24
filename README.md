# 🛒 ReKart - E-Commerce Platform

A modern, secure e-commerce platform built with Spring Boot and MySQL, featuring JWT authentication, Razorpay payment integration, and automated email notifications.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation & Setup](#installation--setup)
- [Configuration](#configuration)
- [Building & Running](#building--running)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Security](#security)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

---

## 🎯 Overview

**ReKart** is a full-stack e-commerce application designed to provide a seamless shopping experience with robust security, reliable payment processing, and real-time user communications. Built with enterprise-grade technologies and best practices.

---

## ✨ Features

### 🔐 Authentication & Security
- JWT (JSON Web Token) based authentication
- Spring Security integration with role-based access control
- User registration and login with validation
- Secure password handling
- Token refresh mechanism

### 💳 Payment Processing
- **Razorpay** payment gateway integration
- Secure transaction handling
- Order creation and verification
- Support for multiple currencies (INR by default)
- Payment status tracking

### 📧 Email Notifications
- SMTP-based email delivery via Gmail
- Automated order confirmation emails
- User registration confirmation
- Password reset emails
- Order status updates

### 📊 Database Management
- MySQL database with JPA/Hibernate ORM
- Automatic schema generation and updates
- Support for complex entity relationships
- Connection pooling for performance

### ✅ Input Validation
- Spring Validation framework
- Field-level validation
- Custom validation rules
- Error handling and reporting

### 🎨 Responsive UI
- Modern HTML5 frontend
- Interactive JavaScript functionality
- Responsive CSS styling
- Mobile-friendly design

---

## 🛠 Tech Stack

### Backend
| Technology | Version | Purpose |
|-----------|---------|---------|
| **Spring Boot** | 4.0.5 | Application framework |
| **Java** | 17+ | Programming language |
| **Spring Security** | Latest | Authentication & Authorization |
| **JWT (JJWT)** | 0.13.0 | Token management |
| **Spring Data JPA** | Latest | Data persistence |
| **Hibernate** | Latest | ORM |
| **MySQL** | 8.0+ | Database |
| **Spring Mail** | Latest | Email service |
| **Razorpay SDK** | Latest | Payment processing |
| **Maven** | 3.6+ | Build tool |

### Frontend
- **HTML5** - Markup structure
- **JavaScript** - Client-side logic
- **CSS3** - Styling and responsive design

### Development Tools
- Maven for dependency management and build automation
- Maven Wrapper for consistent builds
- Spring Boot DevTools for development

---

