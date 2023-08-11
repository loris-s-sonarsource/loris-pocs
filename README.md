# loris-pocs

## Java

A simple PicoCLI client, template to test diverse vulnerable code and exploit
them.

``` bash
# How to
cd java/templates/cli
mvn clean install

java -jar ./target/cli-1.jar test -i loris

# Utils
$ type mvn
mvn is a function
mvn ()
{
    sudo docker run -it --rm \
                    -v "$(pwd)":/usr/src/app \
                    -v maven-repo:/root/.m2 \
                    -w /usr/src/app \
                    maven:3-eclipse-temurin-11 \
                    mvn $@
}
$ type java
java is a function
java ()
{
    sudo docker run -it --rm \
                    -v "$(pwd)":/usr/src/app \
                    -w /usr/src/app \
                    maven:3-eclipse-temurin-11 \
                    java $@
}
```


## Csharp

A small Kestrel server.

```csharp

dotnet new web -o TodoApi
cd TodoApi
code -r ../TodoApi
`` 
