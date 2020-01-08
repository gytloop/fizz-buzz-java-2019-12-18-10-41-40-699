package com.thoughtworks;

/**
 * @Auther: yuantao.guo
 * @Date: 2020/1/8 19:57
 * @Description:
 */
public class FizzBuzz {
    public String say(int num) {
        String result = "";
        if (String.valueOf(num).contains("3") && (!String.valueOf(num).contains("5") || String.valueOf(num).contains("7"))) {
            return "Fizz";
        }
        if (num % 3 == 0 && (!String.valueOf(num).contains("5") || String.valueOf(num).contains("7"))) {
            result += "Fizz";
        }
        if (num % 5 == 0 && !String.valueOf(num).contains("7")) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if ("".equals(result)) {
            result = String.valueOf(num);
        }
        return result;
    }
}
