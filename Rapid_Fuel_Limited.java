import java.io.*;
import java.util.*;
class Rapid_Fuel_Limited 
{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static Calendar c=Calendar.getInstance();
    private String password,password1,password2,vn,ve,vt,vf,et,ed;
    private double petrolRate,dieselRate,gasRate,petrolTank,petrolTank1,dieselTank,dieselTank1,gasTank,gasTank1,cost,money_basis,vol,pressure1,pressure2,vm;
    private int choice;
    private long cn,bn;
    public static void main()throws Exception
    {        
        Rapid_Fuel_Limited obj=new Rapid_Fuel_Limited();
        try
        {
            FileReader fr1=new FileReader("password.txt");
            BufferedReader br1=new BufferedReader(fr1);
            obj.password=br1.readLine();
            FileReader fr2=new FileReader("petrolRate.txt");
            BufferedReader br2=new BufferedReader(fr2);
            obj.petrolRate=Double.parseDouble(br2.readLine());
            FileReader fr3=new FileReader("dieselRate.txt");
            BufferedReader br3=new BufferedReader(fr3);
            obj.dieselRate=Double.parseDouble(br3.readLine());
            FileReader fr4=new FileReader("petrolTank.txt");
            BufferedReader br4=new BufferedReader(fr4);
            obj.petrolTank=Double.parseDouble(br4.readLine());
            FileReader fr5=new FileReader("dieselTank.txt");
            BufferedReader br5=new BufferedReader(fr5);
            obj.dieselTank=Double.parseDouble(br5.readLine());
            FileReader fr6=new FileReader("gasRate.txt");
            BufferedReader br6=new BufferedReader(fr6);
            obj.gasRate=Double.parseDouble(br6.readLine());
            FileReader fr7=new FileReader("gasTank.txt");
            BufferedReader br7=new BufferedReader(fr7);
            obj.gasTank=Double.parseDouble(br7.readLine());
            FileReader fr8=new FileReader("certificateNo.txt");
            BufferedReader br8=new BufferedReader(fr8);
            obj.cn=Integer.parseInt(br8.readLine());
            FileReader fr10=new FileReader("billNo.txt");
            BufferedReader br10=new BufferedReader(fr10);
            obj.bn=Integer.parseInt(br10.readLine());
        }
        catch(FileNotFoundException x)
        {
            System.out.println("Error!! File not found!!");
        }
        System.out.println("***********Welcome to Rapid Fuel Limited***************");
        System.out.println("@@@@@@@@@@@     National Highway - 7    @@@@@@@@@@@@@@@");
        System.out.println("<<  On the way to Kempegowda International Airport >>");
        System.out.println("~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~");
        System.out.println("   Phone: 080-23454321 \t e-mail: rapid@outlook.com");
        System.out.println("");
        System.out.println("   Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        int ch=0;
        do
        {            
            System.out.println("   #################################################### ");
            System.out.println();
            System.out.println("                    ***MAIN  MENU***                     ");
            System.out.println("                1. Customer(To purchase).                ");
            System.out.println("                2. Owner(To Update).                     ");
            System.out.println("                3. Exit.                                 ");
            System.out.println("");
            System.out.print("                Please enter your choice: ");                                 
            try
            {
                ch=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1:
                    System.out.print("\f");
                    obj.customer();
                    for(int i=0 ; i<20000 ; i++);
                    break;
                    case 2:
                    System.out.print("\f");
                    obj.owner();
                    for(int i=0 ; i<20000 ; i++);
                    break;
                    case 3:
                    for(int i=0 ; i<20000 ; i++);
                    System.out.print("\f");
                    obj.exit();                                        
                    break;
                    default:
                    System.out.println("                Invalid Input");
                    break;
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("\t\tSorry!! Please enter a valid number!!");
            }            
        }while(ch!=3);
    }

    public void customer()throws Exception
    {
        int ch=0;
        do
        {            
            System.out.println("   #################################################### ");
            System.out.println();
            System.out.println("                    ***  MENU  ***                      ");
            System.out.println("                1. Petrol.                              ");
            System.out.println("                2. Diesel.                              ");
            System.out.println("                3. Auto gas/LPG.                        ");
            System.out.println("                4. Air check up.                        ");           
            System.out.println("                5. Smoke Emission Test                  ");
            System.out.println("                6. Motor oil and lubricants                  ");
            System.out.println("                7. Go back                                 ");
            System.out.println("");
            System.out.print("                Please enter your choice: ");
            try
            {
                ch=Integer.parseInt(br.readLine());
                FileWriter fout16=new FileWriter("billNo.txt");
                BufferedWriter bout16=new BufferedWriter(fout16);
                PrintWriter pout16=new PrintWriter(bout16);
                bn+=1;
                pout16.print(bn);
                pout16.close();
                bout16.close();
                fout16.close();
                switch(ch)
                {
                    case 1:
                    if(petrolTank>100)
                    {
                        System.out.print("\f");
                        System.out.println("              Petrol price per unit litre = Rs "+petrolRate                      );
                        System.out.println("                    ***  MENU  ***                      ");
                        System.out.println("                1. Buy petrol on the basis of money.                              ");
                        System.out.println("                2. Buy petrol on the basis of volume.                             ");
                        System.out.println("                3. Go Back.                                                       ");
                        System.out.print("                  Please enter your choice: ");
                        try
                        {
                            choice=Integer.parseInt(br.readLine());
                            System.out.println();
                            switch(choice)
                            {
                                case 1:
                                System.out.print("                Please enter the amount in rupees: ");
                                money_basis=Double.parseDouble(br.readLine());
                                vol=money_basis/petrolRate;
                                cost=vol*petrolRate;
                                System.out.print("                The tank has been successfully filled....... ");
                                FileWriter fout8=new FileWriter("petrolTank.txt");
                                BufferedWriter bout8=new BufferedWriter(fout8);
                                PrintWriter pout8=new PrintWriter(bout8);
                                petrolTank-=Math.round(vol*100.0)/100.0;
                                pout8.print(petrolTank);
                                pout8.close();
                                bout8.close();
                                fout8.close();
                                System.out.println("\f");
                                System.out.println("=========================================================");
                                System.out.println("========================================================= ");
                                System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                                System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                                System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                                System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");           
                                System.out.println(" Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                                System.out.println(" Bill no           : "+bn                                 );
                                System.out.println(" TIN               : 21324354657                              ");
                                System.out.println("                                                         ");
                                System.out.println(" Fuel type         : Petrol                                                       ");
                                System.out.println(" Pump no           : 1                              ");
                                System.out.println(" Volume            : "+Math.round(vol*100.0)/100.0+" l"                              );
                                System.out.println(" Unit price        : Rs "+petrolRate                              );
                                System.out.println(" Amount            : Rs "+(int)cost                                      );
                                System.out.println("=========================================================");
                                System.out.println("=========================================================");
                                br.readLine();
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                case 2:
                                System.out.print("                Please enter the quantity in litres: ");
                                vol=Double.parseDouble(br.readLine());
                                cost=vol*petrolRate;
                                System.out.print("                The tank has been successfully filled....... ");
                                FileWriter fout9=new FileWriter("petrolTank.txt");
                                BufferedWriter bout9=new BufferedWriter(fout9);
                                PrintWriter pout9=new PrintWriter(bout9);
                                petrolTank-=Math.round(vol*100.0)/100.0;
                                pout9.print(petrolTank);
                                pout9.close();
                                bout9.close();
                                fout9.close();
                                System.out.println("\f");
                                System.out.println("=========================================================");
                                System.out.println("========================================================= ");
                                System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                                System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                                System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                                System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");           
                                System.out.println(" Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                                System.out.println(" Bill no           : "+bn                                 );
                                System.out.println(" TIN               : 21324354657                              ");
                                System.out.println("                                                         ");
                                System.out.println(" Fuel type         : Petrol                                                       ");
                                System.out.println(" Pump no           : 1                              ");
                                System.out.println(" Volume            : "+Math.round(vol*100.0)/100.0+" l"                              );
                                System.out.println(" Unit price        : Rs "+petrolRate                              );
                                System.out.println(" Amount            : Rs "+(int)cost                                      );
                                System.out.println("=========================================================");
                                System.out.println("=========================================================");
                                br.readLine();
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                case 3:
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                default:
                                System.out.println("                Invalid Input");
                                for(int i=0 ; i<20000 ; i++);
                                break;
                            }
                        }catch(NumberFormatException e)
                        {
                            System.out.println("\t\tSorry!! Please enter a valid number!!");
                        }
                    }
                    else
                        System.out.println("\t\t\t\tSorry!!! There is a shortage of fuel.We shall try to fill the tank as soon as possible.");
                    for(int i=0 ; i<20000 ; i++);
                    break;
                    case 2:
                    if(dieselTank>100)
                    {
                        System.out.print("\f");
                        System.out.println("              Diesel price per unit litre = Rs "+dieselRate                      );
                        System.out.println("                    ***  MENU  ***                      ");
                        System.out.println("                1. Buy diesel on the basis of money.                              ");
                        System.out.println("                2. Buy diesel on the basis of volume.                             ");
                        System.out.println("                3. Go Back.                                                       ");
                        System.out.print("                  Please enter your choice: ");
                        try
                        {
                            choice=Integer.parseInt(br.readLine());
                            System.out.println();
                            switch(choice)
                            {
                                case 1:
                                System.out.print("                Please enter the amount in rupees: ");
                                money_basis=Double.parseDouble(br.readLine());
                                vol=money_basis/dieselRate;
                                cost=vol*dieselRate;
                                System.out.print("                The tank has been successfully filled....... ");
                                FileWriter fout10=new FileWriter("dieselTank.txt");
                                BufferedWriter bout10=new BufferedWriter(fout10);
                                PrintWriter pout10=new PrintWriter(bout10);
                                dieselTank-=Math.round(vol*100.0)/100.0;
                                pout10.print(dieselTank);
                                pout10.close();
                                bout10.close();
                                fout10.close();
                                System.out.println("\f");
                                System.out.println("=========================================================");
                                System.out.println("========================================================= ");
                                System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                                System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                                System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                                System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");           
                                System.out.println(" Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                                System.out.println(" Bill no           : "+bn                                 );
                                System.out.println(" TIN               : 21324354657                              ");
                                System.out.println("                                                         ");
                                System.out.println(" Fuel type         : Diesel                                                       ");
                                System.out.println(" Pump no           : 2                              ");
                                System.out.println(" Volume            : "+Math.round(vol*100.0)/100.0+" l"                              );
                                System.out.println(" Unit price        : Rs "+dieselRate                              );
                                System.out.println(" Amount            : Rs "+(int)cost                                      );
                                System.out.println("=========================================================");
                                System.out.println("=========================================================");
                                br.readLine();
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                case 2:
                                System.out.print("                Please enter the quantity in litres: ");
                                vol=Double.parseDouble(br.readLine());
                                cost=vol*dieselRate;
                                System.out.print("                The tank has been successfully filled....... ");
                                FileWriter fout11=new FileWriter("dieselTank.txt");
                                BufferedWriter bout11=new BufferedWriter(fout11);
                                PrintWriter pout11=new PrintWriter(bout11);
                                dieselTank-=Math.round(vol*100.0)/100.0;
                                pout11.print(dieselTank);
                                pout11.close();
                                bout11.close();
                                fout11.close();
                                System.out.println("\f");
                                System.out.println("=========================================================");
                                System.out.println("========================================================= ");
                                System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                                System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                                System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                                System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");           
                                System.out.println(" Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                                System.out.println(" Bill no           : "+bn                                 );
                                System.out.println(" TIN               : 21324354657                              ");
                                System.out.println("                                                         ");
                                System.out.println(" Fuel type         : Diesel                                                       ");
                                System.out.println(" Pump no           : 2                              ");
                                System.out.println(" Volume            : "+Math.round(vol*100.0)/100.0+" l"                              );
                                System.out.println(" Unit price        : Rs "+dieselRate                              );
                                System.out.println(" Amount            : Rs "+(int)cost                                      );
                                System.out.println("=========================================================");
                                System.out.println("=========================================================");
                                br.readLine();
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                case 3:
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                default:
                                System.out.println("                Invalid Input");
                                for(int i=0 ; i<20000 ; i++);
                                break;
                            }
                        }catch(NumberFormatException e)
                        {
                            System.out.println("\t\tSorry!! Please enter a valid number!!");
                        }
                    }
                    else
                        System.out.println("\t\t\t\tSorry!!! There is a shortage of fuel.We shall try to fill the tank as soon as possible.");
                    for(int i=0 ; i<20000 ; i++);
                    break;
                    case 3:
                    if(gasTank>100)
                    {
                        System.out.print("\f");
                        System.out.println("              Auto gas price per unit litre = Rs "+gasRate                      );
                        System.out.println("                    ***  MENU  ***                      ");
                        System.out.println("                1. Buy Auto gas/LPG on the basis of money.                              ");
                        System.out.println("                2. Buy Auto gas/LPG on the basis of volume.                             ");
                        System.out.println("                3. Go Back.                             ");
                        System.out.print("                  Please enter your choice: ");
                        try
                        {
                            choice=Integer.parseInt(br.readLine());
                            System.out.println();
                            switch(choice)
                            {
                                case 1:
                                System.out.print("                Please enter the amount in rupees: ");
                                money_basis=Double.parseDouble(br.readLine());
                                vol=money_basis/gasRate;
                                cost=vol*gasRate;
                                System.out.print("                The tank has been successfully filled....... ");
                                FileWriter fout12=new FileWriter("gasTank.txt");
                                BufferedWriter bout12=new BufferedWriter(fout12);
                                PrintWriter pout12=new PrintWriter(bout12);
                                gasTank-=Math.round(vol*100.0)/100.0;
                                pout12.print(gasTank);
                                pout12.close();
                                bout12.close();
                                fout12.close();
                                System.out.println("\f");
                                System.out.println("=========================================================");
                                System.out.println("========================================================= ");
                                System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                                System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                                System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                                System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");           
                                System.out.println(" Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                                System.out.println(" Bill no           : "+bn                                 );
                                System.out.println(" TIN               : 21324354657                              ");
                                System.out.println("                                                         ");
                                System.out.println(" Fuel type         : Auto gas/ LPG                                                       ");
                                System.out.println(" Pump no           : 3                              ");
                                System.out.println(" Volume            : "+Math.round(vol*100.0)/100.0+" l"                              );
                                System.out.println(" Unit price        : Rs "+gasRate                              );
                                System.out.println(" Amount            : Rs "+(int)cost                                      );
                                System.out.println("=========================================================");
                                System.out.println("=========================================================");
                                br.readLine();
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                case 2:
                                System.out.print("                Please enter the quantity in litres: ");
                                vol=Double.parseDouble(br.readLine());
                                cost=vol*gasRate;
                                System.out.print("                The tank has been successfully filled....... ");
                                FileWriter fout13=new FileWriter("gasTank.txt");
                                BufferedWriter bout13=new BufferedWriter(fout13);
                                PrintWriter pout13=new PrintWriter(bout13);
                                gasTank-=Math.round(vol*100.0)/100.0;
                                pout13.print(gasTank);
                                pout13.close();
                                bout13.close();
                                fout13.close();
                                System.out.println("\f");
                                System.out.println("=========================================================");
                                System.out.println("========================================================= ");
                                System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                                System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                                System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                                System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");           
                                System.out.println(" Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                                System.out.println(" Bill no           : "+bn                                 );
                                System.out.println(" TIN               : 21324354657                              ");
                                System.out.println("                                                         ");
                                System.out.println(" Fuel type         : Auto gas/ LPG                                                       ");
                                System.out.println(" Pump no           : 3                              ");
                                System.out.println(" Volume            : "+Math.round(vol*100.0)/100.0+" l"                              );
                                System.out.println(" Unit price        : Rs "+gasRate                              );
                                System.out.println(" Amount            : Rs "+(int)cost                                      );
                                System.out.println("=========================================================");
                                System.out.println("=========================================================");
                                br.readLine();
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                case 3:
                                for(int i=0 ; i<20000 ; i++);
                                break;
                                default:
                                System.out.println("                Invalid Input");
                                for(int i=0 ; i<20000 ; i++);
                                break;
                            }
                        }catch(NumberFormatException e)
                        {
                            System.out.println("\t\tSorry!! Please enter a valid number!!");
                        }
                    }
                    else
                        System.out.println("\t\t\t\tSorry!!! There is a shortage of fuel.We shall try to fill the tank as soon as possible.");
                    for(int i=0 ; i<20000 ; i++);
                    break;
                    case 4:
                    System.out.print("\f");
                    System.out.println("                    ***  MENU  ***                      ");
                    System.out.println("                1. Normal air.                              ");
                    System.out.println("                2. Nitrogen.                             ");
                    System.out.println("                3. Go back.                             ");
                    System.out.print("                Please enter your choice : ");
                    try
                    {
                        choice=Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                            case 1:
                            System.out.print("                Please enter the pressure of the front tyre in psi: ");
                            pressure1=Double.parseDouble(br.readLine());
                            System.out.print("                Please enter the pressure of the rear tyre in psi: ");
                            pressure2=Double.parseDouble(br.readLine());
                            System.out.print("                The pressure of the tyre has been successfully checked....... ");                                
                            for(int i=0 ; i<20000 ; i++);
                            break;
                            case 2:
                            System.out.print("                Please enter the pressure of the front tyre in psi: ");
                            pressure1=Double.parseDouble(br.readLine());
                            System.out.print("                Please enter the pressure of the rear tyre in psi: ");
                            pressure2=Double.parseDouble(br.readLine());
                            System.out.print("                The pressure of the tyre has been successfully checked....... ");
                            for(int i=0 ; i<20000 ; i++);
                            break;
                            case 3:
                            for(int i=0 ; i<20000 ; i++);
                            break;
                            default:
                            System.out.println("                Invalid Input");
                            for(int i=0 ; i<20000 ; i++);
                            break;
                        }
                    }catch(NumberFormatException e)
                    {
                        System.out.println("\t\tSorry!! Please enter a valid number!!");
                    }                                                            
                    for(int i=0 ; i<20000 ; i++);
                    break;
                    case 5:
                    System.out.print("\f");
                    FileWriter fout15=new FileWriter("certificateNo.txt");
                    BufferedWriter bout15=new BufferedWriter(fout15);
                    PrintWriter pout15=new PrintWriter(bout15);
                    cn++;
                    pout15.print(cn);
                    pout15.close();
                    bout15.close();
                    fout15.close();
                    System.out.print("\t\tPlease enter the Vehicle No : ");
                    vn=br.readLine();
                    System.out.println();

                    System.out.print("\t\tPlease enter the Vehicle type : ");
                    vt=br.readLine();
                    System.out.println();
                    System.out.print("\t\tPlease enter the type of engine : ");
                    ve=br.readLine();
                    System.out.println();
                    System.out.print("\t\tPlease enter the type of fuel : ");
                    vf=br.readLine();
                    System.out.println();
                    System.out.print("\t\tPlease enter the meter reading in km: ");
                    vm=Double.parseDouble(br.readLine());
                    System.out.println();
                    ed=c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR)+1);
                    FileWriter fout14=new FileWriter("emissionTest.txt",true);
                    BufferedWriter bout14=new BufferedWriter(fout14);
                    PrintWriter pout14=new PrintWriter(bout14);                    
                    pout14.println(cn+"@"+vn+"@"+vt+"@"+vf+"@"+vm+"@"+ed);
                    pout14.close();
                    bout14.close();
                    fout14.close();
                    System.out.print("\f");
                    System.out.println("=========================================================");
                    System.out.println("========================================================= ");
                    System.out.println(" @@@@@@@@@@@   EMISSION TEST CERTIFICATE     @@@@@@@@@@@ ");
                    System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                    System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                    System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                    System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");           
                    System.out.println(" Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                    System.out.println("                                                         ");
                    System.out.println(" Certificate number: "+cn+"                              ");
                    System.out.println(" Vehicle  number   : "+vn+"                              ");
                    System.out.println(" Vehicle type      : "+vt+"                              ");
                    System.out.println(" Engine type       : "+ve+"                              ");
                    System.out.println(" Fuel type         : "+vf+"                              ");
                    System.out.println(" Meter reading     : "+vm+"                              ");
                    System.out.println(" Valid upto        : "+ed+"                              ");
                    System.out.println(" Test Result:                                                        ");
                    System.out.println("                                                         ");
                    System.out.println(" Component    Prescribed Std     Measured Level    Unit                                                     ");
                    System.out.println("    CO              3.5                                         ");
                    System.out.println("    HC              4500                                         ");
                    System.out.println("                                                         ");
                    System.out.println("                                                         ");
                    System.out.println("                                                         ");
                    System.out.println(" Authorised signature and seal of testing station        ");
                    System.out.println("=========================================================");
                    System.out.println("=========================================================");
                    br.readLine();
                    for(int i=0 ; i<20000 ; i++);
                    break;
                    case 6:
                    System.out.print("\f");                    
                    String items[]=new String[22];
                    items[1]=" Castrol EDGE                       ";
                    items[2]=" Castrol MAGNETIC                   ";
                    items[3]=" Castrol GTX                        ";
                    items[4]=" Castrol ATF DEX II                 ";
                    items[5]=" Castrol GTD                        ";
                    items[6]=" Castrol MARUTI GENUINE OIL         ";
                    items[7]=" Castrol POWER1                     ";
                    items[8]=" Castrol ACTIV                      ";
                    items[9]=" Castrol GO!                        ";
                    items[10]="Castrol CRB                        ";
                    items[11]="Castrol TECTION                    ";
                    items[12]="Castrol RX                         ";
                    items[13]="Castrol RADICOOL HEAVY DUTY COOLANT";
                    items[14]="Castrol COOLANT                    ";
                    items[15]="Castrol MANUAL GL4 80W 90          ";
                    items[16]="Castrol MANUAL GL 4 90             ";
                    items[17]="Castrol TH 46                      ";
                    items[18]="Castrol DIESEL OIL PUMPSET         ";
                    items[19]="Castrol AXLE 140                   ";
                    items[20]="Castrol PREMIUM FORMULA GEL(1 kg)  ";
                    items[21]="Castrol PREMIUM LONG LIFE GREASE(1 kg)";

                    double cost[]={1100,600,600,890,985,750,1550,900,850,1100,730,690,1400,800,840,860,900,800,1550,325,500};
                    System.out.println("Number          Item(unit litre)\t\t\tCost(Rs)");
                    for(int i=1;i<21;i++)
                        System.out.println(i+"          "+items[i]+"\t\t"+cost[i]);
                    System.out.println();
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Enter the item number as ZERO(0) to terminate.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    int c=0,num=1;
                    int t=0;
                    int list[]=new int[20];
                    double totalAmt=0,amt=0;
                    try
                    {
                        do
                        {
                            System.out.println("Enter the item number:");
                            c=Integer.parseInt(br.readLine());
                            if(c!=0)
                            {
                                System.out.println("Enter the number of items:");
                                num=Integer.parseInt(br.readLine());
                                amt=cost[c]*num;
                                totalAmt+=amt;
                                list[t]=c;
                                t++;
                            }
                        }while(c!=0&&c<=21);
                    }
                    catch(ArrayIndexOutOfBoundsException e2)
                    {
                        System.out.println("No such product exists");
                    }    
                    System.out.println("$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^$^");
                    System.out.println("Here are the selected items:");
                    System.out.println();
                    for(int h=0;h<20;h++)
                    {
                        if(list[h]!=0)
                            System.out.println(items[list[h]]);
                    }
                    for(int i=0 ; i<20000 ; i++);

                    System.out.println("=========================================================");
                    System.out.println("========================================================= ");
                    System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                    System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                    System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                    System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");                               
                    System.out.println(" Bill no           : "+bn                                 );
                    System.out.println(" TIN               : 21324354657                              ");
                    System.out.println(" Vehicle accessories                                                        ");                                        
                    System.out.println(" Amount            : Rs "+totalAmt                                      );
                    System.out.println("=========================================================");
                    System.out.println("=========================================================");
                    br.readLine();
                    break;
                    case 7:
                    System.out.print("\f");
                    for(int i=0 ; i<20000 ; i++);
                    break;
                    default:
                    System.out.println("                Invalid Input");
                    for(int i=0 ; i<20000 ; i++);
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("\t\tSorry!! Please enter a valid number!!");
            }            
        }while(ch!=7);
        return;
    }

    public void owner()throws Exception
    {
        System.out.print("                Please Enter the Password: ");
        String pass=br.readLine();
        System.out.print("\f");
        if(pass.equals(password))
        {
            int ch=0;
            do
            {            
                if(petrolTank<100)                
                    System.out.println("   Warning!!! Volume of the petrol tank is below 100.                            ");
                if(dieselTank<100)                    
                    System.out.println("   Warning!!! Volume of the diesel tank is below 100.                            ");
                if(gasTank<100)
                    System.out.println("   Warning!!! Volume of the Auto gas tank is below 100.                            ");
                System.out.println("   #################################################### ");
                System.out.println();
                System.out.println("                    ***  MENU  ***                      ");
                System.out.println("                1. Tank Filling.                              ");
                System.out.println("                2. Updating the costs.                              ");
                System.out.println("                3. Check the fuel content.                        ");
                System.out.println("                4. Change the password.                        ");                       
                System.out.println("                5. Emission Test Record                                 ");
                System.out.println("                6. Go back                                 ");
                System.out.println("");
                System.out.print("                Please enter your choice: ");                                 
                try
                {
                    ch=Integer.parseInt(br.readLine());
                    switch(ch)
                    {
                        case 1:
                        do
                        {
                            {
                                System.out.print("\f");
                                System.out.println("   #################################################### ");
                                System.out.println();
                                System.out.println("                    ***  MENU  ***                      ");
                                System.out.println("                1. Petrol.                              ");
                                System.out.println("                2. Diesel.                              ");
                                System.out.println("                3. Auto gas/LPG.                        ");
                                System.out.println("                4. Go Back.                        ");
                                System.out.print("                Please enter your choice: ");
                                try
                                {
                                    choice=Integer.parseInt(br.readLine());
                                    System.out.println();
                                    switch(choice)
                                    {
                                        case 1:                                        
                                        {
                                            System.out.print("                Please enter the quantity in litres: ");
                                            petrolTank1=Double.parseDouble(br.readLine());
                                            System.out.print("                The tank has been successfully filled....... ");
                                            FileWriter fout2=new FileWriter("petrolTank.txt");
                                            BufferedWriter bout2=new BufferedWriter(fout2);
                                            PrintWriter pout2=new PrintWriter(bout2);
                                            petrolTank+=petrolTank1;
                                            pout2.print(petrolTank);
                                            pout2.close();
                                            bout2.close();
                                            fout2.close();
                                        }    
                                        for(int i=0 ; i<20000 ; i++);
                                        break;
                                        case 2:
                                        System.out.print("                Please enter the quantity in litres: ");
                                        dieselTank1=Double.parseDouble(br.readLine());
                                        System.out.print("                The tank has been successfully filled....... ");
                                        FileWriter fout3=new FileWriter("dieselTank.txt");
                                        BufferedWriter bout3=new BufferedWriter(fout3);
                                        PrintWriter pout3=new PrintWriter(bout3);
                                        dieselTank+=dieselTank1;
                                        pout3.print(dieselTank);
                                        pout3.close();
                                        bout3.close();
                                        fout3.close();
                                        for(int i=0 ; i<20000 ; i++);
                                        break;
                                        case 3:
                                        System.out.print("                Please enter the quantity in litres: ");
                                        gasTank1=Double.parseDouble(br.readLine());
                                        System.out.print("                The tank has been successfully filled....... ");
                                        FileWriter fout4=new FileWriter("gasTank.txt");
                                        BufferedWriter bout4=new BufferedWriter(fout4);
                                        PrintWriter pout4=new PrintWriter(bout4);
                                        gasTank+=gasTank1;
                                        pout4.print(gasTank);
                                        pout4.close();
                                        bout4.close();
                                        fout4.close();
                                        for(int i=0 ; i<20000 ; i++);
                                        break;
                                        case 4:
                                        for(int i=0 ; i<20000 ; i++);                                                                                                                                            
                                        break;
                                        default:
                                        System.out.println("                Invalid Input");
                                        for(int i=0 ; i<20000 ; i++);
                                        break;
                                    }
                                }catch(NumberFormatException e)
                                {
                                    System.out.println("\t\tSorry!! Please enter a valid number!!");
                                }
                            }
                        }while(choice!=4);
                        case 2:                       
                        {
                            System.out.print("\f");
                            System.out.println("   #################################################### ");
                            System.out.println();
                            System.out.println("                    ***  MENU  ***                      ");
                            System.out.println("                1. Petrol.                              ");
                            System.out.println("                2. Diesel.                              ");
                            System.out.println("                3. Auto gas/LPG.                        ");
                            System.out.println("                4. Go Back.                        ");
                            System.out.print("                Please enter your choice: ");
                            try
                            {
                                choice=Integer.parseInt(br.readLine());
                                System.out.println();
                                switch(choice)
                                {
                                    case 1:
                                    System.out.print("                Please enter the new rate in rupees : ");
                                    petrolRate=Double.parseDouble(br.readLine());
                                    System.out.print("                The rate has been successfully updated....... ");
                                    FileWriter fout5=new FileWriter("petrolRate.txt");
                                    BufferedWriter bout5=new BufferedWriter(fout5);
                                    PrintWriter pout5=new PrintWriter(bout5);
                                    petrolRate=petrolRate;
                                    pout5.print(petrolRate);
                                    pout5.close();
                                    bout5.close();
                                    fout5.close();
                                    for(int i=0 ; i<20000 ; i++);
                                    break;
                                    case 2:
                                    System.out.print("                Please enter the new rate in rupees : ");
                                    dieselRate=Double.parseDouble(br.readLine());
                                    System.out.print("                The rate has been successfully updated....... ");
                                    FileWriter fout6=new FileWriter("dieselRate.txt");
                                    BufferedWriter bout6=new BufferedWriter(fout6);
                                    PrintWriter pout6=new PrintWriter(bout6);
                                    dieselRate=dieselRate;
                                    pout6.print(dieselRate);
                                    pout6.close();
                                    bout6.close();
                                    fout6.close();
                                    for(int i=0 ; i<20000 ; i++);
                                    break;
                                    case 3:
                                    System.out.print("                Please enter the new rate in rupees : ");
                                    gasRate=Double.parseDouble(br.readLine());
                                    System.out.print("                The rate has been successfully updated....... ");
                                    FileWriter fout7=new FileWriter("gasRate.txt");
                                    BufferedWriter bout7=new BufferedWriter(fout7);
                                    PrintWriter pout7=new PrintWriter(bout7);
                                    gasRate=gasRate;
                                    pout7.print(gasRate);
                                    pout7.close();
                                    bout7.close();
                                    fout7.close();
                                    for(int i=0 ; i<20000 ; i++);
                                    break;
                                    case 4:
                                    for(int i=0 ; i<20000 ; i++);                                                                                               
                                    break;
                                    default:
                                    System.out.println("                Invalid Input");
                                    for(int i=0 ; i<20000 ; i++);
                                    break;
                                }
                            }catch(NumberFormatException e)
                            {
                                System.out.println("\t\tSorry!! Please enter a valid number!!");
                            }
                        }
                        for(int i=0 ; i<20000 ; i++);
                        break;
                        case 3:
                        System.out.print("\f");
                        System.out.println("Fuel Type\t\tContent(in litres)");
                        System.out.println("Petrol   \t\t"+Math.round(petrolTank*100.0)/100.0);
                        System.out.println("Diesel   \t\t"+Math.round(dieselTank*100.0)/100.0);
                        System.out.println("Auto gas \t\t"+Math.round(gasTank*100.0)/100.0);
                        for(int i=0 ; i<20000 ; i++);
                        break;
                        case 4:
                        System.out.print("\f");
                        System.out.print("                Please Enter the present password: ");
                        pass=br.readLine();
                        if(pass.equals(password))
                        {
                            System.out.print("                Please Enter the new password: ");
                            password1=br.readLine();
                            System.out.print("                Please Retype the new password: ");
                            password2=br.readLine();
                            if(password1.equalsIgnoreCase(password2))
                            {
                                System.out.println("              Your Password has been successfully  changed.......");
                                FileWriter fout1=new FileWriter("password.txt");
                                BufferedWriter bout1=new BufferedWriter(fout1);
                                PrintWriter pout1=new PrintWriter(bout1);
                                pout1.print(password1);
                                pout1.close();
                                bout1.close();
                                fout1.close();
                                password=password1;
                            }
                            else
                                System.out.println("              The passwords do not match!!!!!!");
                        }
                        else
                            System.out.println("\t\tSorry WRONG Password");
                        for(int i=0 ; i<20000 ; i++);                                                                                    
                        break;
                        case 5:
                        System.out.print("\f");
                        System.out.println("=========================================================");
                        System.out.println("========================================================= ");
                        System.out.println(" @@@@@@@@@@@     EMISSION TEST RECORDS     @@@@@@@@@@@ ");
                        System.out.println(" ***********      Rapid Fuel Limited     *************** ");
                        System.out.println(" <<  On the way to Kempegowda International Airport >>   ");
                        System.out.println(" ~~~~~~~~~~~~~ Yelahanka, Bengaluru-560064~~~~~~~~~~~~~  ");
                        System.out.println(" Phone: 080-23454321          e-mail: rapid@outlook.com  ");           
                        System.out.println(" Date :- "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+(c.get(Calendar.YEAR))+"\t\t\tTime :- "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
                        System.out.println("                                                        ");
                        System.out.println(" Certificate No\t\tVehicle No\t\tVehicle type\t\tFuel\t\tMeter reading\tValid upto");                        
                        FileReader fr9=new FileReader("emissionTest.txt");
                        BufferedReader br9=new BufferedReader(fr9);
                        File f = new File("emissionTest.txt");
                        RandomAccessFile r = new RandomAccessFile(f,"rw");
                        while(br9.readLine()!=null)
                        {
                            System.out.println();
                            StringTokenizer st = new StringTokenizer(r.readLine(),"@");
                            while(st.hasMoreTokens())
                            {
                                for(int i=0;i<6;i++)
                                    System.out.print("\t"+st.nextToken()+"\t");                            
                            }
                        }                            
                        fr9.close();
                        br9.close();
                        br.readLine();
                        for(int i=0 ; i<20000 ; i++);
                        break;
                        case 6:
                        System.out.print("\f");
                        for(int i=0 ; i<20000 ; i++);
                        break;
                        default:
                        System.out.println("                Invalid Input");
                        break;
                    }
                }
                catch(NumberFormatException e)
                {
                    System.out.println("\t\tSorry!! Please enter a valid number!!");
                }            
            }while(ch!=6);
            return;
        }
        else
            System.out.println("\t\tSorry WRONG Password");
    }

    public void exit()throws Exception
    {
        FileWriter fout17=new FileWriter("billNo.txt");
        BufferedWriter bout17=new BufferedWriter(fout17);
        PrintWriter pout17=new PrintWriter(bout17);
        bn-=1;
        pout17.print(bn);
        pout17.close();
        bout17.close();
        fout17.close();
        System.out.println("```````````` Thank You ```````````````````````````````````````````````````");
        System.out.println("```````````` Visit Again `````````````````````````````````````````````````");
        System.out.println();
        System.out.println();
        System.out.println("@@@@@@@@@@@@ Program By @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("```````````` Bansuri J Sanganal ``````````````````````````````````````````");
        System.out.println("```````````` ````` X```````````````````````````````````````````````````````");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("```````````` Daffodils School`````````````````````````````````````");
        System.out.println("##########################################################################");
    }
}    
