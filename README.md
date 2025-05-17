<h1 align="center">📦 Sistema de Gestión de Productos y Pedidos - TechLab</h1>

<p align="center">
  Preentrega del Proyecto | Revisión de Progreso - TFI
</p>

---

## 📌 Descripción

Este proyecto es una aplicación desarrollada en Java que permite **gestionar productos y pedidos**. Forma parte de la preentrega del Trabajo Final Integrador (TFI) del curso, y representa el avance alcanzado hasta la fecha en la aplicación de conceptos clave como POO, colecciones, excepciones y modularización del código.

---

## 🎯 Objetivos

- Registrar y listar productos con información relevante.
- Buscar, actualizar y eliminar productos.
- Crear pedidos con múltiples productos y validar stock disponible.
- Calcular el total del pedido y reducir el stock automáticamente.
- Presentar un menú interactivo con opciones claras para el usuario.

---

## ⚙️ Funcionalidades principales

- ✅ Alta de productos
- ✅ Listado de productos
- ✅ Búsqueda y actualización por ID o nombre
- ✅ Eliminación de productos
- ✅ Creación de pedidos con múltiples ítems
- ✅ Listado de pedidos y cálculo de costo total
- ✅ Validación de stock
- ✅ Menú interactivo que se repite hasta que el usuario decida salir

---

## 🧠 Conceptos aplicados

- Programación orientada a objetos (POO)
- Colecciones (`ArrayList`, `Map`)
- Encapsulamiento, herencia y polimorfismo (opcional)
- Excepciones (`try/catch`, `NumberFormatException`, `StockInsuficienteException`)
- Organización por paquetes:
  - `com.techlab.productos`
  - `com.techlab.pedidos`
  - `com.techlab.excepciones`
  - `com.techlab.main`

---

## 🏗️ Estructura del proyecto

📦 src
┣ 📂 com.techlab.main
┃ ┗ 📜 Main.java
┣ 📂 com.techlab.productos
┃ ┣ 📜 Producto.java
┃ ┣ 📜 Bebida.java (opcional)
┃ ┗ 📜 ProductoService.java
┣ 📂 com.techlab.pedidos
┃ ┣ 📜 Pedido.java
┃ ┣ 📜 LineaPedido.java
┃ ┗ 📜 PedidoService.java
┣ 📂 com.techlab.excepciones
┃ ┗ 📜 StockInsuficienteException.java
---

## 🧪 Ejemplo del menú en consola

```text
========= SISTEMA DE GESTIÓN - TECHLAB =========
1) Agregar producto
2) Listar productos
3) Buscar/Actualizar producto
4) Eliminar producto
5) Crear un pedido
6) Listar pedidos
7) Salir
===============================================
Elija una opción: 
