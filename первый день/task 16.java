public class test {

    public static void main(String[] args) {
        int cnt = 0;
       for(int i = 0; i <= 30; ++i){
           String str = Integer.toString(i);
           char[] arr = str.toCharArray();
           for(int j = 0; j < arr.length;++j)
               if(arr[j]=='2'){
                   cnt++;
                   break;
               }
       }
        System.out.println(cnt);

    }

}
