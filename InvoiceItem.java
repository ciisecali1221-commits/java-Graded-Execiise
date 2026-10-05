public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private  double uniprice;

    public InvoiceItem(String id, String desc, int qty, double uniprice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.uniprice=uniprice;
    }
    //getters
    public  String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public double getUniprice(){
        return uniprice;
    }
    //setter
    public void setQty(int qty){
        this.qty=qty;
    }
    public void setUniprice(double uniprice){
        this.uniprice=uniprice;
    }
    public  double getTotal(){
        return  uniprice*qty;
    }
    public String toString() {
        return "InvoiceItem:" + "\tID: " + id + "\tDSC:" + desc + "\tQuentity" + qty + "\tunitprice" + uniprice;

        //

    }

    public static void main(String[] args) {
        InvoiceItem I1=new InvoiceItem("4", "25%",7,23.4);
        System.out.println(I1);//to string
        //test setters and getters
        I1.setQty(13);
        System.out.println("Quantity " + I1.getQty());
        System.out.println("Descount " + I1.getDesc());

    }



    }
