public class Basket {
    public static String items = "";
    public static double totalWeight = 0;
    public static double weight = 0;

    public static void main(String[] args) {
        add("Колбаса", 76, 10);
        add("Молоко", 55, 8);
        add("Масло", 120, 9);
        add("Сыр", 220, 3);
        print("Содержимое корзины");
        clear();

    }


    public static void add(String name, int price, double weight) {
        items = items + "\n" + name + " - " + price + " Вес товара - " + weight;
        totalWeight = totalWeight + weight;
        }
    //public double getTotalWeight(){
      // this.totalWeight = totalWeight;
      //  return totalWeight;
    //}

        public static void clear () {
            items = "";
        }

        public static void print (String title){
            System.out.println(title);
            if (items.isEmpty()) {
                System.out.println("Корзина пуста");
            } else {


                System.out.println(items);
                System.out.println("Общий вес товаров " + totalWeight);
            }
            }

        }


