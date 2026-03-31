package Java;
import java.util.*;
class day123 { // day 1,2,3

    public void swap() {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a + "b: " + b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("a : " + a + "b: " + b);

        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a + "b: " + b);

        System.out.println("Sum of N natural Numbers: " + a * (a + 1) / 2);

    }

    public void conditionals() {
        int a = 10;
        if (a % 3 == 0) {
            System.out.println("divisible by 3"); 
        }else if (a % 2 == 0) {
            System.out.println("divisible by 2"); 
        }else {
            System.out.println("not divisible by 3");
        }
    }

    public void month(int month) {
        int oe = month % 2;
        switch (oe) {
            case 1:
                System.out.println("31 days");
                break;
            case 0:
                System.out.println(month == 2 ? "28 days" : "30 days");
                break;
            default:
                throw new AssertionError();
        }

    }

    public void loops(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public void tables(int n) {
        for (int i = 1; i <= n; i++) // gor 
        {
            System.out.printf("%d x %d = %d \n", n, i, n * i);
        }

    }

    public void ntables(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d x %d = %d \n", j, i, j * i);
        
            }}

    }

    public void fibo(int n) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d\n", n1);
            int temp = n2;
            n2 = n2 + n1;
            n1 = temp;
        }
    }

    public void fact(int n) {
        int n1 = 1;
        for (int i = 1; i <= n; i++) {
            n1 *= i;
        }
        System.out.printf("%d\n", n1);
    }

    public void sumofDigits(int n) {
        int n1 = 0;
        for (int i = 1; i <= n; i++) {
            n1 += i;
        }
        System.out.printf("%d\n", n1);
    }

    void pattern(int n) {
        int start = 1;
        int end = n;
        while (start <= n && end > 0) {
            for (int j = 0; j <= n; j++) {
                if (j == start || j == end) {
                    System.out.print("x"); 
                }else {
                    System.out.print(" ");
                }

            }
            start++;
            end--;
            System.out.println();
        }
    }

    void pow(int n) {
        int pow = 1 << n;
        System.out.println("pow: " + pow);

    }

    void isDivBy4(int n) {
        if ((n & 3) == 0) {
            System.out.println("Divisible ");
        }
    }

    void countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
    }

    void palindrome(int n) {
        int rev = 0;
        int temp = n;
        while (n != 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.printf("Palindrome: %d | InputNumber : %d\n", rev, temp);
    }

    void isPrime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        System.out.println("is Prime: " + isprime);
    }

    ArrayList<Integer> Factors(int n) {
        System.out.println("==========Factors===========");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        System.out.println(arr);
        return arr;
    }

    int GCD(int a, int b) {
        System.out.println("+++++++++GCD++++++++++++");
        int temp = Math.min(a, b);
        while (temp != 0) {
            if (a % temp == 0 && b % temp == 0) {
                System.out.printf("The GCD of %d and %d is : %d\n", a, b, temp);
                return temp;
            }
            temp--;
        }
        return temp;
    }

    void lcm(int a, int b) {
        System.out.println("===============LCM================");
        System.out.printf("\nLCM of a Given Number is : %d\n", (a * b) / GCD(a, b));

    }

    void sumofDivisiors(int n) {
        int sum = 0;
        for (int i : Factors(n)) {
            sum += i;
        }
        System.out.printf("Sum of the factors are: %d \n", sum);
    }

    void isproperDivisor(int n) {
        ArrayList<Integer> li = Factors(n);
        System.out.println(li.size() > 1 ? "is a Proper Divisior" : "Not for Divisor");
    }

    void perfectsqr(int n) {
        System.out.println((int) Math.sqrt(n) * (int) Math.sqrt(n) == n ? "is Perfect Number" : "is a Not Pefect Number");
    }

    void armstrongNumber(int n) {
        int temp = n;
        int len = String.valueOf(n).length();
        int sum = 0;
        while (temp != 0) {
            int last = temp % 10;
            sum += Math.pow(last, len);
            temp /= 10;
        }
        System.out.println(sum == n ? "It is a Armstrong Number" : "Its Not an Armstrong Number");
    }
}

class Patterns extends day123 { //day 4

    int n;
    int l = 0;

    Patterns(int n) {
        this.n = n;
    }

    void sqr() {
        System.out.println(++l + " sqr");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void leftIncreaingTriangle() {
        System.out.println(++l + " leftIncreaingTriangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void leftDecreasingTriangle() {
        System.out.println(++l + " leftDecreasingTriangle");
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void piramid() {
        System.out.println(++l + " Piramind");
        int temp = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            temp--;
            System.out.println();
        }
    }

    void leftIncreaingTriangleBin() {
        System.out.println(++l + " leftIncreaingTriangle");
        int bin = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(bin % 2 + " ");
                bin++;
            }
            System.out.println();
        }
    }

    void IncreaseleftIncreaingTriangleBin() {
        System.out.println(++l + " leftIncreaingTriangle");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void flyod() {
        System.out.println(++l + " levelTriangle");
        int temp = n;
        int o = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(o++ + " ");
            }
            temp--;
            System.out.println();
        }
    }

    void halfLoop() {
        System.out.println(++l + " halfNumPermid");
        int temp = n;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(k + 1 + " ");
            }
            for (int o = i - 1; o >= 1; o--) {
                System.out.print(o + " ");
            }
            temp--;
            System.out.println();
        }
    }

    void hollowSqr() {
        System.out.printf(" \n %d Hollow Sqr \n", ++l);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
                    System.out.print("* "); 
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void rombus() {
        System.out.printf(" \n %d Rombus \n", ++l);
        int temp = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            temp--;
            System.out.println();
        }
        temp = 2;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            temp++;
        }
    }

    void hourGlass() {
        System.out.printf(" \n %d Hour Glass \n", ++l);
        int temp = 1;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            temp++;
        }
        temp = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            temp--;
            System.out.println();
        }
    }

    void butterfly() {
        System.out.printf(" \n %d Hour Glass \n", ++l);

    }
}

class Methods extends Patterns { //day5

    int n;
    //day5
    int l = 0;

    Methods(int n) {
        super(n);
        this.n = n;
    }

    public int add(int a, int b) {
        System.out.printf(" \n Program no: %d add \n", ++l);
        return a + b;
    }

    public String greetings() {
        System.out.printf(" \n Program no: %d greetings \n", ++l);
        return "Greetings! ";
    }

    public void sumN(int n) {
        System.out.printf(" \n Program no: %d Sum of N \n", ++l);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void perfectNumeber(int val) {
        System.out.printf(" \n Program no: %d perfectNumeber \n", ++l);
        ArrayList<Integer> fact = Factors(val);
        int sum = 0;
        for (int i : fact) {
            sum += i;
        }
        System.out.println(sum == val ? "Perfect Number" : "Not a Perfect Number");
    }

    public double discount(double n) {
        System.out.printf(" \n Program no: %d Discount \n", ++l);
        if (n < 2000) {
            return n; 
        }else if (n < 5000) {
            return n - n * 0.2;
        }
        return n - n * 0.3;
    }

    public void parking(int num) {
        System.out.printf(" \n Program no: %d Parkng \n", ++l);
        if (num == -1) {
            System.out.println("On auto quit change argument from -1 to 0 num(-1) -> num(0)");
            return;
        }
        boolean[] slots = new boolean[4];
        Scanner s = new Scanner(System.in);
        int count = 0;
        while (count < 4) {
            System.out.print("Enter the Vehicle Number: ");
            num = s.nextInt();
            if (num == -1) {
                return;
            }
            num = num % 4;
            if (slots[num] == false) {
                System.out.println("Slot Occupied ");
                slots[num] = true;
                count++;
            } else {
                System.out.println("Slot Already Occupied ");
            }
        }
    }

    public void celseisToFrar(int c) {
        System.out.printf(" \n Program no: %d celseisToFrar \n", ++l);
        System.out.println((c * (9 / 5)) + 32 + "F");
    }

    void withdraw(int amount) {
        System.out.printf(" \n Program no: %d withdraw \n", ++l);
        int balance = 20000;
        int temp = balance;
        if (balance - amount < 0) {
            System.out.println("in sufficient Balance");
            return;
        } else {
            balance -= amount;
            System.out.printf("\nBefore balance : %d withdraw amt : %d Current balance : %d\n", temp, amount, balance);
        }
    }
}

class Constructors extends Methods { // day 6 

    public Constructors() {
        super(0);
    }
}

class Address {

    String city;

    public Address(String city) {
        this.city = city;
    }

}

class Person {

    String Name;
    Address a;

    public Person(String Name, Address a) {
        this.Name = Name;
        this.a = a;
    }

    public Person(Person p) {
        this.Name = p.Name;
        this.a = new Address(p.a.city);
    }

}

interface test {

    public void check();
}

class exam implements test {

    public void check() {
        System.out.println("Checking. papper");
    }
}

abstract class test2 {

    abstract void check();

    public void marks() {
        System.out.println(78);
    }
}

class exams2 extends test2 {

    void check() {
        System.out.println("checkinggggggg");
    }
}

class collectionFrameWork {// day 7

    void arrayList() {
        ArrayList<Integer> li = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            li.add(r.nextInt(100));
        }
        System.out.println(li);
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i + ":" + String.valueOf(r.nextInt(100)));
        }
        System.out.println("LinkedList");
        System.out.println(list);
        HashSet<Double> s = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>(); //doesnt allow duplicates and stores in a ordered format 
        System.out.println("TreeSet");
        for (int i = 0; i < 10; i++) {
            treeSet.add(r.nextInt(100));
        }
        System.out.println(treeSet);
        TreeSet<String> strTree = new TreeSet<>();
        strTree.add("abc");
        strTree.add("xyz");
        strTree.add("kgf");
        strTree.add("kgf");
        strTree.add("kfc");
        strTree.add("abcde");
        System.out.println(strTree);
        TreeSet<String> strTree1 = new TreeSet<>();
        strTree1.add("abc");
        strTree1.add("xyz");
        strTree1.add("kgf");
        System.out.println(strTree1);

        for (String i : strTree){
            if(strTree1.contains(i)){
                System.out.println(i);
            }
        }

    }

    void firstDuplicate(){

    }

    void sortBylength(){
        
    }
}



class day8 {// day 8 

    void kthlargest(int k){
        Random r = new Random(); 
        ArrayList<Integer> t = new ArrayList<>();
        ArrayList<Integer> Visted = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = r.nextInt(20);
                t.add(val);}

        System.out.println(t);
        Collections.sort(t);
        System.out.println(t);
        System.out.println(t.get(t.size()-k));
    }


}

class day9 { //day9 

    void twoSum(int n, int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i: arr){
        }
        
    }

}

class  day10{
    void rotateRight(int[] arr){
        int temp = arr[arr.length-1];
        for (int i = arr.length-2 ; i >= 0 ; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
        displayArray(arr);
    }
    void rotateLeft(int[] arr){
    }

     void displayArray(int[] arr){
        System.out.print("[");
        for (int i = 0 ;i < arr.length ; i++){
            System.out.print(arr[i]);
            if (i != arr.length -1)
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }
         void displayArray(String[] arr){
        System.out.print("[");
        for (int i = 0 ;i < arr.length ; i++){
            System.out.print(arr[i]);
            if (i != arr.length -1)
            System.out.print(",");
        }
        System.out.print("]");
        System.out.println();
    }
 
 

    void kthRotation(int k ,int[] arr){
        k = k%arr.length;
        for (int i = 0; i < k; i++) {
            rotateRight(arr);
        }
    }

    void reverseAnArray(int[] arr,int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        displayArray(arr);
    }

    void kthRotationOptimalLeft(int k, int[] arr){
        int len = arr.length;
        k = k%len;
        reverseAnArray(arr,0,k-1);
        reverseAnArray(arr, k, len-1);
        reverseAnArray(arr, 0, len-1);
        
    }

      void kthRotationOptimalRight(int k, int[] arr){
        int len = arr.length;
        k = k%len;
        reverseAnArray(arr,0,len-1);
        reverseAnArray(arr, k, len-1);
        reverseAnArray(arr, 0,k-1);

        
    }


}

class bitOperations{
    void consequtiveZeros(String bin){
        char[] arr = bin.toCharArray();
        int count = 0;
        int max = 0;
        for (char i : arr){
            if(i=='0') count++;
            if(i == '1') count = 0;
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
    void hagsdjhas(){
        int[] arr = {0,1,0,2,2,1,0,1,2,0,0};
        int zeros = 0;
        int target = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[zeros] == target){
                zeros++;
            }
        }
    }

    // void dutchFlagAlgorithm(int[] arr){
    //     int 
    //     int low = 0 , mid = 0 , high = n-1 ;
    // }




}

class dk {
    public int maxProfit(int[] prices) {
        int max_value = 0;
        int min_price = Integer.MAX_VALUE;
        for(int price : prices){
            if (price < min_price) min_price = price ;
            else max_value = Math.max(max_value, price - min_price );
        }
        return max_value;
    }

    int maximum_subAray(int[] arr){
        int max = 0 ;
        int res = 0;
        for (int i = 0 ; i < arr.length ; i++){
            max = Math.max(arr[i],max+arr[i]);
            res  = Math.max(max,res);
    }
    return res;
    }

}

class whateverVro{
    void prefixSum(int[] arr ){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }
        System.out.println("Regular arr");
        new day10().displayArray(arr);
        System.out.println("Prefix sum arr: ");
        new day10().displayArray(prefix);
        
    }
}

class Matrix{

    int[][] createaMatrix(int row ,int col){

        int[][] arr = new int[row][col];
        for(int i= 0; i < row ; i++){
            for (int j = 0; j < col ;j++)
                arr[i][j] = new Random().nextInt(10);
        }
        return arr;
    }

    void printMatrix(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
            System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    void spiral(){

        int[][] arr = createaMatrix(3, 3);
        printMatrix(arr);

        int left = 0;
        int right = arr[0].length-1;
        int top = 0;
        int bot = arr.length-1;

        ArrayList<Integer> res = new ArrayList<>();
        while(top<=bot && left <= right){
            // traverse from top 
            for (int i = left ; i <= right ;i++)
                res.add(arr[top][i]);
            top++;

            // Traverse down 
            for (int i = top ; i <=bot ; i++ )
                res.add(arr[i][right]);
            right--;

            // traverse from bottom 
            if(top<= bot){
            for (int i = right ; i >= left ; i--)
                res.add(arr[bot][i]);
            bot--;}

            if (right<=left){
                for(int i = bot ; i >= top ; i--){
                    res.add(arr[i][left]);
                }
                left++;
            }
        }
        System.out.println(res);
    }



    void spiral1(){
        int[][] arr = createaMatrix(3, 3);
        printMatrix(arr);
        int left = 0;
        int right = arr[0].length -1;
        int top = 0;
        int bottom = arr.length -1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (left<=right && top<=right) { 
            //top 
            for (int i = top ; i <= right ; i++){
                ans.add(arr[top][i]);
            }
            top++;
            // go down 

            for (int i = top ; i <= bottom ; i++){
                ans.add(arr[i][right]);
            }
            right--;

            // right to left 
            if (top <= bottom){
                for(int i = right ; i>= left ; i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for (int i = bottom ; i >= top ; i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
            
        }
        System.out.println(ans);
    }


    public void matrixMultiplication(int[][] a , int[][] b){

        int colA = a[0].length;
        int rowB = b.length;

        int[][] c = new int[rowB][colA];

        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colA; j++) {
                for(int k = 0 ; k < rowB ;i++){
                    c[i][j] += (a[i][k]*b[k][j]);
                }
            }
        }

    }

}

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " : " + marks;
    }
}

class SortByMarks implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.marks-b.marks;
    }
}

class recursion{

    public void Nto1(int n){
        if (n == 0)
            return ;
        Nto1(n-1);
        System.out.println(n);
    }

    public void oneToN(int n){
        if (n == 0)
            return ;
        System.out.println(n);
        oneToN(n-1);
    }

    public int factorial(int n){
        if (n<=1)
            return 1;
        return n*factorial(n-1);
    }
    public int sumofArray(int[] arr , int i , int sum){
        if (i >= arr.length)
            return sum;
        return sumofArray(arr, i+1, sum+=arr[i]);
    }

    public void leftMost(int n){
        if (n == 0)
            return;
        leftMost(n/10);
        System.out.print(n%10+" ");
    }
    
    public void maximumElement(int[] arr, int i , int max){
        if (i > arr.length-1){
            System.out.println("Maximum Element: "+max);
            return ;
        }
        max = Math.max(max, arr[i]);
        maximumElement(arr, i+1, max);
    }

    public void palindrome(int n , int p){
        if ( n <= 0 ){
            System.out.println("Palindrome: "+p);
            return;
        }
        p = (p*10)+n%10;
        n = n /10;
        palindrome(n, p);
    }

    public int fibo(int n){
        if ( n <= 1) 
            return 1;
        return  fibo(n-1)+fibo(n-2);
    }

    public  ArrayList<List<Integer>> li = new ArrayList<>();
    public void subArray(int[] arr , int start , int end){ //
        if (start > arr.length-1) return;
        if (end > arr.length-1){
            subArray(arr, start+1, start+1);
        return;}
        List<Integer> a = new ArrayList<>();
        for (int i = start ; i<= end ; i++){
            a.add(arr[i]);
        }
        li.add(a);
        subArray(arr, start, end+1);
    }
}

class leetcode{
    void trappingWater(int[] height){

        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n]; 

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max( leftMax[i-1] , height[i]);
        }
        rightMax[n-1] = height[n-1];
        for (int i = n -2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[n+1], height[i]);  
        }
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += Math.max(leftMax[i],rightMax[i]) - height[i];
        }
        System.out.println(sum);
    }


    void nextPermutation(int[] arr){
        int n = arr.length;
        int i = n-2;
        new day10().displayArray(arr);
        // find the first decrasing 
        while(i>=0 && arr[i]>= arr[i+1]){
            i--;
        }
        // find first increasing 
        int j = n -2 ;
        while(j>=0 && arr[j] <= arr[j+1]){
            j--;
        }
        // swap
        swap(arr, i, j);
        //reverse
        reverse(arr, i+1, n-1);

        new day10().displayArray(arr);

    }

    void swap ( int[] arr , int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }

    void reverse(int[] arr , int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

class sorting{


    public void BubbleSort(int[] arr){
        while (true){
            boolean swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]){
                    swapped = true;
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
            if (swapped == false){
                break;
            }
        }
        new day10().displayArray(arr);
    }


     void sortingAlgorithms(){
        
        // insertion sort
        /*
        for i ==1 to n-1
            key = arr[i]
            j = i -1 
            while j >= 0 and arr[j] > key
                arr[j+1] == arr[j]
                j  = j +1 
            arr[j+1] = key
        */

    }

    void findLargestKthElement(int k , int[] arr){
        BubbleSort(arr);
        System.out.println(k +" "+ ( (k > 3) ? "th" : (k == 1 ? "st" : (k == 2 ? "nd" : (k == 3 ? "rd": "th"))) )+" Largest Element: "+arr[k-1]);
    }


    void MergeSort(int[] arr){
        int len = arr.length;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m ; i < m+n ; i++){
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }


    void fibo(){
        int n = 6;
        for (int i = 0,a = 1,b= 1; i < n ; i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }

    }

    public int binnarySearch(int[] arr,int start,int end,int target){
        if (start>end)
            return -1;
        int mid = start+(end-start)/2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return binnarySearch(arr, mid+1, end, target);
        else return binnarySearch(arr, start, mid-1, target);
    }
}


class idkDay{

    public int firstOccurance(int[] arr,int element){
        int left = 0;
        int right = arr.length -1;
        int ans = -1;
        while (left <= right){
            int mid = left + (right - left) /2 ;
            if (arr[mid] == element){
                ans = mid ;
                right = mid -1 ;
            }
            else if (arr[mid] < element){
                 left = mid + 1;
            }
            else {
                right = mid -1;
            }
        }
        return ans;
    }

    public int lastOccurance(int[] arr , int target){
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        while (left <= right){
            int mid = left+(right-left)/2;
            if (arr[mid] == target){
                ans = mid;
                left = mid+1;
            }
            else if (arr[mid] > target){
                right = mid -1;
            }
            else {
                left = mid+1;
            }
        }
        return ans;
    }

    public int countOccurance(int[] arr,int element){ // sorted no dupplicates 
        int first_Occurance = firstOccurance(arr, element);
        System.out.println(first_Occurance);
        int last_Occurance = lastOccurance(arr, element);     
        System.out.println(last_Occurance);
        int count_of_occurance = (last_Occurance - first_Occurance)+1;
        return count_of_occurance;
    }


    public int lowerBound(int[] arr , int target){
        int left = 0 ;
        int right = arr.length-1;
        int res = arr.length-1;

        while (left <= right){
            int mid = left+(right-left)/2;
            if (arr[mid] >= target){
                res= mid;
                right = mid -1 ;
            }
            else{
                left = mid+1;
            }
        }
        return res;
    }

        public int upperBound(int[] arr , int target){
        int left = 0 ;
        int right = arr.length-1;
        int res = arr.length-1;

        while (left <= right){
            int mid = left+(right-left)/2;
            if (arr[mid] > target){
                res= mid;
                right = mid -1 ;
            }
            else{
                left = mid+1;
            }
        }
        return res;
    }

    public int search_Insert_Position(int[] arr, int target){
        int left = 0 ;
        int right = arr.length-1;
        while(left <= right){
            int mid = left+(right-left)/2;

            if(arr[mid] == target){
                return  mid;
            }
            else if (arr[mid] > target){
                right = mid-1;
            }
            else 
                left = mid+1;

        }
        return left;
    }

    public int peak_Element(int[] arr){

        int left = 1;
        int right = arr.length-2;

        while(left<=right){
            int mid = left+(right-left)/2;

            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            else if (arr[mid] < arr[mid+1]){
                left = mid +1 ;
            }
            else {
                right = mid -1;
            }
        }
        return -1;
    }


    public int bitonic_point(int[] arr){
        int left =  0 ;
        int right = arr.length-1;
        while(left< right){
            int mid = left+(right-left)/2;
            if (arr[mid] < arr[mid+1])
                left = mid + 1 ;
            else
                right = mid;
        }
        return left;
    }

    public int Search_in_a_Rotated_Array(int[] arr,int tar){
        int bitonic_point = bitonic_point(arr);
        if (arr[bitonic_point] == tar) return bitonic_point;
        sorting d = new sorting();
        int first_half  = d.binnarySearch(arr,0,bitonic_point,tar) ;
        int second_half = d.binnarySearch(arr, bitonic_point+1 , arr.length-1, tar);
        return Math.max(second_half, first_half);
    }

}
class class_String{
    String reverse(String s){
        StringBuilder str = new StringBuilder();
        for(int i= s.length()-1 ; i >=0 ; i--)
            str.append(s.charAt(i));
        return str.toString();
    }

    boolean isPalindrome(String s){
        return s.equals(reverse(s));
    }

    String reverseWords(String s){
        String[] wrd = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = wrd.length-1 ; i >= 0; i--) {
            sb.append(wrd[i]);
            sb.append(i < wrd.length ? " ": "");
        }
        return sb.toString();
    }

    String remove_outer_parenthesis(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] =='(') {
                stack.add(arr[i]);}
            else if( arr[i] == ')' && !stack.isEmpty() && i < arr.length-1){
                sb.append(stack.pop());
                sb.append(arr[i]);
            }
            else sb.append(arr[i] != ')' ? arr[i] : "");
        }
        return sb.toString();
    }
    boolean Largest_Odd_Number(String s ){
        int num = s.charAt(s.length()-1)-'0';
        return num % 2 !=0;
    }

    String[] split_custom(String str,String regex){
        ArrayList<String> arr = new ArrayList<>();
        int start =0;
        for(int i = 0; i < str.length() ; i++){
            if (str.charAt(i) == regex.charAt(0)){
                arr.add(str.substring(start,i));
                start = i+1;
            }
        }
        return arr.toArray(new String[arr.size()]);
    }
    
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length-1];
        int i = 0;
        for (i = 0; i <  Math.min(end.length(),start.length()); i++){
            if (start.charAt(i) != end.charAt(i))
            break;
        }
        return i <= 0 ? "" : strs[0].substring(0,i);
    }
}

class Node{
    int data;
    String var;
    Node next;
    Node(int data){
        this.data = data;
    }

    public Node(String var) {
        this.var = var;
    }
    
}

class linkedlist{
    static Node head = null;
    static Node tail = null;

    Node get_head () {
        return head;
    
    }
    public  void insert_at_end(int n){
        Node new_node = new Node(n);
        if(head == null){
            head = new_node;
            tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    public  void insert_at_end(String n){
        Node new_node = new Node(n);
        if(head == null){
            head = new_node;
            tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    public void insert_at_beginning(int n){
        if (head == null){
            insert_at_end(n);
            return;
        }
        Node new_node = new Node(n);
        new_node.next = head;
        head = new_node;
    }

    public void display(){
        Node temp = head;
        while(temp.next!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    public  void display_String(){
        Node temp = head;
        while(temp.next!= null){
            System.out.print(temp.var + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.var);
        System.out.println();
    }

    public void reverse_a_String(){{
        Node temp_left = head;
        Node temp_right = tail;
    }}

    public int count_node(){
        Node temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        return n; 
    }

    void insert_before_the_node(int tar , int n){
        if (head == null) return;
        System.out.println("insert_before_the_node");
        display();
        System.out.println("target : "+ tar );
        Node new_node = new Node(n);
        Node temp = head;
        while(temp!= null){
            if (temp.next.data == tar){
                new_node.next = temp.next;
                temp.next = new_node;
                return ;
            }
            temp = temp.next;
        } 
    } 

     void insert_after_the_node(int tar , int n){
        if (head == null) return;
        System.out.println("insert_after_the_node");
        display();
        System.out.println("target : "+ tar );
        Node new_node = new Node(n);
        Node temp = head;
        while(temp!= null){
            if (temp.data == tar){
                new_node.next = temp.next;
                temp.next = new_node;
                return ;
            }
            temp = temp.next;
        } 
    } 

    public void delete_from_beginning(){
        head = head.next;
    }

    public void delete_at_the_end(){
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        tail = temp;
    }


    public Node reverse(Node headNode){
        Node prev = null;
        Node next = null;
        Node curr = headNode;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void isPalindrome(){
        if (head == null || head.next == null){
            return;
        }
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second_Pointer = reverse(fast);
        Node first_Pointer = head;

        while(second_Pointer != null){
            if (!second_Pointer.var.equals(first_Pointer.var)){
                System.out.println("Not a Palindrome");
                return;
            }
            first_Pointer = first_Pointer.next;
            second_Pointer = second_Pointer.next;
        }
        System.out.println("Its a PalinDrome");

    }
}


class Dubl_Node{
    int data ;
    Dubl_Node prev;
    Dubl_Node next;

    Dubl_Node(int n){
        data = n;
    }
}

class double_linked_list extends linkedlist{
    static Dubl_Node head = null;
    static Dubl_Node tail = null;

    @Override
    public void insert_at_end(int n ){
        Dubl_Node new_node = new Dubl_Node(n);
        if(head == null){
            head = new_node;
            tail = new_node;
            return;
        }
        new_node.prev = tail;
        tail.next = new_node;
        tail = new_node;
    }

    @Override
    public void display(){
        Dubl_Node temp = head;
        System.out.print(temp.data);
        temp = temp.next;
        while(temp != null){
            System.out.printf(" <- %d -> ",temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

       public void Prev_display(){
        Dubl_Node temp = tail;
        while(temp != null){
            System.out.printf(" %d -> ",temp.data);
            temp = temp.prev;
        }
        System.out.println();
       }

     void add(int n){
        Dubl_Node new_node = new Dubl_Node(n);
        if(head == null){
            head = new_node;
            tail = new_node;
            return;
        }
        Dubl_Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        new_node.prev = temp;
        temp.next = new_node;
        tail = temp;
    }

    @Override
    public void insert_at_beginning(int n){
         Dubl_Node new_node = new Dubl_Node(n);
        if(head == null){
            head = new_node;
            tail = new_node;
            return;
        }
        new_node.next = head;
        head.prev = new_node;
        head = new_node;
    }


    public void Before_a_Node(int n, int tar){
        Dubl_Node  temp = head;
        Dubl_Node new_node = new Dubl_Node(n);
        while(temp != null){
            int i = 1;
            if(temp.data == tar){
                temp = temp.prev;
                temp.next.prev = new_node;
                new_node.prev = temp;
                new_node.next = temp.next;
                temp.next = new_node;
                i++;
                System.out.println("Inserted in index : "+i);
                return;
            }
            temp = temp.next;
        }
    }

    public void After_a_node(int n , int tar){
        Dubl_Node temp = head;
        Dubl_Node new_node = new Dubl_Node(n);
        while(temp!= null){
            if (temp.data == tar){
                new_node.next = temp.next;
                new_node.prev = temp;
                temp.next.prev = new_node;
                temp.next = new_node;
                return;
            }
            temp = temp.next;
        }
    }

    public boolean hasCycle(Dubl_Node head) {
        if(head == null || head.next == null)
            return false;
        Dubl_Node slow = head;
        Dubl_Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return 1 == 2;
    }

    public int length_LL (){
        Dubl_Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("length: "+count);
        return count;
    }

    public int middle_element (){
        int len = length_LL();
        int middle = len/2;
        Dubl_Node temp = head;
        for (int i = 0 ; i < middle ; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    // public void reverse_linkedList(){
    // }

    public void delete_at_end(){
       tail = tail.prev;
       tail.next = null;
    }

    public void delete_at_beginning(){
        head = head.next;
        head.prev = null;
    }

    public void delete_a_node(int tar){
        Dubl_Node temp = head;
        while(temp != null){
            if (temp.data == tar){
                temp.next.prev = temp.prev;
                temp.prev.next = temp.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void delete_after_a_node(int tar){
        Dubl_Node temp = head;
        while(temp != null){
            if (temp.data == tar){
                temp.next.next.prev = temp;
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void delete_before_a_node(int tar){
        Dubl_Node temp = head;
        while(temp != null){
            if (temp.data == tar){
                Dubl_Node pre = temp.prev.prev;
                temp.prev = pre;
                pre.next = temp;
                return;
            }
            temp = temp.next;
        }
    }
}


class Stack_LL extends linkedlist {

    void push(int n){
        insert_at_beginning(n);
    }

    int pop(){
        int data = get_head().data;
        delete_from_beginning();
        return  data;
    }

    int peek(){
        return get_head().data;
    }
    
}

class Main{
    public void wannabe_main(){
        linkedlist ll = new linkedlist();
        // ll.insert_at_beginning(67);
        // ll.display();
        // System.out.printf("The Total number of Nodes %d\n",ll.count_node());
        // ll.insert_before_the_node(4, 11);
        // ll.display();
        // ll.insert_after_the_node(3, 67);
        // ll.display();
        double_linked_list dd = new double_linked_list();
        // for (char i = 'a'; i <= 'd'; i++) {
        //     ll.insert_at_end(i);
        //     // dd.add(i);
        // }\
        Stack_LL stack = new Stack_LL();
        String text = "121";{
      for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.display();
        stack.pop();
        stack.display();
        // ll.display_String();
        // dd.display();
        // dd.Prev_display();
        // dd.delete_at_beginning();
        // dd.display();
        // dd.Prev_display();
        // System.out.println("Swapped");
        // dd.After_a_node(67876,5);
        // dd.display();
        // dd.Prev_display(); 
        // System.out.println("length : "+ dd.length_LL());
        // System.out.println("Mid Element: "+ dd.middle_element());
        // dd.delete_before_a_node(67876);
        // dd.display();
        // dd.Prev_display();
    }

}
}



public class example { 
    public static void main(String args[]) {
        // System.out.println("Enter the N : ");
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // s.close();
        // swap();
        //conditionals();
        //month(2);
        // loops(n);
        // System.out.println("Tabl;es ");
        // tables(n);
        // System.out.println(" n Tabl;es ");
        // ntables(n);
        // System.out.println("\nfibo");
        // fibo(n);
        // System.out.println("\nfact");
        // fact(n);
        // System.out.println("\n sum of digits ");
        // fact(n);
        // pattern(n);
        // pow(n);
        // isDivBy4(n);
        // countDigits(n);
        // palindrome(n);
        // isPrime(n);
        // GCD(n,24);
        // lcm(n, 24);
        // sumofDivisiors(n);
        // isproperDivisor(n);
        // perfectsqr(n);
        // day 4 
        // int n = 6;
        // Patterns p = new Patterns(n);
        // p.sqr();
        // p.leftIncreaingTriangle();
        // p.leftDecreasingTriangle();
        // p.piramid();
        // p.leftIncreaingTriangleBin();
        // p.IncreaseleftIncreaingTriangleBin();
        // p.halfLoop();
        // p.flyod();
        // p.hollowSqr();
        // p.rombus();
        // p.hourGlass();
        // p.butterfly(); //-> incomplete
        //day5
        // int n = 5;
        // Methods m = new Methods(n);
        // System.out.println("Add: "+m.add(n, 80));
        // System.out.println(m.greetings());
        // m.sumN(n);
        // m.fact( n);
        // m.perfectNumeber(6);
        // m.rombus();
        // m.armstrongNumber(154);
        // System.out.printf("\n ammout : %d ,discounted  :%.2f \n" ,20000,m.discount(20000));
        // m.parking(-1);
        // m.celseisToFrar(0);
        // m.withdraw(1000);
        //day 6 
        // Person p1 = new Person("adhi", new Address("city"));
        // Person p2  = new Person(p1);
        // p2.a.city = "Metro";
        // System.out.println(p1.Name +" "+p1.a.city);
        // System.out.println(p2.Name +" "+p2.a.city);
        // exam e = new exam();
        // e.check();
        // exams2 e2 = new exams2();
        // e2.check();
        // e2.marks();
        // day 7
        // collectionFrameWork cf = new collectionFrameWork();
        // cf.arrayList();
        // int total = 0;
        // String a = "akash";
        // for (int i = 0; i < a.length() ; i++){
        //     total += a.charAt(i) - 'a';
        // }
        // System.out.println(total);
        // day8 a = new day8();
        // day10 a = new day10();
        // int[] arr = {1,2,3,4,5,6,7};
        // a.rotateRight(arr);
        // // a.kthRotation(5, arr);
        // a.rotateLeft(arr);
        // a.reverseAnArray(arr);
        // a.kthRotation(5, arr);
        // System.out.println("Solution: ");
        // a.displayArray(arr);
        // a.kthRotationOptimalRight(4, arr);
        // System.out.println("Solution: ");
        // a.displayArray(arr);
        // bitOperations op = new bitOperations();
        // String bin = "0001110000011";
        // op.consequtiveZeros(bin);
        // whateverVro wt = new whateverVro();
        // int[] arr = {1,2,4,5,6,7};
        // wt.prefixSum(arr);
        // Matrix m = new Matrix();
        // m.spiral1();
        // List<Student> list = new ArrayList<>();
        // list.add(new Student("Ravi", 75));
        // list.add(new Student("Arun", 90));
        // list.add(new Student("Kiran", 60));
        // Collections.sort(list, new SortByMarks());
        // for(Student s : list){
        //     System.out.println(s);
        // }
        // java Streams
        // int[] arr = {1,2,3,5,6,7,8,4};
        // ArrayList<Integer> li = new ArrayList<>();
        // Arrays.stream(arr).forEach(li::add);
        // // li.stream().filter(n -> n % 2 == 0 ).map(n -> n*n).collect(Collectors.toList());
        // // for(int i:li)
        // //     System.out.println(i);
        // int max = li.stream().reduce((a,b) -> ((a > b) ? a : b ));
        // System.out.println("MAX : "+max);
        // recursion 
        // int n = 10;
        // recursion r = new recursion();
        // r.Nto1(10);
        // System.out.println("\n1-n\n");
        // r.oneToN(10);
        // System.out.println("Factorial of a Number ");
        // int ans = r.factorial(3);
        // System.out.println("Factorial: "+ans);
        // int[] arr = {1,2,3,4,4};
        // ans = r.sumofArray(arr, 0, 0);
        // System.out.println(ans);
        // System.out.println("Left Most");
        // r.leftMost(100877624);
        // System.out.println();
        // // leetcode l = new leetcode();
        //  int[]  b = {1,2,3};
        // // l.nextPermutation(arr);
        // recursion r = new recursion();
        // r.maximumElement(arr, 0, 0);
        // r.palindrome(123, 0);
        // for (int i = 0 ; i < 10 ; i++){
        //     System.out.println(r.fibo(i));
        // }
        // r.subArray(b, 0, 0);
        // System.out.println(r.li); 
        // sorting  s = new sorting();
        // s.BubbleSort(arr);
        // s.sortingAlgorithms();
        // s.findLargestKthElement(4, arr);
        // int[] nums1 = {1,2,3,4,0,0,0};
        // int[] nums2 = {3,4,5};
        // s.merge(nums1, 4, nums2, 3);
        // new day10().displayArray(nums1);
        // s.fibo();
        // int[] arr = {1,2,7,5,4,6,3};
        // int ans = s.binnarySearch(arr, 0, arr.length-1, 5);
        // System.out.println("binarySearch: "+ ans+1234);
        // idkDay d = new idkDay();
        // int[] arr = {1,2,3,3,3,3,4,4};
        // int element = 3;
        // // int ans = d.countOccurance(arr, element);
        // day10 pr = new day10();
        // pr.displayArray(arr);
        // System.out.println("the Count: "+ ans);
        // ans = d.lowerBound(arr, 2);
        // System.out.println("Lower Bound Index: "+ans);
        // ans = d.upperBound(arr, 2);
        // System.out.println("Upper Bound Index: "+ ans);
        // ans = d.search_Insert_Position(arr, 1);
        // System.out.println("Insert The Position: "+ans);
        // int ans = d.peak_Element(arr);
        // System.out.println(ans);
        // ans = d.bitonic_point(arr);
        // System.out.println(ans);
        // int[] arr1 = {1,2,6,7,90,45,43,4};
        // pr.displayArray(arr1);
        // ans = d.Search_in_a_Rotated_Array(arr1, 90);
        // System.out.println(ans);
        // sorting s = new sorting();
        // class_String s = new class_String();
        // String str = "foo bar";
        // String ans = s.reverse(str);
        // System.out.println(str);
        // System.out.println(ans);
        // ans = "fof";
        // System.out.println(s.isPalindrome(ans));
        // ans = "hello world foo bar";
        // System.out.println( ans);
        // ans = s.reverseWords(ans);
        // System.out.println(ans);
        // ans = "((a+b))";
        // System.out.println(ans);
        // System.out.println(s.remove_outer_parenthesis(ans));
        // ans = "234234235934";
        // System.out.println(ans);
        // System.out.println(s.Largest_Odd_Number(ans));
        //  ans = "jjhdkg gdkg h kfgh dfkgh dg";
        //  System.out.println(ans);
        // String[] a = s.split_custom(ans, " ");
        // pr.displayArray(a);
        // for (int i = 0; i < 10; i++) {
        //     new linkedlist().insert_at_end(i);
        // }
        Main m = new Main();
        m.wannabe_main();
    }
}
