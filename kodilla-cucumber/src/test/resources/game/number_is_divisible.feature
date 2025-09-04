Feature:  Is it divisible? Everybody likes Summer

Scenario Outline: Number is divisible or isn't divisible

      Given Value of <number>
      When  I ask whether number is divisible
      Then  I should be told divisible <answer>
      Examples:
      |number|answer|
      |3|"Fizz"|
      |5|"Buzz"|
      |15|"FizzBuzz"|
      |7|"None"|





