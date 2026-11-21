# Core Java Roadmap & Daily Coding Plan

**Period:** 21 November – 31 December 2026  
**Daily slot:** 9:00 PM – 11:00 PM (2 hours)  
**Rule:** Every day must produce working code. Reading alone does not count as completing a day.

## How to use the repository

- Existing examples: `learnings/Java_all_lec/`
- This roadmap: `JAVA_ROADMAP.md`
- Add new solutions under `practice/<topic>/` (create a topic folder when you start it).
- Use descriptive class names and one public class per file.
- Do not mark a topic complete until you can solve its exercises without copying.

## Topics already represented in the current files

These topics have examples, but should still be revised and tested:
- Variables, data types, operators and precedence
- if/else, switch, loops, break/continue
- Scanner input and simple console programs
- Arrays and basic array problems
- Introductory String handling
- Some classes/objects, inheritance, abstraction and interfaces
- Basic exception handling

## Important Core Java topics still to practise/add

1. **Methods:** parameters, return values, method overloading, varargs, recursion
2. **Class design:** constructors, constructor chaining, `this`, `super`, initialization blocks
3. **Class modifiers:** `static`, `final`, access modifiers, packages
4. **OOP depth:** encapsulation, immutable classes, inheritance, overriding, runtime polymorphism, casting and `instanceof`
5. **Object contract:** `toString()`, `equals()`, `hashCode()`
6. **Strings and utility types:** String immutability, StringBuilder, wrapper classes, autoboxing/unboxing, enums
7. **Nested types:** static nested, inner, local and anonymous classes
8. **Generics:** generic classes/methods, bounds and wildcards
9. **Collections:** List, Set, Map, Queue, Deque, Iterator, sorting, Comparable and Comparator
10. **Exceptions:** checked/unchecked, custom exceptions, propagation, try-with-resources
11. **File handling:** byte/character streams, buffering, Path and Files (NIO)
12. **Useful APIs:** regex, Date/Time API
13. **Modern Java:** functional interfaces, lambdas, method references, Streams, collectors, Optional
14. **Runtime foundations:** JVM, stack/heap, garbage collection, class loading
15. **Multithreading:** Thread, Runnable, Callable, synchronization, locks, volatile, ExecutorService, Future
16. **Modern language features:** records, sealed classes, switch expressions, text blocks
17. **Database programming:** JDBC, PreparedStatement, CRUD, transactions, batch operations
18. **Integration practice:** combine OOP, collections, exceptions, file handling and JDBC in a console project

## Daily plan (tick only after coding and testing)

| Date | Coding focus | Required output |
|---|---|---|
| Nov 21 | Methods, parameters, return values, overloading | 8 method problems |
| Nov 22 | Constructors, constructor chaining, this, super | Student and BankAccount classes |
| Nov 23 | static, final, initialization blocks, varargs | Utility class + 6 exercises |
| Nov 24 | Access modifiers and packages | Split a small program into packages |
| Nov 25 | Encapsulation and immutable classes | Validated BankAccount class |
| Nov 26 | Inheritance and constructor execution | Employee/Manager hierarchy |
| Nov 27 | Overriding, polymorphism, casting, instanceof | Payment method polymorphism |
| Nov 28 | Abstract classes and interfaces | Shape and Payment implementations |
| Nov 29 | Object class, equals, hashCode, toString | Correct Student equality implementation |
| Nov 30 | String immutability, StringBuilder, formatting | 8 string manipulation problems |
| Dec 01 | Wrapper classes, boxing/unboxing, enums | Order status and conversion exercises |
| Dec 02 | Nested, inner and anonymous classes | Small callback/event example |
| Dec 03 | Recursion and problem-solving patterns | Factorial, Fibonacci, digit and array recursion |
| Dec 04 | Generics: classes, methods, bounds, wildcards | Generic Box and generic utility methods |
| Dec 05 | List, ArrayList, LinkedList | CRUD operations on student records |
| Dec 06 | Set: HashSet, LinkedHashSet, TreeSet | Remove duplicates and compare ordering |
| Dec 07 | Map: HashMap, LinkedHashMap, TreeMap | Word-frequency counter |
| Dec 08 | Queue, Deque and stack-style problems | Queue and bracket-checking exercises |
| Dec 09 | Iterator, Comparable, Comparator, sorting | Sort employees by name and salary |
| Dec 10 | Checked/unchecked and custom exceptions | Bank withdrawal validation |
| Dec 11 | File I/O: byte and character streams | Read/write text and copy a file |
| Dec 12 | Buffering, Path and Files (NIO) | File search and line counter |
| Dec 13 | Regular expressions and Date/Time API | Validate email/date and calculate age |
| Dec 14 | Functional interfaces, lambda, method references | Sort/filter with lambdas |
| Dec 15 | Streams: filter, map, reduce, collect | 10 collection-processing problems |
| Dec 16 | Collectors, grouping and Optional | Group transactions and handle missing values |
| Dec 17 | Annotations and basic reflection | Inspect class and method metadata |
| Dec 18 | JVM basics, stack/heap, GC and class loading | Small memory/reference experiments |
| Dec 19 | Thread, Runnable and Callable | Run independent tasks concurrently |
| Dec 20 | Race conditions, synchronized, locks, volatile | Thread-safe counter |
| Dec 21 | ExecutorService and Future | Submit and collect multiple tasks |
| Dec 22 | CompletableFuture and async composition | Combine two asynchronous results |
| Dec 23 | Records, sealed classes, switch expressions, text blocks | Model immutable data and process commands |
| Dec 24 | JDBC connection and PreparedStatement | Connect Java to a local database |
| Dec 25 | JDBC CRUD, transactions and batch updates | Complete database CRUD program |
| Dec 26 | Console project: OOP + collections + exceptions | Build a Bank Management System |
| Dec 27 | File persistence and validation in the project | Save/load records and handle invalid input |
| Dec 28 | JDBC integration in the project | Persist users/accounts/transactions |
| Dec 29 | Mixed Core Java coding set 1 | Solve 10 timed problems |
| Dec 30 | Mixed Core Java coding set 2 | Solve 10 timed problems and fix bugs |
| Dec 31 | Final assessment and cleanup | Finish, run and explain the mini project |

## Daily 2-hour routine

- **9:00–9:15 PM:** Re-solve yesterday's problem without looking at the solution.
- **9:15–10:40 PM:** Write today's programs yourself. Target 5–8 small problems or the day's project task.
- **10:40–11:00 PM:** Run tests, fix errors, and write 3 notes: what failed, why, and how you fixed it.

## Completion criteria

A day is complete only when:
- The code compiles and runs.
- You have tested normal and edge-case inputs.
- You can explain the logic without reading copied code.
- Your solution is committed to this repository under the correct topic folder.

## Scope and priorities

For a Java backend developer, prioritize OOP, collections, generics, exceptions, I/O, lambdas/Streams, concurrency and JDBC. GUI libraries, applets, RMI, JMX and Java modules are not part of this core practice schedule. Learn advanced runtime topics after you can confidently write ordinary Java programs.

## References

- [Dev.java – current Java learning tutorials](https://dev.java/learn/)
- [Oracle Java language tutorial](https://docs.oracle.com/javase/tutorial/java/)
- [Oracle JDBC tutorial](https://docs.oracle.com/javase/tutorial/jdbc/)
