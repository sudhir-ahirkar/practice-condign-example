package practice;

import com.code.java8.concept.test.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapexample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Sudhir", 32, Arrays.asList("897454", "587874", "9765489")),
                new User("Sagar", 35, Arrays.asList("3665454", "587", "9789")),
                new User("Roshan", 30, Arrays.asList("54", "58741", "9789")),
                new User("Rajesh", 38, Arrays.asList("895454", "78916587", "9754489"))
        );
        Optional<String> OptionalPhone = users.stream().map(user->user.getPhones()).flatMap(phones->phones.stream()).filter(phone->phone.equals("54")).findAny();
        String phoneVal = users.stream().map(user->user.getPhones()).flatMap(phones->phones.stream()).filter(phone->phone.equals("54")).findAny().get();
       System.out.println("phoneVal====>"+phoneVal);
       // if not found then throw exception
        String phoneVal2 = users.stream().map(user->user.getPhones()).flatMap(phones->phones.stream()).filter(phone->phone.equals("78916587")).findAny().orElseThrow(()->new RuntimeException("Requested phone not found"));
        System.out.println("phoneVal2====>"+phoneVal2);
       // if not found then return some default value
        String phoneVal3 = users.stream().map(user->user.getPhones()).flatMap(phones->phones.stream()).filter(phone->phone.equals("543")).findAny().orElse("default value is "+88888888);
        System.out.println("phoneVal3====>"+phoneVal3);

//        String phoneVal4 = users.stream().map(user->user.getPhones()).flatMap(phones->phones.stream()).filter(phone->phone.equals("543")).findAny().orElseGet("1245");
//        System.out.println("phoneVal4====>"+phoneVal4);

        //check if value is present or not , if present then print
        OptionalPhone.ifPresent(System.out::println);


    }
}
