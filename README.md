Maven testng suites example

To run suite1 use
`mvn test -Dsuite=suite1.xml`

To run suite2 use
`mvn test -Dsuite=suite2.xml`

Note:
`mvn test` will run all tests by default,
you can change that by adding new maven profile and making it default
