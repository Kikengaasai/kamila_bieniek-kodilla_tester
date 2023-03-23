public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 1992);
        System.out.println("notebook.weight:"+notebook.weight+" "+"notebook.price:"+notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000,1500, 2001);
        System.out.println("heavyNotebook.weight:"+heavyNotebook.weight+" "+"heavyNotebook.price:"+heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200,500, 2022);
        System.out.println("oldNotebook.weight:"+oldNotebook.weight+" "+"oldNotebook.price:"+oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();


    }
}