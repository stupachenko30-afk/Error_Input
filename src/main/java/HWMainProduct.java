import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HWMainProduct {
    public static void main(String[] args) {
        ArrayList<HWProduct> products = new ArrayList<>();

        HWProduct pr = getHWProduct();
        products.add(pr);

        printProducts(products);
    }

    private static void printProducts(ArrayList<HWProduct> products) {
        for (HWProduct e : products) {
            System.out.println(e);
        }
    }
    private static HWProduct getHWProduct() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        HWProduct pr = null;

        try{

            System.out.print("Enter name>>>");
            String name = br.readLine();
            System.out.print("Enter Code>>>");
            String str = br.readLine();
            int code = Integer.parseInt(str);
            System.out.print("Enter Price>>>");
            str = br.readLine();
            double price = Double.parseDouble(str);
            pr = new HWProduct(name, code,price);



        } catch (IOException e) {
            System.out.println("ERROR: " + e.getClass().getSimpleName());
        }catch (NumberFormatException e){
        System.out.println("ERROR: " + e.getClass().getSimpleName());
        }
        return pr;
    }


}

