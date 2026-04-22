public class Arraycreation{
    public static void main(Teststring a[])
    {


        // int nums[]={3,5,8,9,2,1};     // Assigning value direct//
        // nums[1]= 0;                  // index of arrays//
        // System.out.println(nums[1]);   //printing array values through index //
        int nums[]= new int[4];    // second method : arrays sizes is fixed//
        nums[0]=3;    // values filled maunally//
        nums[1]=5;
        nums[2]=8;
        nums[3]=9;
        nums[2]=2;
        for(int i=0;i<4; i++)
        {
            System.out.println(nums[i]);
        }
    }
}