## Observables

*Suggestion de Copilot*

```java

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(List<String> list);
}

// Observable interface
interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Concrete Observable
class ConcreteObservable implements Observable {
    private List<String> list = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void add(String s) {
        list.add(s);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(list);
        }
    }
}

// Concrete Observer
class ConcreteObserver implements Observer {
    @Override
    public void update(List<String> list) {
        System.out.println("Liste mise à jour: " + list);
    }
}

// Utilisation
public class Main {
    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();
        ConcreteObserver observer = new ConcreteObserver();

        observable.addObserver(observer);
        observable.add("Element 1");
        observable.add("Element 2");
    }
}
```


---
***Autre solution***

```java
//Classe Car
public class Voiture {
    private int position;

    public Voiture(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

//Interface Observer
public interface Observer {
    void update(List<Voiture> voitures);
}

//Interface Subject
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

//Classe RaceManager
public class Course implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Voiture> voitures = new ArrayList<>();

    public void addVoiture(Voiture voiture) {
        voitures.add(voiture);
        notifyObservers();
    }

    public void removeVoiture(Voiture voiture) {
        voitures.remove(voiture);
        notifyObservers();
    }

    public void moveVoiture(Voiture voiture, int newPosition) {
        voiture.setPosition(newPosition);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(voitures);
        }
    }
}

//Classe Spectateurs
public class ConcreteObserver implements Observer {
    @Override
    public void update(List<Voiture> voitures) {
        System.out.println("Les positions des voitures ont changé : ");
        for (Voiture voiture : voitures) {
            System.out.println("Voiture à la position : " + voiture.getPosition());
        }
    }
}

//Classe Main
public class Main {
    public static void main(String[] args) {
        Course course = new Course();

        Voiture voiture1 = new Voiture(1);
        Voiture voiture2 = new Voiture(2);

        course.addVoiture(voiture1);
        course.addVoiture(voiture2);

        Observer observer = new ConcreteObserver();
        course.addObserver(observer);

        course.moveVoiture(voiture1, 3);
    }
}

```

--- 
***Autre possibilité avec Random***

```java
//Classe Car
public class Voiture {
    private int position;

    public Voiture(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

//Classe Observer
public interface Observer {
    void update(List<Voiture> voitures);
}

//Classe Subject
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

//Classe Race
import java.util.Random;

public class Course implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Voiture> voitures = new ArrayList<>();
    private Random random = new Random();

    public void addVoiture(Voiture voiture) {
        voitures.add(voiture);
        notifyObservers();
    }

    public void removeVoiture(Voiture voiture) {
        voitures.remove(voiture);
        notifyObservers();
    }

    public void moveVoiture(Voiture voiture) {
        int newPosition = random.nextInt(100); // Génère une position aléatoire entre 0 et 99
        voiture.setPosition(newPosition);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(voitures);
        }
    }
}

//Classe Spectateurs
public class ConcreteObserver implements Observer {
    @Override
    public void update(List<Voiture> voitures) {
        System.out.println("Les positions des voitures ont changé : ");
        for (Voiture voiture : voitures) {
            System.out.println("Voiture à la position : " + voiture.getPosition());
        }
    }
}

//Classe Main
public class Main {
    public static void main(String[] args) {
        Course course = new Course();

        Voiture voiture1 = new Voiture(1);
        Voiture voiture2 = new Voiture(2);

        course.addVoiture(voiture1);
        course.addVoiture(voiture2);

        Observer observer = new ConcreteObserver();
        course.addObserver(observer);

        course.moveVoiture(voiture1);
        course.moveVoiture(voiture2);
    }
}
```