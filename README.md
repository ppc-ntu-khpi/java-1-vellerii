# Створення класів

## Завдання 1. Створення класу з атрибутами 💻

Cтворила **в пакеті ````domain````** клас ```` Сustomer ```` з **приватними атрибутами** (атрибути повинні мати **значення за замовчуванням**).


## Завдання 2. Додавання в клас методів 💻

Додала до класу метод ````displayCustomerInfo````, який виводить на консоль інформацію про клієнта з допомогою ````System.out.println````.

## Перевірка працездатності створеного класу ✅

1. Створила в **пакеті ````test````** клас ````CustomerTest````, в методі ````main```` якого створила об'єкт класу ```` Сustomer ```` та вивела на екран його властивості з допомогою методу ````displayCustomerInfo````. 
2. **Запустила** його. Програмний код і результат запуска коду наведені нижче.
``` java
package domain;

public class Customer {
    private int ID = 16061;
    private boolean isNew = true;
    private float total = 720.4f;

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is the customer new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
    
}
```

![alt-текст](https://github.com/ppc-ntu-khpi/java-1-vellerii/blob/main/Solution/done.png "done.png")

## Виконання завдання на "п'ять" 5️⃣
Потрібно було змінити код класу наступним чином:
  * додати **конструктор за замовчуванням**, який ініціалізує атрибути початковими значеннями;
  * додати **методи для зміни атрибутів** - ````setID````, ````setStatus````, ````setTotal```` з відповідними параметрами та перевіркою присвоюваних значень;
  * **використати ці методи** в методі в методі ````main```` класу````CustomerTest````.
  
  Програмний код після змін і результат запуска коду наведені нижче.
  ``` java
  package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private float total;
    
    public Customer() {
       ID = 16061;
       isNew = true;
       total = 720.4F;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID >= 0) {
             this.ID = ID;
        }
    }

    public boolean getStatus() {
        return isNew;
    }

    public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        if (total >= 0) {
           this.total = total;
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is the customer new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
```
![alt-текст](https://github.com/ppc-ntu-khpi/java-1-vellerii/blob/main/Solution/advanced.png "advanced.png")




