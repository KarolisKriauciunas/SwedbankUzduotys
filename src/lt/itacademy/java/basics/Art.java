package lt.itacademy.java.basics;

import java.util.Arrays;

public class Art {
    public void Draw(int size)
    {
        int length = 1 + size*2;
        char [][] View = new char[size+1][length];
        char a = '*';
        for (char[] row : View) Arrays.fill(row, ' ');
        int position = length/2;
        View[size][position] =a;
        int branch = 0;
        for (int i = 0; i < size; ++i)
        {
            View[i][position] = a;
            for (int j = 0; j <=branch; ++j)
            {
                View[i][position+j] = a;
                View[i][position-j] = a;
            }
            branch++;
        }
        for (int i = 0; i <= size; ++i)
        {
            System.out.println(View[i]);
        }
    }

}
