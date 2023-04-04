class Program4 {
    public static void main(String[] args){
   
    ElectricityBill e1 = new ElectricityBill("Sanjyot Belote", 250.10);
    e1.calculateBillAmount();
    System.out.println("Customer Name : "+e1.getCustomerName());
    System.out.println("Units Consumed : "+e1.getUnitsCunsumed());
    System.out.println("Bill Amount : "+e1.getBillAmount());

    }
}