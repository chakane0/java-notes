# Language Questions

## The JVM
1. Explain what the JVM is, and what its benefits and drawbacks are.


A java program is written by is, and when we execute it, it is compiled into bytecode. The bytecode is then executed by an interpreter called the JVM (typically written in c c++). 

As the bytecode is executed in the JVM, the Just in Time Compiler (JIT) converts and caches the bytecode into native code for faster execution. After the conversion is done, a processor will execute the instructions. 

The upside to this, is that all java programs can run on different platforms. The most you'll need to do in some cases is implement the interpreter and interface key libraries. 

A drawback is that the JVM can be a performance hit because of this added layer of compiling. However the JIT compilation greatly reduces this hit.


2. Describe a way which a program written in Java can leak memory.

* Objects no longer needed but are still referenced later in the program. 
* Static fields holding references

