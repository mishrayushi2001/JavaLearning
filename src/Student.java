public class Student {
    //instance variable
    static int studentCount;
    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa;
    char degree;
    boolean international;
    double tuitionFees;
    double internationalFees = tuitionFees = 5000.0 ;

    Student(int newId,String newName, String newGender,int newAge, long newPhone, double newGpa,
                    char newDegree, boolean isInternational){
        id =newId;
        name  =newName;
        gender =newGender;
        age = newAge;
        phone = newPhone;
        gpa =newGpa;
        degree =newDegree;
        international =isInternational;

        studentCount = studentCount+1;
        int nextId =id+1;  //local variable
        if(international){
            tuitionFees = tuitionFees+internationalFees;
//            return;
        }

        System.out.println(" id :"+id);
        System.out.println(" nextId: "+nextId);
        System.out.println(" name: "+name);

        System.out.println(" gender: "+gender);

        System.out.println(" age : "+age);
        System.out.println(" phone : "+phone);
        System.out.println(" gpa : "+gpa);
        System.out.println(" degree : " +degree);
        System.out.println(" tuitionFees: "+tuitionFees);
        System.out.println(" computeCount: "+studentCount);
        System.out.println(" Student.computeCount: "+Student.studentCount);
    }


//    void compute(){
//        computeCount = computeCount+1;
//        int nextId =id+1;  //local variable
//        if(international){
//            tuitionFees = tuitionFees+internationalFees;
//            return;
//        }
//
//        System.out.println(" id :"+id);
//        System.out.println(" nextId: "+nextId);
//        System.out.println(" name: "+name);
//
//        System.out.println(" gender: "+gender);
//
//        System.out.println(" age : "+age);
//        System.out.println(" phone : "+phone);
//        System.out.println(" gpa : "+gpa);
//        System.out.println(" degree : " +degree);
//        System.out.println(" tuitionFees: "+tuitionFees);
//        System.out.println(" computeCount: "+computeCount);
//        System.out.println(" Student.computeCount: "+Student.computeCount);
//    }
    static Student student3;
    public static void main(String[] args){
        Student student1=new Student(1000,"John","male",18,223_345_34567L,3.2,'B',false);
//        student1.id =1000;
//        student1.name ="John";
//        student1.gender = "male";
//        student1.age = 18;
//        student1.phone = 232_2233;
//        student1.gpa = 3.8 ;
//        student1.degree ='B';
//        student1.international=false;
//        student1.compute();

        Student student2=new Student(1001,"Aryan","male",22,456_918_2767L,3.8,'B',true);
//        student2.id =1001;
//        student2.name ="Aryan";
//        student2.gender = "male";
//        student2.age = 22;
//        student2.phone = 232_226787;
//        student2.gpa = 3.8 ;
//        student2.degree ='B';
//        student2.international=false;

//        student2.compute();


        Student student3=new Student(1003,"Ishaan","male",22,456_213_2767L,3.4,'B',true);
//        student3.id =1003;
//        student3.name ="Ishaan";
//        student3.gender = "male";
//        student3.age = 25;
//        student3.phone = 232_222787;
//        student3.gpa = 3.8 ;
//        student3.degree ='B';
//        student3.international=true;
//        student3.compute();

    }
}
