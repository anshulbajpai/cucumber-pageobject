package helloworld


class HelloStepDefs extends StepDefs{

    var hello: Hello = null
    var result : String = null

    Given("""^I have a hello app with "([^"]*)"$"""){(greeting : String) =>
      hello = new Hello(greeting)
    }

    When("""^I ask it to say hi$"""){
      result = hello.sayHi
    }

    Then("""^it should answer with "([^"]*)"$"""){(greeting : String) =>
      result should equal(greeting)
    }
}
