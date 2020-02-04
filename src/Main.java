public class Main {
    public static void main(String[] args) {

//        run program from here

        Ford ford = new Ford("focus","red",50,500);
        System.out.println(ford);

        Tesla tesla = new Tesla("Roadster","Blue",120,30000); //why is this printing out as Ford make??
        System.out.println(tesla);
        tesla.move();
        tesla.stop();
    }
}
