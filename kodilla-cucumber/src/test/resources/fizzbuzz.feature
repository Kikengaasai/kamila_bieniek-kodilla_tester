Feature:  Is it Fuzz, Buzz or FuzzBuzz?

  Scenario Outline: Check result for number
    Given I have number <number>
    When I call the fizzBuzz() function
    Then I should get <result>
    Examples:
      | number | result     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 2      | "Nope"     |