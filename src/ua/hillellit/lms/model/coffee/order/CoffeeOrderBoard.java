package ua.hillellit.lms.model.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {

  static Integer lastNumber = 0;
  private List<Order> orders = new ArrayList<>();

  public void add(String name) {
    lastNumber++;
    if (orders.add(new Order(lastNumber, name))) {
      System.out.println("Замовлення номер " + lastNumber + " взято в роботу");
    }
  }

  public void deliver() {
    System.out.println(
        "Замовлення номер " + orders.get(0).getNumberOfOrder() + " готово до видачі");
    orders.remove(0);
  }

  public void deliver(int number) {
    for (Order order : orders) {
      if (order.getNumberOfOrder() == number) {
        System.out.println("Замовлення номер " + number + " готово до видачі");
        orders.remove(order);
        break;
      }
    }
  }

  public void draw() {
    System.out.println("================");
    if (orders.size() > 0) {
      System.out.println("Num | Name ");
      for (Order order : orders) {
        System.out.println(order.getNumberOfOrder() + " | " + order.getName());
      }
    } else {
      System.out.println("Замовлення відсутні ");
    }
  }
}
