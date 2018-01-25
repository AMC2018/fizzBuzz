package com.fizz.buzz;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class fizz {
    private String printOnWeb;

    @RequestMapping("/")


    public String buzz(){
        int x;
        for (x = 0; x <= 100; x++) {

            /* System.out.println(x);*/

            if (x % 3 == 0 && x % 5 == 0) {

                printOnWeb += String.valueOf(x) +"<br/>";

                System.out.println(x + " FizzBuzz ");

            } else if (x % 3 == 0) {

                printOnWeb += String.valueOf(x) +"<br/>";

                System.out.println(x + " Fizz ");

            } else if (x % 5 == 0) {

                printOnWeb += String.valueOf(x) +"<br/>" ;

                System.out.println(x + " Buzz ");

            } else
                {

                printOnWeb += String.valueOf(x) +"<br/>";

                System.out.println(x + " This number is not the multiple of 3 and 5 ");
            }


        }



        return printOnWeb;
        }
    }

