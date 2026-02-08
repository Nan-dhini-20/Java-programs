class Divisible4
{
    public static void main(String[] args) 
	{
        int count=0;

        for (int i=1; i<=50; i++) {
            System.out.println(i);
            if (i % 4 == 0) {
                count++;
            }
        }
        System.out.println("Count of numbers divisible by 4 = " + count);
    }
}
