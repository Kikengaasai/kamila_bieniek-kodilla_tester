public class User {
     private String name;
     String getName(){
         return this.name;
     }

    private int age;
     int getAge(){
         return this.age;
     }

    public static void main(String[] args) {

        User kamila = new User ();
        kamila.name = "Kamila";
        kamila.age = 30;

        User kamil = new User ();
        kamil.name = "Kamil";
        kamil.age = 31;

        User nina = new User();
        nina.name = "Nina";
        nina.age = 9;

        User robert = new User();
        robert.name = "Robert";
        robert.age = 22;

        User malgorzata = new User();
        malgorzata.name = "Małgorzata";
        malgorzata.age = 52;

        User[] users = {kamila, kamil, nina, robert, malgorzata};

        int numberOfUsers= users.length;

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i];
        }

    }
}
