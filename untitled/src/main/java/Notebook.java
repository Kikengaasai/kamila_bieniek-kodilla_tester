public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook (int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000){
            System.out.println("The price is good");
        }else {
            System.out.println("This notebook is expensive ");
        }

    }
    public void checkWeight() {
        if (this.weight < 500) {
            System.out.println("This device is lightweight.");
        } else if (this.weight >= 500 && this.weight <= 1000){
            System.out.println("This device is not very heavy.");
        }else {
            System.out.println("This device is heavy.");
        }
    }

    public void checkYearAndPrice(){
        if(this.year < 2000 && this.price > 1000){
            System.out.println("Stary ale jary");
        } else if (this.year >= 2000 && this.price < 2500){
            System.out.println("Kupuj, ani sie nie zastanawiaj");
        } else {
            System.out.println("Zastanow sie nad wyborem");
        }
    }
}