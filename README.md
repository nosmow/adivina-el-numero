<h1 align="center" id="title">Adivina el número</h1>

<p align="center"><img src="https://socialify.git.ci/nosmow/adivina-el-numero/image?forks=1&issues=1&language=1&name=1&owner=1&pattern=Solid&stargazers=1&theme=Auto" alt="project-image"></p>

<p id="description">Este juego se basa en que la computadora elige un número aleatorio y el jugador debe adivinarlo con pistas, solo tiene 3 vidas si las pierde el juego se reinicia, por cada victoria acumula 100 puntos y al perder la partida los puntos vuelven a 0.</p>

## Tabla de Contenido

- [Vista previa](#vista-previa)
- [Características](#caracteristicas)
- [Instalación](#instalacion)
- [Proceso de desarrollo](#proceso-de-desarrollo)
  - [Construido con](#construido-con)
  - [Estructura](#estructura)
  - [Documentación](#documentacion)
- [Recursos utilizados](#recursos-utilizados)
- [Licencia](#licencia)
- [Autor](#autor)

## Vista previa
<div align="center">
<img src="https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgiLIqp7zL7XlvX-lmnSP2y92cq9O6H7rNsKOjKhWcmXPLPRdvnTHOnNG3DOibnqT2pSTT2qLB0QOpbUERYZPPhZmMbff5OoNeDP_SZbLaE2VlWY-Kj0yUIORswgQYZ7uPB4vopx4DnEsP338TOvSkjeJjjHa8Ck_FmMU6kqHLOaXBljSMsM3YeoBPi750/s16000/Dise%C3%B1o%20sin%20t%C3%ADtulo.png"/>
</div>

## Caracteristicas

Características del juego:

*   Acumulación de puntos.
*   Tres vidas por partida.
*   Sistema de generación de números aleatorios.

## Instalacion:

1. Descargue la ultima versión de [Java JDK](https://www.oracle.com/java/technologies/downloads/)
2. Descargue el IDE [Apache NetBeans](https://netbeans.apache.org/download/index.html)
3. Clone el repositoria mediante el siguiente enlace: https://github.com/nosmow/adivina-el-numero
4. Abra el proyecto en el IDE Apache NetBeans
5. Compile y ejecute la aplicación, listo.

## Proceso de desarrollo
### Construido con

Tecnologías usadas en el proyecto:

*   Java 19.0.2
*   Apache NetBeans IDE 18

### Estructura

``` Java
//Ubicado en la clase LogicaJuego.java
//
//Metodo para generar números aleatorios sin que ninguno de estos se 
//repita dentro de la lista.

public void generarNumeros(int tamaño, int min, int max) {      
        try {
            Set<Integer> unico = new HashSet<>();
            while (unico.size() < tamaño) {
                int random = (int) (Math.random() * (max - min + 1)) + min;
                unico.add(random);
            }
            
            List<Integer> listaN = unico.stream()
                    .map(num -> Integer.valueOf(num))
                    .collect(Collectors.toList());

            numeros = listaN;
        } catch (Exception e) {
            e.getMessage();
        } 
    }
```

### Documentacion

*   Clic para acceder al [javadoc](https://github.com/nosmow/adivina-el-numero/tree/main/dist/javadoc)

## Recursos utilizados

* [FiveCodMover](https://mega.nz/file/guhw1IRD#LFa8hjhACXqsgoJRdlwux-KaOu6Hc0_wlJwkL4R4kd4) - Librería de Java creada por FiveCod SoftWare
* [Flaticon](https://www.flaticon.com/) - Repositorio de iconos.
* [Photopea](https://www.photopea.com/) - Mejor alternativa gratuita a Photoshop

## Licencia:

> Este proyecto está licenciado bajo la licencia [MIT](https://github.com/nosmow/adivina-el-numero/blob/main/LICENSE.md)

## Autor

Hecho <!> por [Nosmow](https://www.linkedin.com/in/nosmow)
