# Selección de País mediante ComboBox en Java

## Descripción

Este proyecto consiste en desarrollar una aplicación en **Java** con una interfaz gráfica que incluye una **lista desplegable (`ComboBox`)** con varios países y un botón. Al seleccionar un país y pulsar el botón, se muestra un mensaje indicando cuál ha sido el país elegido.

El objetivo del ejercicio es practicar el uso de listas desplegables y la interacción entre componentes gráficos utilizando **Swing**.

## Objetivos

- Crear una interfaz gráfica con una lista desplegable.
- Permitir seleccionar un país desde un `ComboBox`.
- Implementar un botón con gestión de eventos.
- Mostrar un mensaje con el país seleccionado.
- Practicar la captura de datos desde componentes gráficos.

## Funcionamiento

1. Se inicia la aplicación.
2. Se muestra un formulario con una lista desplegable de países.
3. El usuario selecciona una opción del `ComboBox`.
4. Al pulsar el botón:
   - Se obtiene el país seleccionado.
   - Se muestra un mensaje de confirmación con el resultado.

## Ejemplo de uso

Formulario:

```text
Seleccione un país:

[ España ▼ ]

      [ Mostrar ]
```

Si el usuario selecciona:

```text
México
```

Al pulsar el botón:

```text
País seleccionado: México
```
