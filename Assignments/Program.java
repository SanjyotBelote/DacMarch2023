class Program2{
    public static void main(String[] args)
    {
       BMI b1 = new BMI();
       Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter height : ");
        b1.setHeight(sc.nextDouble());
        double height = b1.getHeihght();

        System.out.print("Enter weight : ");
        b1.setWeight(sc.nextDouble());
        double weight = b1.getWeight();

        b1.calculateBMI();
   

    }
}