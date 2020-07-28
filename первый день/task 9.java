public class HelloWorld {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            boolean simple = true;
            for(int j = i-1; j >=2; j--)
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            if(simple)
                System.out.println(i);
        }

    }
}
