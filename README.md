# 📺 TV Shows App – Android Native (Kotlin)

Aplicación Android nativa desarrollada en **Kotlin**, enfocada en buenas prácticas de arquitectura, patrones de diseño y consumo de APIs REST.  
El proyecto demuestra una implementación moderna basada en **Clean Architecture + MVVM**, utilizando corrutinas, Retrofit y Jetpack Compose.

---

## 🚀 Tecnologías y Herramientas

- Kotlin
- Clean Architecture
- MVVM (Model-View-ViewModel)
- Retrofit
- Glide
- Kotlin Coroutines
- Repository Pattern
- Factory Pattern
- Git + GitFlow  🔹 `utilizar la rama de "remoteConsume" es la mas completa`
- Jetpack Compose
- State Management (`mutableStateOf`, `State`)
- Kotlin Scope Functions (`map`, `let`)

---

## 🏛️ Arquitectura

El proyecto sigue los principios de **Clean Architecture**, separando claramente responsabilidades en capas:

presentation/
domain/
data/

### 🔹 Presentation Layer
- Implementación con MVVM
- ViewModel maneja lógica de presentación
- Uso de `mutableStateOf` y `State` para reactividad
- UI desarrollada con diseño simple y claro

### 🔹 Domain Layer
- Casos de uso (UseCases)
- Modelos de dominio independientes del framework

### 🔹 Data Layer
- Implementación del Repository Pattern
- DataSources (Remote)
- Integración con API usando Retrofit

---

## 🧩 Patrones de Diseño Implementados

### ✅ MVVM
Separación clara entre UI y lógica de negocio.

### ✅ Repository Pattern
Abstracción de las fuentes de datos para desacoplar la capa de datos del dominio.

### ✅ Factory Pattern
Utilizado para la creación de ViewModels con dependencias inyectadas manualmente.

### ✅ Clean Architecture Principles
- Inversión de dependencias
- Separación de responsabilidades
- Bajo acoplamiento

---

## 🌐 Consumo de API

Se utiliza Retrofit para realizar llamadas HTTP y consumir datos remotos:

- Endpoints REST:
- * https://api.tvmaze.com/shows?page=1 `enpoind de paginación, evitando saturar la memoria`
- Conversión JSON → Data Models
- Manejo de corrutinas con `suspend`
  
---

## 🖼️ Manejo de Imágenes

Se utiliza Glide para:

- Cargar imágenes desde URL
- Optimización de memoria
- 

---

## ⚡ Programación Asíncrona

Se implementan Kotlin Coroutines para:

- Llamadas de red no bloqueantes
- Manejo de hilos
- Uso de `viewModelScope`

Ejemplo conceptual:

```kotlin
init {
        viewModelScope.launch {
            val result = showsUseCase.invoke()
            _data.value = result
        }
    }
```
---

## 📺🖼️ Imagen previa de la app
<p align="center">
  <img width="426" height="947" alt="imagen" src="https://github.com/user-attachments/assets/a8f41ec3-7ca7-4ebf-bd5e-5c07ec48453f" />
</p>

---
