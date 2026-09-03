# Raytracer

Det här är en enkel raytracer byggd i Java. Programmet skickar ut rays från en kamera och kollar om de träffar olika objekt i scenen. Just nu finns det en `Sphere` och en `Triangle`.

När programmet körs renderas scenen till en PNG-bild.

## Klasser

De viktigaste klasserna i projektet är:

* `Vector3D` – används för punkter och vektorer i 3D.
* `Color` – används för färger.
* `Ray` – representerar en stråle med en startpunkt och en riktning.
* `Hit` – innehåller information om en träff, till exempel var träffen sker och vilket objekt som träffades.
* `Shape` – abstrakt klass som alla våra former ärver från.
* `Sphere` – en sfär som kan träffas av en ray.
* `Triangle` – en triangel som kan träffas av en ray.
* `Scene` – innehåller alla Shapes och letar efter den närmaste träffen.
* `Renderer` – skickar ut rays genom bilden och färglägger pixlarna beroende på vad rayen träffar.
* `Main` – startar programmet och sparar den färdiga bilden.

## Hur lägger man till en ny Shape?


Om man vill lägga till en ny form, till exempel en `Plane`, börjar man med att skapa en ny klass:

```java
public class Plane extends Shape {

}
```

Eftersom `Plane` ärver från `Shape` måste den implementera `hit()`:

```java
@Override
public Hit hit(Ray ray) {
    // Här räknar man ut om rayen träffar planet.
}
```

Om rayen inte träffar planet returnerar man `null`. Om den träffar returnerar man en `Hit`:

```java
return new Hit(t, this);
```

Sen kan man skapa ett `Plane`-objekt och lägga till det i scenen:

```java
Plane plane = new Plane(...);
scene.addShape(plane);
```

Man behöver alltså inte ändra `Scene` eller `Renderer`. De arbetar redan med `Shape`, så den nya formen fungerar på samma sätt som `Sphere` och `Triangle`.

Det är också därför det används en abstrakt `Shape` och polymorfism. Varje Shape har sin egen `hit()`-metod, men `Scene` behöver inte veta exakt vilken typ av Shape det är.

### Köra programmet

Programmet körs från `Main`.

När det körs skapas scenen och bilden sparas som:

`raytracer.png`
