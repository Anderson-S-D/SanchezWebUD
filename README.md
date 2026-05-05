# SanchezWebUD - Registro de Aspirantes y CDT

## Descripción General
**SanchezWebUD** es una aplicación web sencilla desarrollada con **Jakarta EE 10** y **Jakarta Faces**. Incluye el registro de aspirantes universitarios en una tabla común y el simulador CDT basado en `ArcosWebUD`.

---

## Información del Proyecto
- **Autor:** Anderson Sanchez Duarte
- **Codigo:** 20231578043
- **Institución:** Universidad Distrital Francisco José de Caldas
- **Asignatura:** Programación Web
- **Grupo:** 301
- **Fecha:** 28 Abril de 2026

---

## Especificaciones
- **Entorno de Desarrollo:** Eclipse IDE.
- **Servidor de Aplicaciones:** Apache Tomcat 10.1.x.
- **Kit de Desarrollo:** Java Development Kit (JDK) 21.
- **Framework Web:** Jakarta Faces 4.0 (JSF).
- **Inyección de Dependencias:** CDI 4.0.
- **Gestión de Dependencias:** Maven.
- **Interfaz de Usuario:** XHTML y CSS.

---

## Funcionalidad
### Registro de Aspirantes
Permite registrar aspirantes con sus datos básicos:

- Identificación.
- Nombres.
- Apellidos.
- Correo.
- Teléfono.
- Programa académico.

Los aspirantes registrados se almacenan en memoria y se muestran en `listado.xhtml` mediante una tabla JSF común (`h:dataTable`).

### Simulador CDT
Permite ingresar inversión, interés y plazo para calcular:

- Ganancia.
- Valor final al vencimiento.
- Impuesto del 4%.
- Ganancia después de impuestos.

---

## Estructura

```text
SanchezWebUD/
├── src/main/java/sanchez/
│   ├── bean/
│   │   ├── AspiranteBean.java
│   │   └── CDT.java
│   └── modelo/
│       ├── Aspirante.java
│       ├── AspiranteDAO.java
│       ├── Persona.java
│       ├── ProgAcad.java
│       └── ProgAcadDAO.java
├── src/main/webapp/
│   ├── index.xhtml
│   ├── listado.xhtml
│   ├── cdt.xhtml
│   ├── css/styles.css
│   └── WEB-INF/
└── pom.xml
```

---

## Ejecución
Importe el proyecto en Eclipse como Maven Project, agréguelo a Tomcat 10.1 y acceda a:

```text
http://localhost:8080/SanchezWebUD/index.xhtml
```
