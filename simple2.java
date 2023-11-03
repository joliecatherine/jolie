public class simple2 {
        int year;
        double rate;
        long  principle;
        
    
        void getamount(int y, double r,   long p)
        {
    
            year=y;
            rate = r;
            principle=p;
        }
        void calculation()
            {
                double interest = principle * Math.pow(1 + (rate / 100), year);
                System.out.println(interest);
    
            }
    
            public static void main(String[] args) {
                
                simple2 s= new simple2();
                s.getamount(3,18, 500000);
                s.calculation();
            }
        
    
    
    }
    
