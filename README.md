# ☕ ProyectoLibreriasSwing

<p align="center">
  <strong>Demostración educativa de librerías externas para interfaces gráficas desarrolladas con Java Swing.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java 8 o superior" />
  <img src="https://img.shields.io/badge/Java%20Swing-GUI-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java Swing" />
  <img src="https://img.shields.io/badge/IntelliJ%20IDEA-compatible-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA" />
  <img src="https://img.shields.io/badge/Licencia-MIT- blue?style=for-the-badge" alt="Licencia MIT" />
</p>

<p align="center">
  <a href="#-acerca-del-proyecto">Acerca del proyecto</a> •
  <a href="#-tecnologías-y-librerías">Tecnologías</a> •
  <a href="#-instalación">Instalación</a> •
  <a href="#-uso">Uso</a>
</p>

---

## 📌 Acerca del proyecto

**ProyectoLibreriasSwing** es una aplicación de escritorio creada con **Java Swing** para explorar la integración de librerías externas en interfaces gráficas. El proyecto funciona como una demostración práctica y educativa de diferentes *Look and Feel*, temas visuales y componentes especializados que pueden incorporarse a una aplicación Swing.

Desde una ventana principal, la aplicación permite abrir demostraciones independientes de:

- **JTattoo:** cambio entre distintos estilos visuales clásicos.
- **FlatLaf:** aplicación de temas modernos, oscuros y basados en IntelliJ/macOS.
- **Substance:** uso de temas visuales junto con componentes de calendario y selección regional.

El proyecto corresponde a la actividad **R3 de Tópicos Avanzados de Programación de la UVEG** y está pensado para estudiantes y desarrolladores que desean comprender cómo agregar y utilizar archivos `.jar` externos en una aplicación Java de escritorio.

## ✨ Características principales

- 🖥️ Interfaz gráfica construida con `JFrame`, `JPanel`, `JButton`, `JOptionPane` y administradores de distribución Swing.
- 🎨 Ventana principal con acceso a tres demostraciones visuales: JTattoo, FlatLaf y Substance.
- 🔄 Cambio dinámico de temas mediante `UIManager.setLookAndFeel(...)`.
- 🌙 Temas claros, oscuros y estilos inspirados en diferentes entornos de escritorio.
- 📅 Componentes de calendario mediante JCalendar: calendario completo, selector de día, mes y fecha.
- 🌎 Selector de región con `JLocaleChooser`.
- 🧩 Código organizado en una clase principal y un paquete de ventanas demostrativas.
- 📦 Librerías externas incluidas localmente en el directorio `ProyectoLibrerias/lib`.

## 🛠️ Tecnologías y librerías

### Tecnologías base

| Tecnología | Uso en el proyecto |
| --- | --- |
| **Java 8 o superior** | Lenguaje principal de desarrollo. El código utiliza expresiones lambda, disponibles desde Java 8. |
| **Java Swing** | Construcción de las ventanas, botones, paneles, diálogos y componentes gráficos. |
| **IntelliJ IDEA** | Entorno recomendado; el repositorio incluye archivos `.iml` y configuración de bibliotecas. |
| **Git** | Clonación y control de versiones del proyecto. |

### Librerías incluidas

Las dependencias se encuentran en `ProyectoLibrerias/lib` y están configuradas en IntelliJ IDEA mediante `.idea/libraries/lib.xml`.

| Librería | Versión incluida | Función |
| --- | ---: | --- |
| **FlatLaf** | 3.4.1 | Temas modernos para Swing, incluyendo variantes claras, oscuras y temas IntelliJ. |
| **JTattoo** | 1.6.13 | Diferentes estilos visuales como Aero, Smart, Noire, Acryl, Bernstein y McWin. |
| **Substance** | 4.3 | Temas visuales avanzados para Swing. |
| **JCalendar** | 1.4 | Componentes para seleccionar fechas, días, meses y calendarios completos. |
| **JGoodies Looks** | 2.4.1 | Soporte adicional para estilos visuales Swing. |
| **JGoodies Common** | 1.2.0 | Clases comunes utilizadas por componentes de JGoodies. |
| **JUnit** | 4.6 | Biblioteca incluida en el conjunto local de dependencias del proyecto. |

> **Nota:** el proyecto no incluye actualmente un `pom.xml` ni un `build.gradle`. La configuración de dependencias se realiza mediante archivos `.jar` locales y la configuración del proyecto de IntelliJ IDEA.

## 📁 Estructura del proyecto

```text
ProyectoLibreriasSwing/
├── .idea/                                      # Configuración de IntelliJ IDEA
│   └── libraries/                              # Definición de bibliotecas externas
├── ProyectoLibrerias/
│   ├── lib/                                    # Archivos .jar incluidos en el proyecto
│   ├── src/
│   │   ├── META-INF/
│   │   │   └── MANIFEST.MF                     # Define la clase principal del JAR
│   │   └── main/java/com/si3ri/
│   │       ├── BotonesPrincipales.java         # Punto de entrada y menú principal
│   │       └── botones/
│   │           ├── BotonFlatLaf.java           # Demostración de temas FlatLaf
│   │           ├── BotonJTattoo.java           # Demostración de temas JTattoo
│   │           └── BotonSubstance.java         # Temas Substance y componentes JCalendar
│   └── ProyectoLibrerias.iml                   # Módulo IntelliJ del código fuente
├── ProyectoLibreriasSwing.iml                  # Módulo raíz de IntelliJ IDEA
├── LICENSE                                     # Licencia MIT
└── README.md                                   # Documentación del proyecto
```

## ⚙️ Instalación

### Requisitos previos

Antes de ejecutar el proyecto, instala lo siguiente:

- **JDK 8 o superior**.
- **IntelliJ IDEA** Community o Ultimate, recomendado para cargar automáticamente la configuración incluida.
- **Git**, si deseas clonar el repositorio desde la terminal.

### 1. Clonar el repositorio

```bash
git clone https://github.com/MarioSi3ri/ProyectoLibreriasSwing.git
cd ProyectoLibreriasSwing
```

### 2. Abrirlo en IntelliJ IDEA

1. Inicia IntelliJ IDEA.
2. Selecciona **Open** o **File > Open**.
3. Elige la carpeta raíz `ProyectoLibreriasSwing`.
4. Espera a que IntelliJ reconozca los archivos `.iml` y la configuración ubicada en `.idea`.
5. Comprueba que el proyecto tenga asignado un **JDK 8 o superior** desde `File > Project Structure`.

### 3. Verificar las bibliotecas

En IntelliJ IDEA, revisa que la biblioteca `lib` incluya los archivos ubicados en:

```text
ProyectoLibrerias/lib/
```

Si IntelliJ no carga automáticamente las dependencias:

1. Abre `File > Project Structure > Libraries`.
2. Agrega los archivos `.jar` del directorio `ProyectoLibrerias/lib`.
3. Asocia la biblioteca al módulo `ProyectoLibrerias`.
4. Guarda los cambios con **Apply** y **OK**.

## ▶️ Uso

### Ejecutar la aplicación desde IntelliJ IDEA

1. Abre la clase:

   ```text
   ProyectoLibrerias/src/main/java/com/si3ri/BotonesPrincipales.java
   ```

2. Haz clic derecho sobre la clase `BotonesPrincipales`.
3. Selecciona **Run 'BotonesPrincipales.main()'**.

La clase principal también está declarada en `ProyectoLibrerias/src/META-INF/MANIFEST.MF` como:

```text
main.java.com.si3ri.BotonesPrincipales
```

### Recorrido de la aplicación

1. Se muestra la ventana principal **Librerías**.
2. Selecciona una de las opciones disponibles:
   - **JTattoo:** abre una ventana con cinco estilos visuales y diálogos de confirmación.
   - **FlatLaf:** permite probar temas como FlatLaf Dark, Arc-Orange, Carbon, Dark Purple y macOS Dark.
   - **Substance:** muestra componentes `JCalendar`, `JLocaleChooser`, `JMonthChooser`, `JDateChooser` y `JDayChooser`.
3. Cada demostración se abre en una ventana independiente.
4. Las ventanas secundarias utilizan `DISPOSE_ON_CLOSE`, por lo que pueden cerrarse sin finalizar la ventana principal.

### Flujo principal

La ejecución comienza en `BotonesPrincipales.main(...)`, donde se aplica inicialmente `FlatLightLaf` y se crea la interfaz dentro de `SwingUtilities.invokeLater(...)`. Los botones de la ventana principal instancian `BotonJTattoo`, `BotonFlatLaf` o `BotonSubstance`; cada clase configura su propio estilo visual y registra eventos para mostrar temas o componentes adicionales.

## 🧪 Pruebas y compilación

El repositorio incluye `junit-4.6.jar` entre sus dependencias locales, aunque no se observan clases de prueba automatizadas en la estructura actual del proyecto. La validación principal consiste en abrir el proyecto con todas las bibliotecas configuradas y ejecutar la clase `BotonesPrincipales`.

Para generar un artefacto ejecutable desde IntelliJ IDEA, utiliza la opción **Build > Build Artifacts** y selecciona el artefacto configurado para `ProyectoLibrerias`. Al ejecutar un JAR fuera del IDE, asegúrate de que las dependencias externas estén disponibles en el *classpath*.

## 🧭 Posibles mejoras

- Incorporar Maven o Gradle para gestionar las dependencias sin archivos `.jar` locales.
- Añadir pruebas automatizadas para validar la creación de ventanas y componentes.
- Centralizar la configuración de temas en una clase de utilidad.
- Separar la lógica de eventos y la construcción de componentes para facilitar el mantenimiento.
- Documentar o añadir capturas de pantalla de cada demostración visual.

## 📄 Licencia

Este proyecto se distribuye bajo la **Licencia MIT**. Consulta el archivo [LICENSE](LICENSE) para conocer las condiciones completas de uso, modificación y distribución.

## 👤 Autor

**Mario Sierra Neri**

- GitHub: [@MarioSi3ri](https://github.com/MarioSi3ri)

---

<p align="center">
  Hecho con ☕ y Java Swing para el aprendizaje de integración de librerías externas.
</p>
