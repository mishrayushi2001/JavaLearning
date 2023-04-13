class BasicsDemo {
  // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print ("world!!");
  }
  static void primitive(){
    char charInt = 65;
    System.out.println("charInt: "+charInt);

    char charHex =0x0041;
    System.out.println("charHex: "+charHex);

    char charBinary = 0b0100_0001;
    System.out.println("charBinary: "+charBinary);

  }
  static void typeCasting(){
    System.out.println("\n Inside typeCasting ....");
    //Explicit casting
    long y =42;
//    int x =y;
    int x = (int)y;
    byte narrowByte = (byte)123456;
    System.out.println("narrowByte: "+narrowByte);
    //Truncation
    int iTruncated =(int)0.99;
    System.out.println("iTruncated: "+iTruncated);
    //Implicit cast (int to long)
    y=x;

    //Implicit cast (char to int)
    char cChar = 'A';
    int iInt =cChar;
    System.out.println("iInt: "+ iInt);

    //byte to char using an explicit cast
    byte bByte = 65;
    cChar =(char)bByte;  //special conversation(widening from byte --> int followed by narrowing from int -->char)
    System.out.println("cChar: "+cChar);
  }
  static int[] scores;
  static void arrays(){
    System.out.println("\nInside arrays....");
//    int[] scores =new int[4];
    scores =new int[4];
    scores[0]=90;
    scores[1]=70;
    scores[2]=80;
    scores[3]=100;
//    int[] scores =new int[]{90,70,80,100};
//    int[] scores ={90,70,80,100};

    System.out.println("Mid-Term 1: "+scores[0]);
    System.out.println("Mid-Term 2: "+scores[1]);
    System.out.println("Final: "+scores[2]);
    System.out.println("Project: "+scores[3]);
    System.out.println("n exams: "+scores.length);

    Student[] students =new Student[3];
    students[0]=new Student();
    students[1]=new Student();
    students[2]=new Student();
    students[0].name="John";
    students[1].name="Raj";
    students[2].name="Anita";


    System.out.println("Student 1: "+students[0].name);
    System.out.println("Student 2: "+students[1].name);
    System.out.println("Student 3: "+students[2].name);
//    System.out.println("Student 4: "+students[3].name);
  }
  static void threeDimensionalArrays() {
    System.out.println("\nInside threeDimensionalArrays ...");
    int[][][] unitsSold = new int[][][]{
            { // New York
                    {0,0,0,0}, // Jan
                    {0,0,0,0}, // Feb
                    {0,0,0,0}, // Mar
                    {0,850,0,0}// Apr
            },
            { // San Francisco
                    {0,0,0,0}, // Jan
                    {0,0,0,0}, // Feb
                    {0,0,0,0}, // Mar
                    {0,0,0,0}  // Apr
            },
            {
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            },
            {
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}
            }
    };

    System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
  }
  static double sum(double x,double y){
    return x+y;
  }
  static double avg(double x,double y){
    double sum =sum(x,y);
    return sum/2;
  }
  static boolean search(int[] list, int key){
    return true;
  }
  static  void go(int[] array){
    System.out.println("array[0]: "+array[0]);
    System.out.println("array[1]: "+array[1]);
    array[1]=22;
  }
  static  void go(int i){
    System.out.println("go(int i)");
  }
  static  void go(short s){
    System.out.println("go(short s)");
  }
  static void varargsOverload(boolean b,int i,int j,int k){
    System.out.println("\nInside varargsOverload without varargs ...");
  }
  static  void varargsOverload(boolean b, int... list){
    System.out.println("\nInside varargsOverload with varargs ...");
    System.out.println("list.length: "+list.length);
  }
  
  public static void main(String[] args) {
    // Language Basics 1
//    threeDimensionalArrays();
//    arrays();
//    print();
//    primitive();
//    typeCasting();
//    int i = 6;
//    int j = 2;
//    System.out.println(i+j);
//    System.out.println(i-j);
//    System.out.println(i*j);
//    System.out.println(i/j);
//    System.out.println(i%j);
    int[] array ={1,2};
    go(array);
    System.out.println("array[1]: "+array[1]);

    varargsOverload(true,1,2,3);
    varargsOverload(true,1,2,3,4,5,6,7,8);
    varargsOverload(true);


    double d =sum (3.0f,2.0); //reusing sum in avg method
    System.out.println(d);



    double d2 =avg (3.0,2.0);
    System.out.println(d2);
    double price =1000;
    double discountPercent =0.9;
    double discountAmount = price * discountPercent;
    System.out.println(price * discountAmount);
    System.out.println(price *(1-discountPercent));
    int[] list ={1,2};
    search(list,2);

    go(1000);
    byte b=22;
    go(b);
  }
}