# all-systems-go
Facilitator for running JUnit 5 nio tests against all operating system implementations

## example

```
class ExampleTest {

    @AllSystemsTest
    void testAllSystems(FileSystem fileSystem) {
        // run your test like normal, knowing that it'll be ran against mac, windows, and unix file system configurations
    }

}
```
