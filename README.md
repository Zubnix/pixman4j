pixman4j is the pixman library made available for Java. SWiG is used to generate the bindings, based on the SWiG configuration files. The generated library is still very rudimentary but should work. I invite everybody using this library to improve the generation of the Java code by custimizing and adapting the SWiG configuration files and sending me a pull request.Improvements consist of manually mapping methods that use C pointers and arrays to either Java native ByteBuffers or Java primitive arrays depending on performance and use-case of the pixman method. This library was originaly created to be used by the Trinity Desktop Shell, see https://github.com/Zubnix/trinityshell  
  
Currently pixman4j expects the following headers to be present during code generation:
- pixman-1/pixman.h
  
pixman4j links the generated native jni library to the following pixman libraries during compilation:
- pixman-1
