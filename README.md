# EJERCICIO 04 - CONTADOR CON LOGIN Y MENÚ DE NAVEGACIÓN CON CONSUMO DE API

Este proyecto Android ha evolucionado para incluir un menú de navegación que consta de tres fragmentos: Home, Contador y Salir. La aplicación ahora presenta una interfaz más completa que proporciona funcionalidades adicionales como consumir una API.

## Estructura del proyecto

El proyecto consta de los siguientes archivos principales:

- **`ApiFragment`**: La actividad para consumir una API.
- **`CRUDInterface`: Es donde se configura la llamada a /products.
- **`Product`: La clase que representa un producto y su estructura.
- **`LoginActivity.java`**: La actividad principal para el inicio de sesión. Maneja la autenticación del usuario.
- **`NavigationMenu.java`**: La actividad que contiene el menú de navegación y gestiona la transición entre los fragmentos.
- **`HomeFragment.java`**: Fragmento que representa la pantalla principal de la aplicación.
- **`CountFragment.java`**: Fragmento que muestra un contador y la información del usuario.
- **`ExitFragment.java`**: Fragmento que proporciona la opción de salir de la aplicación.
- **`activity_main.xml`**: Diseño de la interfaz de usuario para la pantalla principal (MainActivity).
- **`login_main.xml`**: Diseño de la interfaz de usuario para la pantalla de inicio de sesión (LoginActivity).
- **`navigationmenu_main.xml`**: Diseño de la interfaz de usuario para la actividad con el menú de navegación.
- **`fragment_count.xml`**: Diseño de la interfaz de usuario para el fragmento de contador.
- **`fragment_exit.xml`**: Diseño de la interfaz de usuario para el fragmento de salida.
- **`fragment_home.xml`**: Diseño de la interfaz de usuario para el fragmento de inicio.
- **`bottom_navigation_menu.xml`**: Menú de navegación inferior con las opciones Home, Contador y Salir.
- **`nav_graph.xml`**: Gráfico de navegación que define las conexiones entre los fragmentos.
- **`res/drawable/home_account.xml`**: Recurso drawable que muestra una imagen para el fragmento Home.

## Instrucciones de Uso

1. **Inicio de sesión**: En la pantalla de inicio de sesión, se debe ingresar un nombre de usuario y una contraseña. Por defecto, el usuario es "admin" y la contraseña es "admin".

2. **Autenticación**: Al presionar el botón "LOGIN", se verifica la información ingresada. Si las credenciales son correctas, se muestra un mensaje y se redirige a la pantalla principal con el menú de navegación. De lo contrario, se muestra un mensaje de error.

3. **Menú de Navegación**: El menú de navegación consta de tres opciones: "Home", "Contador" y "Salir". Cada opción lleva a un fragmento específico de la aplicación.

4. **Contador**: En la pantalla de Contador, se muestra un contador y el nombre de usuario. Los botones permiten incrementar, decrementar y restablecer el contador.

5. **Salir de la Aplicación**: La opción "Salir" en el menú de navegación permite cerrar la aplicación.

## Ejemplo en GIF

<img src="https://media.discordapp.net/attachments/888067531846328390/1197260954191265883/Proyecto_sin_titulo.gif?ex=65ba9f27&is=65a82a27&hm=544c1c32429bd8f58cbc53553c0bf414e06f08fc9282fc51a2fbd33b7afdc3c5&=&width=324&height=670"/>

## Imagen de la API
<img src="https://media.discordapp.net/attachments/888067531846328390/1198716233298751669/Captura_de_pantalla_2024-01-21_204236.png?ex=65bfea7d&is=65ad757d&hm=800673b048ffe14cdd0623b2b54342a815372b79a5db8e07d33540e02ddf35fb&=&format=webp&quality=lossless&width=1440&height=526">

## Imagen de devolución por consola
<img src="https://media.discordapp.net/attachments/888067531846328390/1198716289645023406/Captura_de_pantalla_2024-01-21_204256.png?ex=65bfea8a&is=65ad758a&hm=e99c3398d1bfcbe94e768842593706b97866983244af090608e3c1437ac50533&=&format=webp&quality=lossless">

## Cómo Ejecutar

Para ejecutar este proyecto:

1. Clona o descarga el repositorio.
2. Abre el proyecto en Android Studio.
3. Ejecuta la aplicación en un emulador o dispositivo Android.

## Notas Adicionales

- Se ha implementado un menú de navegación para mejorar la experiencia del usuario.
- La aplicación utiliza fragmentos para organizar y gestionar las distintas pantallas.
- La autenticación sigue utilizando las credenciales por defecto: usuario "admin" y contraseña "admin".

## Requerimientos

- Android Studio (versión XYZ o superior).
- Dispositivo Android o emulador para probar la aplicación.
