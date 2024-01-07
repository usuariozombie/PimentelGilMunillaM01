# EJERCICIO 02 - CONTADOR CON LOGIN

Este proyecto Android es una aplicación simple que consta de dos pantallas: una pantalla de inicio de sesión y una pantalla principal con un contador. La autenticación es necesaria para acceder a la pantalla principal.

## Estructura del proyecto

El proyecto consta de los siguientes archivos principales:

- **`LoginActivity.java`**: La actividad principal para el inicio de sesión. Maneja la autenticación del usuario.
- **`MainActivity.java`**: La actividad principal después del inicio de sesión exitoso. Muestra un contador y botones para incrementar, decrementar y restablecer el contador.
- **`activity_main.xml`**: Diseño de la interfaz de usuario para la pantalla principal (MainActivity).
- **`login_main.xml`**: Diseño de la interfaz de usuario para la pantalla de inicio de sesión (LoginActivity).
- **`fonts`**: Carpeta que contiene fuentes personalizadas utilizadas en la interfaz de usuario.

## Instrucciones de Uso

1. **Inicio de sesión**: En la pantalla de inicio de sesión, se debe ingresar un nombre de usuario y una contraseña. Por defecto, el usuario es "admin" y la contraseña es "admin".

<img src="https://media.discordapp.net/attachments/888067531846328390/1193488292277129297/android1.png?ex=65ace596&is=659a7096&hm=97edb6c00e825e34438494022546f1415639c706ccebab3559e9ae17b5f8f5ab&=&format=webp&quality=lossless&width=329&height=671">

2. **Autenticación**: Al presionar el botón "LOGIN", se verifica la información ingresada. Si las credenciales son correctas, se muestra un mensaje y se redirige a la pantalla principal. De lo contrario, se muestra un mensaje de error.

<img src="https://media.discordapp.net/attachments/888067531846328390/1193489498370211860/android2.png?ex=65ace6b6&is=659a71b6&hm=077821971549cbdfbe1e92b65f6b71cab9e27077955dc115d36e79538b1782e0&=&format=webp&quality=lossless">

3. **Pantalla principal**: En la pantalla principal, se muestra un contador y tres botones: "+" para incrementar, "-" para decrementar y "RESET" para restablecer el contador.

<img src="https://media.discordapp.net/attachments/888067531846328390/1193488292826595338/android3.png?ex=65ace596&is=659a7096&hm=d692c66ca99898799e28ccb62b668e6c1ad35d440029dd522815aa81e78b6da1&=&format=webp&quality=lossless">

## Cómo Ejecutar

Para ejecutar este proyecto:

1. Clona o descarga el repositorio.
2. Abre el proyecto en Android Studio.
3. Ejecuta la aplicación en un emulador o dispositivo Android.

## Notas Adicionales

- Se han utilizado fuentes personalizadas para mejorar la apariencia de la interfaz de usuario.
- La aplicación está diseñada con ConstraintLayout para el diseño de las pantallas.

## Requerimientos

- Android Studio (versión XYZ o superior).
- Dispositivo Android o emulador para probar la aplicación.
