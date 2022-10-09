package ua.hillellit.lms.model;

import ua.hillellit.lms.model.coffee.order.CoffeeOrderBoard;

public class Main {

  public static void main(String[] args) {
    CoffeeOrderBoard board=new CoffeeOrderBoard();
    board.draw();
    board.add("Petr");
    board.add("Viktor");
    board.add("Andrew");

    board.deliver();

    board.add("Dan");
    board.add("Max");

    board.deliver(4);

    board.draw();
  }
}