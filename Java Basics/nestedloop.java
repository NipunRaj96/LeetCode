// public class nestedloop 
// {
//     public static void main(String[] args) 
//     {
//         for (int i = 1; i<=5 ; i++)
//         {
//             for (int j = 0; j <= 10; j++) 
//             {
//                 System.out.print(j+" ");    
//             } 
//             System.out.println();           
//         }
//     }
// }

// loop under a loop is nested loop 
// first loop specifies how manny times to print 2 loop
// 2 loop print the expression

public class nestedloop 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i<=5 ; i++)
        {
            for (int j = 0; j < i; j++) 
            {
                System.out.print(j+" ");    
            } 
            System.out.println();           
        }
    }
}