package ua.hillellit.lms.model.coffee.order;

public class Order {

  private int numberOfOrder;
  private String name;

  public Order(int numberOfOrder, String name) {
    this.numberOfOrder = numberOfOrder;
    this.name = name;
  }

  public Integer getNumberOfOrder() {
    return numberOfOrder;
  }

  @Override
  public String toString() {
    return "Order{" +
        "numberOfOrder=" + numberOfOrder +
        ", name='" + name + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

}
