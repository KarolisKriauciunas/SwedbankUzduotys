package lt.itacademy.java.basics;

public class loops {
    public static void main(String[] args) {
        Integer Answer1 =  0;
        Integer Answer2 =  0;
        Integer days = 365;
        Answer1 = GetHours(days);
        Answer2 = GetMinutes(days);
        System.out.println(Answer1+" HOURS "+ Answer2 + " MINUTES");
        Integer Answer3  = GetFactorial(5);
        System.out.println(Answer3);
    }
    public static Integer GetHours(int days)
    {
        Integer sum = 0;
        for (int i = 1 ; i <= days; ++i)
        {
            sum+=24;
        }
        return sum;
    }
    public static Integer GetMinutes(int days)
    {
        Integer sum = 0;
        for (int i = 1 ; i <= days; ++i)
        {
            sum+=24*60;
        }
        return sum;
    }
    public static Integer GetFactorial(int num)
    {
        int[] A = new int[num+1];
        A[1] = 1;
        A[2] = 2;
        for(int i = 3; i <= num;++i)A[i]=A[i-1]*i;
        return A[num];
    }


}
