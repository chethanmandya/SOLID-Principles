# SOLID-Principle

Single responsive principal :

Definition :
    Class should have one and only one reasons to change . Should have single responsibility to change.
    Single responsibility is the concept of a Class doing one specific thing (responsibility) and not trying to do more than it should, 
    which is also referred to as High Cohesion.

The following example is a TypeScript class that defines a Person, this class should not include email validation because that is not 
related with a person behaviour:

Class not following SRP
class Person {
    public name : string;
    public surname : string;
    public email : string;
    constructor(name : string, surname : string, email : string){
        this.surname = surname;
        this.name = name;
        if(this.validateEmail(email)) {
          this.email = email;
        }
        else {
            throw new Error("Invalid email!");
        }
    }
    validateEmail(email : string) {
        var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
        return re.test(email);
    }
    greet() {
        alert("Hi!");
    }
}

We can improve the class above by removing the responsibility of email validation from the Person class and creating a new Email class that will have that responsibility:

class Email {
    public email : string;
    constructor(email : string){
        if(this.validateEmail(email)) {
          this.email = email;
        }
        else {
            throw new Error("Invalid email!");
        }        
    }
    validateEmail(email : string) {
        var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
        return re.test(email);
    }
}

class Person {
    public name : string;
    public surname : string;
    public email : Email;
    constructor(name : string, surname : string, email : Email){
        this.email = email;
        this.name = name;
        this.surname = surname;
    }
    greet() {
        alert("Hi!");
    }
}

Making sure that a class has a single responsibility makes it per default also easier to see what it does and how you can extend/improve it.

How to Recognize a Break of the SRP?
I can give you several rules of thumb.

Class Has Too Many Dependencies
A constructor with too many input parameters implies many dependencies (hopefully you do inject dependencies). Another way too see many dependencies is by the test class.
If you need to mock too many objects, it usually means breaking the SRP.

Method Has Too Many Parameters
Same as the class’s smell. Think of the method’s parameters as dependencies.

How easy is it to name the class? If a class is difficult to name, it is probably doing too much.

How many public methods does the class have? 7+/-2 is a good rule of thumb. If the class has more than that, you should think about splitting it into several classes.

Are there cohesive groups of public methods used in separate contexts?

How many private methods or data members are there? If the class has a complex internal structure, you probably should refactor it so that the internals are packaged into separate smaller classes.

And the easiest rule of thumb: how big is the class? If you have a C++ header file containing a single class that is more than a couple of hundred lines long, you should probably split it up.
