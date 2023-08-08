 fun main() {
    var username:String = "Shahinur Alam Bhuiyan"; // var can be changed by overriding
     username = "Shahin Bhuiyan";
//     username = 45; // can't store another datatype.

     val age:Int = 22; // val can't be changed by overriding
     // age = 50; // getting error.

     // we can use variable without declaring the type

     var fatherName = "Shah Alam Bhuiyan";
     var fatherAge = age;


    println("Hello $username your age is $age");
 }