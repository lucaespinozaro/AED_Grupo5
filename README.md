# AED_Grupo5

## Buscar Dulces

Este es un programa simple en Java que consiste en un pequeño juego de consola.
El objetivo del juego es que el usuario adivine los tres dulces escondidos escribiendo sus nombres.

Cuando el usuario escribe el nombre de un dulce correcto, el programa lo cuenta como encontrado.
El juego termina cuando los tres dulces han sido descubiertos.

## Cómo funciona

El programa le pide al usuario que escriba el nombre de un dulce.
Los dulces que se deben encontrar son:

- chocolate
- gomitas
- caramelo

Si el usuario escribe uno de estos nombres, el programa indica que encontró un dulce y aumenta el contador. 
Si escribe otro nombre, el programa avisa que ese dulce no es uno de los buscados.

El juego continúa hasta que los tres dulces son encontrados.

## Estructura del proyecto

El programa está dividido en tres clases:

- Main.java
  Contiene el método `main` y se encarga de iniciar el juego.

- JuegoDulces.java
  Maneja la lógica del juego y la interacción con el usuario.

- Dulces.java
  Guarda los dulces que deben encontrarse y verifica si el usuario acierta.
