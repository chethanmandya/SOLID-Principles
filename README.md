# SOLID-Principle



SOLID Principles and Design Patterns plays a key role in achieving all of the below points.

SOLID Introduction 
1. SOLID principles are the design principles that enable us to manage most of the software design problems
2. The term SOLID is an acronym for five design principles intended to make software designs more understandable, flexible and maintainable
3. The principles are a subset of many principles promoted by Robert C. Martin
4. The SOLID acronym was first introduced by Michael Feathers

SOLID Acronym 
- S : Single Responsibility Principle (SRP) 
- O : Open closed Principle (OSP) 
- L :  Liskov substitution Principle (LSP) 
- I  :  Interface Segregation Principle (ISP) 
- D : Dependency Inversion Principle (DIP)

If we don’t follow SOLID Principles   
1. We end up with tight or strong coupling of the code with many other modules/applications
2. Tight coupling causes time to implement any new requirement, features or any bug fixes and some times it creates unknown issues
3. End up with a code which is not testable
4. End up with duplication of code
5. End up creating new bugs by fixing another bug
6. End up with many unknown issues in the application development cycle

Following SOLID Principles helps us to  
1. Achieve reduction in complexity of code
2. Increase readability, extensibility and maintenance
3. Reduce error and implement Reusability
4. Achieve Better testability
5. Reduce tight coupling

Solution to develop a successful application depends on  
Architecture : choosing an architecture is the first step in designing application based on the requirements. Example : MVC, WEBAPI, MVVM..etc
Design Principles : Application development process need to follow the design principles
Design Patterns : We need to choose correct design patterns to build the software


## Single responsive principal :

### Definition :
Class should have one and only one reasons to change . Should have single responsibility to change.
Single responsibility is the concept of a Class doing one specific thing (responsibility) and not trying to do more than it should, which is also referred to as High Cohesion.

### How to Recognize a Break of the SRP?
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

Hence we can say that Single Responsibility Principle achieves the motivation points that we have just discussed.


## Open / Closed principal :

### Definition : 

In object-oriented programming, the open/closed principle states that "software entities such as classes, modules, functions, etc. should be open for extension, but closed for modification"

1. Which means, any new functionality should be implemented by adding new classes, attributes and methods, instead of changing the current ones or existing ones.

2. Bertrand Meyer is generally credited for having originated the term open/closed principle and This Principle is considered by Bob Martin as “the most important principle of object-oriented design”.

### Implementation guidelines
1. The simplest way to apply OCP is to implement the new functionality on new derived (sub) classes that inherit the original class implementation.

2. Another way is to allow client  to access the original class with an abstract interface, 

3. So, at any given point of time when there is a requirement change instead of touching the existing functionality it’s always suggested to create new classes and leave the original implementation untouched.

### What if I do not follow Open closed principle during a requirement enhancement in the development process. 
 
In that case, we end up with the following disadvantages
 
1. If a class or a function always allows the addition of new logic, as a developer we end up testing the entire functionality along with the requirement.
 
2. Also, as a developer we need to ensure to communicate the scope of the changes to the Quality Assurance team in advance so that they can gear up for enhanced regression testing along with the feature testing. 
 
3. Step 2 above is a costly process to adapt for any organization 
 
4. Not following the Open Closed Principle breaks the SRP since the class or function might end up doing multiple tasks.
 
5. Also, if the changes are implemented on the same class, Maintenance of the class becomes difficult since the code of the class increases by thousands of unorganized lines. 
 
Hope the above counter facts helps in understanding on why we need to follow the open closed principle.

Please follow the uploaded repo code which addresses this implementation. 


## Liskov Substitution Principle

### Definition : 
Substitutability is a principle in object-oriented programming and it states that, in a computer program, if S is a Subtype of T, then objects of type T may be replaced with objects of type S 

1. Which means, Derived types must be completely substitutable for their base types

2. More formally, the Liskov substitution principle (LSP) is a particular definition of a subtyping relation, called (strong) behavioral subtyping


### Implementation guidelines :

In the process of development we should ensure that  

1. No new exceptions can be thrown by the subtype unless they are part of the existing exception hierarchy.

2. We should also ensure that Clients should not know which specific subtype they are calling, nor should they need to know that. The client should behave the same regardless of the subtype instance that it is given.

3. And last but not the least, New derived classes just extend without replacing the functionality of old classes

To illustrate LSP, we have created different employee classes to calculate bonus of the employee. From the employee perspective we have implemented the Open closed principle. In the main program, we have created Employee objects which consists of both permanent and contract employee. 

If you take a closer look at this program the Derived types which are Permanent and TemporaryEmployee is completely substituted with the base type employee class.

So, based on the Liskov substitution principle we have achieved LSP by ensuring that Derived types are completely substitutable for their base types.


Now Let’s assume that we need to have a Contract Employee as one of the employee category. now the point here is a contract employee is not eligible for any bonus calculation and post implementing the Employee class so, we end up throwing exception at the runtime in the caclculatebonus() method. This violates the Liskov Substitution Principle. 

Hence, Please follow the uploaded repo code which addresses this issue. 

## Interface Segregation Principle

### Definition :
1. The interface-segregation principle (ISP) states that "no client should be forced to depend on methods it does not use".
2. Which means, Instead of one fat interface many small interfaces are preferred based on groups of methods with each one serving one submodule.
3. The ISP was first used and formulated by Robert C. Martin while consulting for Xerox. 


###  Dependency Inversion Principle

### Definition :
Dependency Inversion Control, more formally referred to as the **Dependency Inversion Principle (DIP)**, is one of the five SOLID principles of object-oriented programming. It aims to reduce the coupling between high-level and low-level modules in a system by adhering to the following guidelines:

1. **High-level modules should not depend on low-level modules. Both should depend on abstractions.**
   - High-level modules typically encapsulate the core business logic or policies of an application.
   - Low-level modules usually deal with detailed implementation, such as database access, file handling, or communication with external services.
   - By introducing abstractions (e.g., interfaces or abstract classes), high-level modules are not tightly coupled to specific low-level implementations, making the system more flexible and easier to maintain.

2. **Abstractions should not depend on details. Details should depend on abstractions.**
   - Instead of high-level code being aware of specific implementation details, the details are designed to work according to a predefined abstraction.

### Practical Example
Consider a system where a **PaymentService** needs to process payments. Without dependency inversion:

```kotlin
class PaymentService {
    private val creditCardProcessor = CreditCardProcessor()
    
    fun processPayment() {
        creditCardProcessor.process()
    }
}

class CreditCardProcessor {
    fun process() {
        println("Processing credit card payment.")
    }
}
```

Here, `PaymentService` depends directly on `CreditCardProcessor`. If you need to replace `CreditCardProcessor` with another payment method, you'll need to modify the `PaymentService` class, which violates the principle.

With dependency inversion:

```kotlin
// Abstraction
interface PaymentProcessor {
    fun process()
}

// High-level module
class PaymentService(private val paymentProcessor: PaymentProcessor) {
    fun processPayment() {
        paymentProcessor.process()
    }
}

// Low-level modules
class CreditCardProcessor : PaymentProcessor {
    override fun process() {
        println("Processing credit card payment.")
    }
}

class PayPalProcessor : PaymentProcessor {
    override fun process() {
        println("Processing PayPal payment.")
    }
}

fun main() {
    // Choose the implementation of PaymentProcessor
    val paymentProcessor: PaymentProcessor = CreditCardProcessor() // or PayPalProcessor()

    // Inject the dependency into PaymentService
    val paymentService = PaymentService(paymentProcessor)

    // Use the service to process a payment
    paymentService.processPayment()
}
```

Now, the `PaymentService` depends on the abstraction `PaymentProcessor`, and you can easily swap `CreditCardProcessor` with `PayPalProcessor` or any other implementation without modifying the high-level code.

### Benefits of Dependency Inversion
- **Flexibility**: Makes it easier to substitute one implementation for another.
- **Testability**: High-level modules can be tested independently by mocking low-level dependencies.
- **Maintainability**: Changes to the implementation details of low-level modules do not affect high-level modules.
- **Scalability**: Encourages a clean architecture that supports the addition of new features.

**Advanced: Using a Dependency Injection Framework**
To dynamically decide which implementation of PaymentProcessor (PayPalProcessor or CreditCardProcessor) to use in a specific scenario, you can achieve this by using qualifiers in Hilt. Qualifiers allow you to differentiate between different implementations of the same abstraction.

To dynamically decide which implementation of `PaymentProcessor` (`PayPalProcessor` or `CreditCardProcessor`) to use in a specific scenario, you can achieve this by using **qualifiers** in Hilt. Qualifiers allow you to differentiate between different implementations of the same abstraction.

Here’s how you can set it up:

---

### Step-by-Step Solution

#### 1. **Define Qualifiers**
Create custom annotations to differentiate between implementations.

```kotlin
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class CreditCard

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class PayPal
```

---

#### 2. **Provide Different Implementations**
Use these qualifiers to bind different implementations in your Hilt module.

```kotlin
@InstallIn(SingletonComponent::class)
@Module
object PaymentModule {

    @CreditCard
    @Provides
    fun provideCreditCardProcessor(): PaymentProcessor {
        return CreditCardProcessor()
    }

    @PayPal
    @Provides
    fun providePayPalProcessor(): PaymentProcessor {
        return PayPalProcessor()
    }
}
```

---

#### 3. **Inject the Required Implementation**
You can now inject specific implementations using the qualifiers.

- **Injecting into the Repository**

```kotlin
class PaymentRepository @Inject constructor(
    @CreditCard private val creditCardProcessor: PaymentProcessor,
    @PayPal private val payPalProcessor: PaymentProcessor
) {
    fun executePayment(usingPayPal: Boolean): String {
        return if (usingPayPal) {
            payPalProcessor.processPayment()
        } else {
            creditCardProcessor.processPayment()
        }
    }
}
```

---

#### 4. **Modify the ViewModel to Handle Scenarios**
Pass the required scenario to the repository from the ViewModel.

```kotlin
@HiltViewModel
class PaymentViewModel @Inject constructor(
    private val paymentRepository: PaymentRepository
) : ViewModel() {

    private val _paymentStatus = MutableLiveData<String>()
    val paymentStatus: LiveData<String> = _paymentStatus

    fun processPayment(usingPayPal: Boolean) {
        _paymentStatus.value = paymentRepository.executePayment(usingPayPal)
    }
}
```

---

#### 5. **Pass the Scenario from the UI**
In the UI, you decide which processor to use based on the user's action or a specific condition.

```kotlin
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: PaymentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.paymentStatus.observe(this) { status ->
            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
        }

        // Example: Trigger payment using PayPal
        findViewById<Button>(R.id.paypalButton).setOnClickListener {
            viewModel.processPayment(usingPayPal = true)
        }

        // Example: Trigger payment using Credit Card
        findViewById<Button>(R.id.creditCardButton).setOnClickListener {
            viewModel.processPayment(usingPayPal = false)
        }
    }
}
```

---

### Alternative: Passing Dependencies at Runtime
If you want to decide entirely at runtime and avoid injecting multiple processors into the repository, you can inject a factory or delegate the decision to a higher-level component like a factory method.

#### Using a Factory Pattern with Hilt
1. **Create a Factory:**

```kotlin
class PaymentProcessorFactory @Inject constructor(
    @CreditCard private val creditCardProcessor: PaymentProcessor,
    @PayPal private val payPalProcessor: PaymentProcessor
) {
    fun getProcessor(usingPayPal: Boolean): PaymentProcessor {
        return if (usingPayPal) payPalProcessor else creditCardProcessor
    }
}
```

2. **Use the Factory in the Repository:**

```kotlin
class PaymentRepository @Inject constructor(
    private val processorFactory: PaymentProcessorFactory
) {
    fun executePayment(usingPayPal: Boolean): String {
        return processorFactory.getProcessor(usingPayPal).processPayment()
    }
}
```

---

### Summary

You can handle dynamic scenarios with **qualifiers** and inject both implementations into the `Repository`, or use a **factory pattern** to determine the implementation at runtime. Both approaches align with the **Dependency Inversion Principle**, maintaining flexibility and testability.

