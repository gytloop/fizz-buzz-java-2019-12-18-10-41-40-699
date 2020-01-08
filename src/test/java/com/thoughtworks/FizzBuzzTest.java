package com.thoughtworks;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Auther: yuantao.guo
 * @Date: 2020/1/8 19:56
 * @Description:
 */
public class FizzBuzzTest {
    @Test
    public void input_one_should_return_one() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(1);
        Assert.assertThat(result, CoreMatchers.equalTo("1"));
    }

    @Test
    public void input_three_multiple_should_return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(3);
        Assert.assertThat(result, CoreMatchers.equalTo("Fizz"));
    }

    @Test
    public void input_five_multiple_should_return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(5);
        Assert.assertThat(result, CoreMatchers.equalTo("Buzz"));
    }

    @Test
    public void input_seven_multiple_should_return_Whizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(7);
        Assert.assertThat(result, CoreMatchers.equalTo("Whizz"));
    }

    @Test
    public void input_three_and_five_multiple_and_contains_five_should_return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(15);
        Assert.assertThat(result, CoreMatchers.equalTo("Buzz"));
    }

    @Test
    public void input_three_and_seven_multiple_should_return_FizzWhizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(21);
        Assert.assertThat(result, CoreMatchers.equalTo("FizzWhizz"));
    }

    @Test
    public void input_seven_and_five_multiple_should_return_Whizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(70);
        Assert.assertThat(result, CoreMatchers.equalTo("Whizz"));
    }

    @Test
    public void input_seven_and_five_and_three_multiple_and_contains_five_should_return_BuzzWhizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(105);
        Assert.assertThat(result, CoreMatchers.equalTo("BuzzWhizz"));
    }

    @Test
    public void input_contains_three_should_return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(13);
        Assert.assertThat(result, CoreMatchers.equalTo("Fizz"));
    }

    @Test
    public void input_contains_three_should_ignore_rule23() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(30);
        Assert.assertThat(result, CoreMatchers.equalTo("Fizz"));
    }


    @Test
    public void input_contains_five_should_ignore_rule45() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(35);
        Assert.assertThat(result, CoreMatchers.equalTo("BuzzWhizz"));
    }

    @Test
    public void input_contains_seven_should_ignore_rule6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(75);
        Assert.assertThat(result, CoreMatchers.equalTo("Fizz"));
    }


}


