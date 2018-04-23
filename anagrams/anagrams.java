import java.util.HashMap;


class Anagram{

    HashMap<Character,Integer> lprimes=new HashMap<Character,Integer>();      
    int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    public boolean isAnagram(char[] a, char[] b){
        int hash = 0, i=0;
        long multa = 1, multb=1;
        for(char alphabet = 'a'; alphabet <='z'; alphabet++){ // populate hashmap prime => letter (a-z)
            this.lprimes.put(alphabet,this.primes[hash]);  
            System.out.println(alphabet  + ", " + this.lprimes.get(alphabet));
            hash++;
        }
        this.lprimes.put(' ',1); //handling spaces
        System.out.println("Getting mult from string a"+a.length);
        for(i=0; i<a.length;i++){
            multa= multa*(Integer)this.lprimes.get(a[i]);
            System.out.println(this.lprimes.get(a[i]));

        }
        for(i=0; i<b.length;i++){
            multb= multb*this.lprimes.get(b[i]);
        }
        System.out.println("A= " + multa + " B= " + multb );
        if(multa==multb){
            System.out.println("ANAGRAMA");
        }else{
            System.out.println("NO ES ANAGRAMA");
        }
        return true;
    }

    public static void main(String[] args){
        String a = "cinto cuto sin";
        String b = "constitucion";
        String c= "sjdlskadlkjads";
        Anagram ana = new Anagram();
        ana.isAnagram(a.toCharArray(),c.toCharArray());
        
        System.out.println("Testing with: a="+a + ", b=" +b +", c="+ c);
    }

}
