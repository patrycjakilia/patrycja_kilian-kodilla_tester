public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if(this.price < 1000){
            System.out.println("This notebook is very cheap.");
        }else if (this.price >= 1000 && this.price <= 3000){
            System.out.println("The price is good.");
        }else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight(){
        if(this.weight <= 600){
            System.out.println("The device is light.");
        } else if (this.weight > 600 && this.weight < 800) {
            System.out.println("The device is not very heavy");
        } else {
            System.out.println("The device is heavy");
        }
    }

    public void checkPriceandYear(){
        if (this.year >= 2024 && this.price >= 3600){
            System.out.println("Device manufactured after 2023 with a price above 3600 PLN");
        } else if (this.year > 2022 && this.year < 2024 && this.price < 3600 && this.price > 2500) {
            System.out.println("The device was manufactured in 2023 in the price range between 2500 PLN and 3600 PLN.");
        } else {
            System.out.println("Device manufactured before 2023 at a price of up to 2500 PLN");
        }
    }

}
