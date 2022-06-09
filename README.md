# calculator-kata-java
Calculator Kata (Java)

## Prerequisites

- OpenJDK 17

## Instructions

Running build with automated tests:

```
./gradlew build
```

Running JaCoCo code coverage:

```
./gradlew jacocoTestReport
```

Running PIT mutation testing:

```
./gradlew pitest
```

## Reports

See the `build\reports` directory for the generated reports for test results, code coverage and mutation testing.

Reports:

- build\reports\tests
- build\reports\jacoco
- build\reports\pitest