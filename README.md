# SOLID-Principle

## Single responsive principal :

### Definition :
Class should have one and only one reasons to change . Should have single responsibility to change.
Single responsibility is the concept of a Class doing one specific thing (responsibility) and not trying to do more than it should, which is also referred to as High Cohesion.

How to Recognize a Break of the SRP?
I can give you several rules of thumb.
- Class Has Too Many Dependencies.
- A constructor with too many input parameters implies many dependencies (hopefully you do inject dependencies). Another way too see many dependencies is by the test class.
If you need to mock too many objects, it usually means breaking the SRP.
- Method Has Too Many Parameters
- Same as the class’s smell. Think of the method’s parameters as dependencies.
- How easy is it to name the class? If a class is difficult to name, it is probably doing too much.
- How many public methods does the class have? 7+/-2 is a good rule of thumb. If the class has more than that, you should think about splitting it into several classes.
- Are there cohesive groups of public methods used in separate contexts?
- How many private methods or data members are there? If the class has a complex internal structure, you probably should refactor it so that the internals are packaged into separate smaller classes.
- And the easiest rule of thumb: how big is the class? If you have a C++ header file containing a single class that is more than a couple of hundred lines long, you should probably split it up.



## Open / Closed principal :

### Definition :
Modules should be open for extension, but closed for modification.
Software entities (class, method, modules or functions) should be open for extension and
closed for modification.
Once the software entity is finished it should never be changed unless it has a bug in it.
You should apply this principal if you couldn’t extend class without altering code .

Let’s take example this, let’s say you have class called parser, it has to parse different types of server
response, the response could be parsing XML, json or CSV.


